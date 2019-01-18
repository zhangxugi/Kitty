package com.each.kittyadmin.service;

import com.each.kittyadmin.mapper.SysMenuMapper;
import com.each.kittyadmin.pojo.SysMenu;
import com.each.kittycore.page.PageRequest;
import com.each.kittycore.page.PageResult;
import com.each.kittycore.page.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.service
 * @Description: java类作用描述
 * @Author: zhangxu
 * @CreateDate: 2019/1/16 14:27
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/16 14:27
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Service
public class SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;


    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageQuery
     * @return
     */
    private PageInfo<SysMenu> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysMenu> sysMenus = sysMenuMapper.selectPage();
        return new PageInfo<SysMenu>(sysMenus);
    }
}
