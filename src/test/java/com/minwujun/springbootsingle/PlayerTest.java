package com.minwujun.springbootsingle;

import com.minwujun.springbootsingle.entity.Player;
import com.minwujun.springbootsingle.mapper.PlayerMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by minwujun on 2020/6/3
 */
public class PlayerTest extends BaseTest {

    @Autowired
    private PlayerMapper playerMapper;

    @Test
    public void test1() {
        List<Player> players = playerMapper.selectList(null);
        for (Player item : players) {
            System.out.println(item);
        }
    }
}
