package com.i2finance.bootstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement// 开启事务注解
@EnableAsync//异步任务
@EnableScheduling//定时任务
@MapperScan("com.i2finance.mapper")
//主类所在的包开始扫描
@SpringBootApplication(scanBasePackages = "com.i2finance.bootstudy")
public class BootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStudyApplication.class, args);
	}

}
