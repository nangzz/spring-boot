package com.cong.MySpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 테스트용 설정 클래스로 framework에서 테스트 시 사용했던 설정들이 이곳에서 이루어짐
 * @author mina
 *
 */

@Configuration
@Profile("test")
public class TestConfig {
	
	@Bean
	public String hello() {
		return "테스트 환경에서 사용되는 Configuration의 hello bean";
	}

}
