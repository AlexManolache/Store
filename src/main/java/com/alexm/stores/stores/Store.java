package com.alexm.stores.stores;

import java.time.LocalDate;
import java.util.List;

import com.alexm.stores.addresses.Address;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Store {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Nonnull
	private String name;
	
	@Nonnull
	private LocalDate openStore;
	
	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
	private List<Address> address;
	
	protected Store() {}

	public Store(String name, LocalDate openStore, Address address) {
		super();
		this.name = name;
		this.openStore = LocalDate.now();
	
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getOpenStore() {
		return openStore;
	}

	public void setOpenStore(LocalDate openStore) {
		this.openStore = openStore;
	}
	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", openStore=" + openStore + ", address=" + address + "]";
	}


	
	
	
}
