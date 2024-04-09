package com.alexm.stores.accounts;

import java.time.LocalDate;
import java.util.Set;

import com.alexm.stores.roles.Role;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Nonnull
	private String username;
	
	@Nonnull
	private LocalDate createdAccount;
	
	
    private String roles;
	
	
	protected Account() {}

	public Account(int id, String username, LocalDate createdAccount, Role roles) {
		super();
		this.id = id;
		this.username = username;
		this.createdAccount = createdAccount;
		this.roles = roles.getRole();
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getCreatedAccount() {
		return createdAccount;
	}

	public void setCreatedAccount(LocalDate createdAccount) {
		this.createdAccount = createdAccount;
	}


	public String getRoles() {
		return roles;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", createdAccount=" + createdAccount + ", roles="
				+ roles + "]";
	}

	


	

	
	
}
