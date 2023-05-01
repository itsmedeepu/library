package com.deepak.library.config;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class MysqlDbConfig {

	@Bean
	public LocalSessionFactoryBean getFactoryBean() {

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(getProperties());
		factoryBean.setPackagesToScan("com.deepak.library.entity");
		return factoryBean;
	}

	@Bean
	public DataSource getDataSource() {

		DataSource source = new DataSource();

		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/library");
		source.setUsername("root");
		source.setPassword("root");

		return source;

	}

	public static Properties getProperties() {

		Properties pro = new Properties();
		pro.setProperty("hibernate.show_sql", "true");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");

		return pro;

	}

}
