package com.each.kittycore.page;

import com.github.pagehelper.PageInfo;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.page
 * @Description: java类作用描述
 * @Author: zhangxu
 * @CreateDate: 2019/1/16 14:31
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/16 14:31
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class PageUtils {
    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param page
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
