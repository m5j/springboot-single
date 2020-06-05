package com.minwujun.springbootsingle.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.minwujun.springbootsingle.enums.YNEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author minwujun
 * @since 2020-06-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_player")
public class Player extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 外键，关联t_user.id
     */
    private String userId;

    /**
     * 个人简介
     */
    private String briefIntroduction;

    /**
     * 照片地址
     */
    private String photoUrl;

    /**
     * 状态
     */
    private YNEnum status;

}
