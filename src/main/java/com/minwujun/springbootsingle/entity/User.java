package com.minwujun.springbootsingle.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.minwujun.springbootsingle.enums.YNEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_user")
public class User extends BaseEntity {
//    @TableField("account")
    private String account;

//    @TableField("password")
    private String password;

//    @TableField("nick_name")
    private String nickName;

//    @TableField("email")
    private String email;

//    @TableField("phone")
    private String phone;

//    @TableField("status")
    private YNEnum status;
}
