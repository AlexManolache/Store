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

    private Set<Role> roles;
	
	
	protected Account() {}

	public Account(String username, LocalDate createdAccount) {
		super();
		this.username = username;
		this.createdAccount = LocalDate.now();
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", createdAccount=" + createdAccount + ", roles="
				+ roles + "]";
	}

	

	
	
}
