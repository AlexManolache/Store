package com.alexm.stores.roles;


import java.util.ArrayList;
import java.util.List;

import com.alexm.stores.accounts.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Role {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Nonnull
    private String name;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<Account> accounts = new ArrayList<>();
    
    protected Role() {}

	public Role(String name, List<Account> accounts) {
		super();
		this.name = name;
		this.accounts = accounts;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}