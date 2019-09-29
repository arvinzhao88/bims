package com.cummins.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.cummins.config.properties.DruidProperties;
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
 * 从数据源配置
 */
@Configuration
@MapperScan(basePackages = { "com.cummins.slave.dao","com.cummins.contact.dao","com.cummins.wx.dao","com.cummins.bims.dao"}, sqlSessionTemplateRef = "baseSlaveSqlSessionTemplate")
public class BaseDataSourceViceConfig {



	@Bean(name = "slaveDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.base1")
	public DataSource setDataSource(DruidProperties druidProperties) {
//		return new DruidDataSource();
		DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
		return druidProperties.dataSource(dataSource);
	}

	@Bean(name = "mesTransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("slaveDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "slaveSqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/cummins/**/*.xml"));
		return bean.getObject();
	}

	@Bean(name = "baseSlaveSqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("slaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
