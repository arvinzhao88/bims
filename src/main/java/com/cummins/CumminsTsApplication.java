package com.cummins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableScheduling
/*@ComponentScan(basePackages = {"com.cummins.controller"})*/
@MapperScan({"com.cummins.*.dao"})
public class CumminsTsApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CumminsTsApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(CumminsTsApplication.class, args);
	}

	@PostConstruct
	void setDefaultTimeZone() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
	}
}
