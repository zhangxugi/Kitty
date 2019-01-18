package com.each.kittyadmin.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;import javax.sql.DataSource;

/**
 * @ProjectName: kitty-admin
 * @Package: com.each.kittyadmin.config
 * @Description: java类作用描述
 * @Author: zhangxu
 * @CreateDate: 2019/1/14 14:19
 * @UpdateUser: zhangxu
 * @UpdateDate: 2019/1/14 14:19
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Configuration
@MapperScan("com.each.kittyadmin.mapper")    // 扫描DAO
public class MybatisConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.each.kittyadmin.pojo.*");    // 扫描Model

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));    // 扫描映射文件

        return sessionFactory.getObject();
    }
}