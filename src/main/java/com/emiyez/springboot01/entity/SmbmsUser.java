package com.emiyez.springboot01.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.List;

@Data
public class SmbmsUser {
    @TableId(value = "id")
    private Long sid; //id
    @TableField(value = "userCode")
    private String uCode; //用户编码
    private String userName; //用户名称
    private String userPassword; //用户密码
    private Integer gender; //性别
    private String birthday; //出生日期
    private String phone; //电话
    private String address; //地址
    private Integer userRole; //用户角色
    private Integer createdBy; //创建者
    private String creationDate; //创建时间
    private Integer modifyBy; //更新者
    private String modifyDate; //更新时间
//    private List<SmbmsUser> Addr;

    @TableLogic
    private int isDel;//是否删除 0代表没删除 1代表已经删除

}
