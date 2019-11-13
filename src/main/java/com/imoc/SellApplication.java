package com.imoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;
import java.sql.Connection;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.imoc.repository")
@EntityScan(basePackages = "com.imoc.entity")

public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(SellApplication.class,args);
//        DataSource dataSource = context.getBean(DataSource.class);
//        try {
//           Connection connection = dataSource.getConnection();
//           System.out.println(connection+">>>>>>>>>连接");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
//    定制输出目标
//    定制输出格式
//    选择性输出
//    携带上下文信息
//    灵活的配置
//    优异的性能
//    logback

}
