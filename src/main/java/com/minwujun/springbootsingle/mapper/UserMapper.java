package com.minwujun.springbootsingle.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minwujun.springbootsingle.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by minwujun on 2020/6/3
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
