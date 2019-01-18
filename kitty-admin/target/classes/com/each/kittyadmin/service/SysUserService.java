package com.each.kittyadmin.service;

import com.each.kittyadmin.mapper.SysUserMapper;
import com.each.kittyadmin.pojo.SysUser;
import com.each.kittycore.page.PageRequest;
import com.each.kittycore.page.PageResult;
import com.each.kittycore.page.PageUtils;
import com.each.kittycore.service.CurdService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.service
 * @Description: 用户业务层
 * @Author: zhangxu
 * @CreateDate: 2019/1/12 17:31
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/12 17:31
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Service
public class SysUserService implements CurdService<SysUser> {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int save(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int update(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysUser record) {
        return sysUserMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysUser> records) {
        for(SysUser record:records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysUser findById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageQuery
     * @return
     */
    private PageInfo<SysUser> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysUser> sysMenus = sysUserMapper.selectAll();
        return new PageInfo<SysUser>(sysMenus);
    }

    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
