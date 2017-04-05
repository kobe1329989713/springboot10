package com.utsoft.spring;

import com.utsoft.spring.log.UserDao;
import com.utsoft.spring.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 日志级别有：TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF
 *  日志级别配置成OFF，表示关闭日志输出
 *
 *  logging.file 指定日志文件名字
 *  logging.path 指定日志目录（此时的日志名字为spring.log）
 *  日志文件输出，文件的大小10M之后，就会分割了
 *
 *  logging.pattern.console 配置控制台输出日志的pattern
 *  logging.file.console 配置日志文件输出日志的pattern
 *
 *  springboot默认支持logback
 *  也就是说，只需要在classptah下放一个logback.xml,logback-spring.xml的文件，即可定制日志的输出
 *
 *  使用其他的日志组件的步骤
 *  1：排除掉默认的日志组件：spring-boot-starter-logging
 *  2：加入新的日志路径依赖
 *  3：把相应的配置文件放到classpath下
 */

// exclude = WebSocketAutoConfiguration.class 排除 这个类的日志输出。
@SpringBootApplication(exclude = WebSocketAutoConfiguration.class)
public class Springboot10Application {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Springboot10Application.class, args);
		// 这样也是可以打印 debug 级别的日志。
		ConfigurableApplicationContext context = SpringApplication.run(Springboot10Application.class, "--debug=true");
		context.getBean(UserDao.class).log();

		System.out.println("==============");

		// 输出 service 包的日志。
		context.getBean(UserService.class).log();
		context.close();
	}
}
