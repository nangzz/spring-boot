package com.cong.MySpringBoot.listener;

import java.util.Date;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

// 컨테이너가 생성되기 전에 이벤트를 리슨하는 것
public class MyStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("Spring Bean 컨테이너 생성에 호출됨 <ApplicationStartingEvent> : " + new Date(event.getTimestamp()));
	}
	
	

}
