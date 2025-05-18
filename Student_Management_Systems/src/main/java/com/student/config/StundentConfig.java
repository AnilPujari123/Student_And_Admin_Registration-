package com.student.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages = "com/student")
@EnableJpaRepositories("com.student.repository")
public class StundentConfig {
	@Bean
	public InternalResourceViewResolver  internalResourceViewResolverBean() {
		InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/"); //to show the 
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	@Bean(name = "entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean()
	{
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("Student_Management_Systems");
		
		return localEntityManagerFactoryBean;
	}
	@Bean(name = "transactionManager")
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
		
	}
}
