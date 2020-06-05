package com.minwujun.springbootsingle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.minwujun.springbootsingle.entity.Player;
import com.minwujun.springbootsingle.mapper.PlayerMapper;
import com.minwujun.springbootsingle.service.IPlayerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author minwujun
 * @since 2020-06-04
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements IPlayerService {

}
