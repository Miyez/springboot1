package com.emiyez.springboot01.log;/*
 *@title Log
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 15:21
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    String value() default "";
}
