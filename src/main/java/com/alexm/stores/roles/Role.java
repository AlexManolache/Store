package com.alexm.stores.roles;

public enum Role {
	
	ADMIN("Admin"),
	USER("User");
	
	
	private final String role;
	
	private Role(String role) {
		this.role = role;
	}
	

	public String getRole() {
		return role;
	}
	
}
