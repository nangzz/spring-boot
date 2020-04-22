package com.cong.MySpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 운영 Configuration 클래스로 framework에서 XML으로 설정했던 것과 같음
 * @author mina
 *
 */

@Configuration
@Profile("prod")
public class ProductionConfig {

	@Bean
	public String hello() {
		return "운영 환경에서 사용되는 Configuration의 hello bean";
	}
}
