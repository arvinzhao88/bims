
package com.cummins.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * erp数据源配置
 */
@Configuration
@MapperScan(basePackages = { "com.cummins.erp.dao"}, sqlSessionTemplateRef = "erpSqlSessionTemplate")
public class BaseDataSourceViceConfigOrcl {

    @Bean(name = "erpDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.erp")
    public DataSource setDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "erpTransactionManager")
    public DataSourceTransactionManager setTransactionManager(@Qualifier("erpDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "erpSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("erpDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mapper/cummins/**/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "erpSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(
            @Qualifier("erpSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}