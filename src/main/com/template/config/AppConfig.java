package com.template.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.template.*")
@PropertySource("classpath:persistence-db.properties")

public class AppConfig {


    @Autowired
    private Environment env;

    //setup a logger for diagnostics
    private Logger logger = Logger.getLogger(getClass().getName());

    // define a bean for ViewResolver
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        System.out.println("CUSTOM-VIEWRESOLVER LOADED");
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }



    //define a bean for our security datasource
//    @Bean
//    public DataSource dataSource() {
//        // create connection pool
//        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
//
//        // set the jdbc driver class
//        try {
//            securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
//
//        } catch (PropertyVetoException exc) {
//            throw new RuntimeException(exc);
//        }
//
//        // log the connection properties
//        logger.info(">>>JDBC URL ="+env.getProperty("jdbc.url"));
//        logger.info(">>>JDBC USER ="+env.getProperty("jdbc.user"));
//
//
//        // set database connection props
//        securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
//        securityDataSource.setUser(env.getProperty("jdbc.user"));
//        securityDataSource.setPassword(env.getProperty("jdbc.password"));
//
//
//        // set connection pool props
//        securityDataSource.setInitialPoolSize(
//                getIntProperty("connection.pool.initialPoolSize"));
//        securityDataSource.setMinPoolSize(
//                getIntProperty("connection.pool.minPoolSize"));
//        securityDataSource.setMaxPoolSize(
//                getIntProperty("connection.pool.maxPoolSize"));
//        securityDataSource.setMaxIdleTime(
//                getIntProperty("connection.pool.maxIdleTime"));
//
//        return securityDataSource;
//    }


    //need a helper method
    //read an environment property and convert it to INT
    private int getIntProperty(String prop) {
        return Integer.parseInt(env.getProperty(prop));
    }

//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//	   LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	   sessionFactory.setDataSource(dataSource());
//	   sessionFactory.setPackagesToScan(
//	       new String[] { "com.template.*" }
//	   );
////	   sessionFactory.setHibernateProperties(hibernateProperties());
//
//	   return sessionFactory;
//	}
//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(
//	    SessionFactory sessionFactory) {
//	    HibernateTransactionManager txManager = new HibernateTransactionManager();
//
//	    txManager.setSessionFactory(sessionFactory);
//	    return txManager;
//	}

}



