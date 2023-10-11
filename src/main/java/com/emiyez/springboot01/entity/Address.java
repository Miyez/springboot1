package com.emiyez.springboot01.entity;/*
 *@title SmbmsAddress
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 17:05
 */

import lombok.Data;

@Data

public class Address {
    private Long id;//主键ID
    private String contact;//联系人姓名
    private String addressDesc;//收货地址明细
    private String postCode;//邮编
    private String tel;//联系人电话
    private Long createdBy;//创建者
    private String creationDate;//创建时间
    private Long modifyBy;//修改者
    private String modifyDate;//修改者
    private Long userId;//修改者
}
