package com.each.kittyadmin.controller;

import com.each.kittyadmin.service.SysUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.controller
 * @Description: 用户restful 接口
 * @Author: zhangxu
 * @CreateDate: 2019/1/12 17:33
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/12 17:33
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Api(value = "用户控制器")
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
     private SysUserService sysUserService;

    @ApiOperation(value = "获取用户信息", notes = "根据用户ID获取用户信息")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "Long")
    @GetMapping(value = "/findByUserId")
    public Object findByUserId(@RequestParam Long userId) {
        return sysUserService.findById(userId);

    }

    @GetMapping(value = "/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}