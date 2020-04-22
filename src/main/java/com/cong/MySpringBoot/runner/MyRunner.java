package com.cong.MySpringBoot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cong.MySpringBoot.property.CongProperties;

@Component
@Order(1) // Runner 중에서 실행 순서가 가장 먼저라는 뜻
// java -jar -Dfoo MySpringBoot-0.0.1-SNAPSHOT.jar --bar
// java -jar MySpringBoot-0.0.1-SNAPSHOT.jar --cong.name=java
// java -jar MySpringBoot-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
public class MyRunner implements ApplicationRunner {
	 
	@Value("${cong.name}")
	private String name;
	
	@Value("${cong.age}")
	private int age;
	
	@Autowired // @Component로 등록된 애는 이렇게 갖다 쓸 수 있음
	CongProperties properties;
	
	@Autowired
	String hello;
	
	private Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Property Name : " + name);
		System.out.println(">>> Property Age : " + age); // 방식 1
		System.out.println(">>> PropertyClass Name : " + properties.getName());
		System.out.println(">>> PropertyClass fullName : " + properties.getFullName()); // 방식 2 이런 방식도 가능
		
		System.out.println("Source Arguments : " + args.getOptionNames());
		System.out.println("Program Arguments : " + args.containsOption("bar"));
		System.out.println("VM Arguments : " + args.containsOption("foo"));
		
		System.out.println(">>> Profile hello bean : " + hello);
		
		// 로그 버전
		logger.debug(">>> Property Name : \" + name");
		logger.info("Source Arguments : " + args.getOptionNames());
	}

}
