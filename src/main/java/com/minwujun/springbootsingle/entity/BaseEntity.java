package com.minwujun.springbootsingle.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.minwujun.springbootsingle.enums.YNEnum;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.LocalDateTimeTypeHandler;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
public class BaseEntity implements Serializable {
//    @TableField("id")
    protected String id;

//    @TableField("create_id")
    protected String createId;

//    @TableField(value = "create_time")
    protected LocalDateTime createTime;

//    @TableField("update_id")
    protected String updateId;

//    @TableField(value = "update_time")
    protected LocalDateTime updateTime;

//    @TableField("delete_status")
    protected YNEnum deleteStatus;
}
