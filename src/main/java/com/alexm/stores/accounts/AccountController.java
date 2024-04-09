package com.alexm.stores.accounts;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	private AccountRepository accountRepository;
	
	public AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@GetMapping("/accounts")
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}
	

}
