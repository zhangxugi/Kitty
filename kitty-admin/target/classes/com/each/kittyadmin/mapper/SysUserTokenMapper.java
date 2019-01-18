package com.each.kittyadmin.mapper;

import com.each.kittyadmin.pojo.SysUserToken;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SysUserTokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserToken record);

    int insertSelective(SysUserToken record);

    SysUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserToken record);

    int updateByPrimaryKey(SysUserToken record);
}