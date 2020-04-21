package com.cong.MySpringBoot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1) // Runner 중에서 실행 순서가 가장 먼저라는 뜻
// java -jar -Dfoo MySpringBoot-0.0.1-SNAPSHOT.jar --bar
// java -jar MySpringBoot-0.0.1-SNAPSHOT.jar --cong.name=java
public class MyRunner implements ApplicationRunner {
	 
	@Value("${cong.name}")
	private String name;
	
	@Value("${cong.age}")
	private int age;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(">>> Property Name : " + name);
		System.out.println(">>> Property Age : " + age);
		
		System.out.println("Source Arguments : " + args.getOptionNames());
		System.out.println("Program Arguments : " + args.containsOption("bar"));
		System.out.println("VM Arguments : " + args.containsOption("foo"));
	}

}
