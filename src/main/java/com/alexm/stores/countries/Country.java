package com.alexm.stores.countries;

import java.util.List;

import com.alexm.stores.addresses.Address;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Nonnull
	private String countryName;
	
	@OneToMany(mappedBy = "country")
    private List<Address> addresses;
	
	protected Country () {}
	
	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}
	
	
	public int getId() {
		return id;
	}

	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + "]";
	}
	
	
	
}
