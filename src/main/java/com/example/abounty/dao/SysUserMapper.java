package com.example.abounty.dao;

import com.example.abounty.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户模块接口
 * @author 刘铖
 * @since 2018-04-08
 **/

public interface SysUserMapper {
    /**
     * 根据id获取用户信息
     * @param id 用户id
     * @return SysUser
     *
     */
    SysUser getUserById(@Param("id")int id);

}
