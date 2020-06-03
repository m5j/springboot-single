package com.minwujun.springbootsingle;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.minwujun.springbootsingle.entity.User;
import com.minwujun.springbootsingle.enums.YNEnum;
import com.minwujun.springbootsingle.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by minwujun on 2020/6/3
 */
public class UserTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("delete_status", YNEnum.N).like("nick_name", "神秘");
        List<User> users = userMapper.selectList(queryWrapper);
        Assert.assertEquals(1L, users.size());
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void selectByIdTest() {
        User user = userMapper.selectById("bbc1460f-a561-11ea-b225-04d4c48cade4");
        Assert.assertNotNull(user);
        System.out.println(user);
    }
}
