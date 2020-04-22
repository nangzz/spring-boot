package com.cong.MySpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cong.MySpringBoot.entity.Account;

/**
 * Repository를 인터페이스 형식으로 만듬
 * @author mina
 *
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	Account findByUsername(String username);

}
