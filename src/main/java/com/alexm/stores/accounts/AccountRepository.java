package com.alexm.stores.accounts;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Integer> {
	public Account findByUsername(String username);
}
