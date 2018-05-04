package com.example.abounty.service;

import com.example.abounty.dao.SysUserMapper;
import com.example.abounty.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 刘铖
 * @since 2018-04-08
 **/
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser getUserById(int id) {
        return sysUserMapper.getUserById(id);
    }
}
