package com.cong.MySpringBoot.listener;

import java.util.Date;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 컨테이너가 생성된 후의 이벤트를 리슨하는 것
@Component
public class MyStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("Spring Bean 컨테이너가 생성된 후에 호출 됨 : " + new Date(event.getTimestamp()));
	}

}
