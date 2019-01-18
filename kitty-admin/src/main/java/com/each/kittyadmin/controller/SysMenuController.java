package com.each.kittyadmin.controller;

import com.each.kittyadmin.service.SysMenuService;
import com.each.kittycore.http.HttpResult;
import com.each.kittycore.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.controller
 * @Description: java类作用描述
 * @Author: zhangxu
 * @CreateDate: 2019/1/16 14:34
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/16 14:34
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@RestController
@RequestMapping("menu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;


    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageQuery) {
        return HttpResult.ok(sysMenuService.findPage(pageQuery));
    }
}