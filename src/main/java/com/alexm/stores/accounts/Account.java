package com.alexm.stores.accounts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.alexm.stores.roles.Role;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Nonnull
    private String username;
    
    private LocalDate createdAccount;

    @ManyToMany
    @JoinTable(
        name = "account_role",
        		joinColumns = @JoinColumn(name = "account_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();
    
    protected Account() {}
    
	public Account(String username, List<Role> roles, LocalDate createdAccount) {
		super();
		this.username = username;
		this.roles = roles;
		this.createdAccount=createdAccount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", createdAccount=" + createdAccount + ", roles="
				+ roles + "]";
	}

	

    
}