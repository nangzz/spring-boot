package com.cong.MySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cong.MySpringBoot.listener.MyStartingEventListener;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootApplication.class, args);
		
		// 직접 Web Application 클래스 생성하기
		SpringApplication application = new SpringApplication(MySpringBootApplication.class);
		
		// 타입 변경하기 (default는 SERVLET)
		application.setWebApplicationType(WebApplicationType.SERVLET);
		
		// Listener 객체 등록하기
		application.addListeners(new MyStartingEventListener());
		application.run(args);
	}

}
