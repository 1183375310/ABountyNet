package com.example.abounty.controller;

import com.example.abounty.domain.SysUser;
import com.example.abounty.service.RedisService;
import com.example.abounty.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 刘铖
 * @since 2018-04-03
 **/
@RestController
@RequestMapping("/")
public class IndexController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private RedisService redisService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @ApiOperation(value = "获取用户信息", httpMethod = "GET",notes = "getUserById")
    @RequestMapping (value = "/getUserById", method = RequestMethod.GET)
    public SysUser getUserById(
            @ApiParam(required = true, name = "id", value = "id")
            @RequestParam String id){

        logger.info("进行了查询");
        SysUser user=sysUserService.getUserById(Integer.valueOf(id));
        redisService.set("user",user);
        redisService.set("username",user.getName());
        return  user;
    }

    @ApiOperation(value = "获取redis信息", httpMethod = "GET",notes = "getRedisInfo")
    @RequestMapping (value = "/getRedisInfo", method = RequestMethod.GET)
    public String getRedisInfo(){

       String username= redisService.get("username").toString();
       return  username;
    }

    @RequestMapping("/index")
    public String index() {

        return "index";
    }
}
