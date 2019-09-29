package com.cummins.config;



import javax.sql.DataSource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import com.cummins.config.properties.DruidProperties;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * 主数据源
 */
@Configuration
@MapperScan(basePackages = { "com.cummins.bims.dao", "com.cummins.printer.dao"}, sqlSessionTemplateRef = "baseSqlSessionTemplate")
public class BaseDataSourceConfig {


	@Bean(name = "baseDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.base")
	@Primary
	public DataSource setDataSource(DruidProperties druidProperties) {

		//return DataSourceBuilder.create().build();
		DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
		return druidProperties.dataSource(dataSource);
	}

	@Bean(name = "baseTransactionManager")
	@Primary
	public DataSourceTransactionManager setTransactionManager(@Qualifier("baseDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
		//return new DruidDataSource();
	}

	@Bean(name = "baseSqlSessionFactory")
	@Primary
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("baseDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/cummins/**/*.xml"));
		return bean.getObject();
	}

	@Bean(name = "baseSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("baseSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
