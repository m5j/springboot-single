package com.minwujun.springbootsingle;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by minwujun on 2020/6/3
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    @Before
    public void beforeFunc() {
        log.info("--------------------------测试开始--------------------------");
    }

    @After
    public void afterFunc() {
        log.info("--------------------------测试结束--------------------------");
    }

}
