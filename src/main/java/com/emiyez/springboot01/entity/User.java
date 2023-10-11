package com.emiyez.springboot01.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class User {
    @TableId(value = "userId")
    private Long userId; //id
    private String userName; //用户名称
    private String userPassword; //用户密码
    private Integer sex; //性别
    private Integer addr; //性别
//    private List<SmbmsUser> Addr;

    @TableLogic
    private int isDel;//是否删除 0代表没删除 1代表已经删除

}
