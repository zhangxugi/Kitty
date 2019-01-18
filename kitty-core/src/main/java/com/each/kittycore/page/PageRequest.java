package com.each.kittycore.page;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.page
 * @Description: 分页请求封装类
 * @Author: zhangxu
 * @CreateDate: 2019/1/16 14:29
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/16 14:29
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
