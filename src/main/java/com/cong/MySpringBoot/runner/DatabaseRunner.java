package com.cong.MySpringBoot.runner;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * h2 console 및 데이터 사용을 위한 Runner 클래스
 * @author mina
 *
 */
@Component
public class DatabaseRunner implements ApplicationRunner {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		try(Connection connection = dataSource.getConnection()) {
			DatabaseMetaData metaData = connection.getMetaData(); // 현재 h2 DB의 url과 username을 알기 위해 사용
			System.out.println("<H2> URL : " + metaData.getURL());
			System.out.println("<H2> User : " + metaData.getUserName());
			System.out.println("<H2> DataSource Class Name : " + dataSource.getClass().getName());
			
// 한번 실행 후 생성되었으니 주석처리 함			
//			// JDBC 이용하여 DB에 테이블 추가하기
//			String sql = "CREATE TABLE CUSTOMER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY\r\n" + "KEY (id))";
//			
//			Statement statement = connection.createStatement();
//			statement.executeUpdate(sql);
//			
//			// 데이터 삽입
//			jdbcTemplate.execute("insert into customer values (1, 'spring');");
		}
	}

}
