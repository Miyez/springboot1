package com.emiyez.springboot01.log;/*
 *@title LogAspect
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 15:22
 */

import com.emiyez.springboot01.entity.SysLog;
import com.emiyez.springboot01.mapper.SysLogMapper;
import com.emiyez.springboot01.utils.HttpContextUtils;
import com.emiyez.springboot01.utils.IPUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    @Resource
    private SysLogMapper sysLogMapper;
    //切入点，指定当使用Log注解时进入环绕增强
    @Pointcut("@annotation(com.emiyez.springboot01.log.Log)")
    public void pointcut() {}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) {

        try {
            long beginTime = System.currentTimeMillis();//开始执行时间

            Object result = point.proceed();//执行方法
            // 执行时长(毫秒)
            long time = System.currentTimeMillis() - beginTime;
            //实例化日志类
            SysLog sysLog = new SysLog();
            sysLog.setUsername("Miyez");//模拟一个用户名  实际可以从session中获取
            sysLog.setTime((int) time);//执行时长(毫秒)
            // 获取request
            HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
            // 设置IP地址
            sysLog.setIp(IPUtils.getIpAddr(request));

            MethodSignature signature = (MethodSignature) point.getSignature();
            Method method = signature.getMethod();
            Log logAnnotation = method.getAnnotation(Log.class);
            if (logAnnotation != null) {
                // 注解上的描述
                sysLog.setOperation(logAnnotation.value());
            }

            // 请求的方法名
            String className = point.getTarget().getClass().getName();
            String methodName = signature.getName();
            sysLog.setMethod(className + "." + methodName + "()");


            // 请求的方法参数值
            Object[] args = point.getArgs();
            // 请求的方法参数名称
            LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
            String[] paramNames = u.getParameterNames(method);
            if (args != null && paramNames != null) {
                String params = "";
                for (int i = 0; i < args.length; i++) {
                    params += "  " + paramNames[i] + ": " + args[i];
                }
                sysLog.setParams(params);
            }


            // 保存系统日志
            sysLogMapper.saveSysLog(sysLog);

            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }

}
