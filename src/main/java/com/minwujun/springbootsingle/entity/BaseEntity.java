package com.minwujun.springbootsingle.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.minwujun.springbootsingle.enums.YNEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BaseEntity implements Serializable {
    protected String id;

    @TableField("create_id")
    protected String createId;

    @TableField("create_time")
    protected Date createTime;

    @TableField("update_id")
    protected String updateId;

    @TableField("update_time")
    protected Date updateTime;

    @TableField("delete_status")
    protected YNEnum deleteStatus;
}
