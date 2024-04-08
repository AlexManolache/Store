package com.alexm.stores.addresses;

import com.alexm.stores.cities.City;
import com.alexm.stores.countries.Country;
import com.alexm.stores.stores.Store;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Nonnull
	private String streetName;
	
	@Nonnull
	private int streetNumber;
	
	private String zipCode;
	
	
	@ManyToOne
	private City city;
	
	@ManyToOne
	private Country country;
	
	@ManyToOne
	private Store store;
	
	protected Address () {}

	public Address(String streetName, int streetNumber, String zipCode, City city, Country country, Store store) {
		super();
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.store = store;
	}

	public int getId() {
		return id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getNumberStreet() {
		return streetNumber;
	}

	public void setNumberStreet(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + ", streetNumber=" + streetNumber + ", zipCode="
				+ zipCode + ", city=" + city + ", country=" + country + "]";
	}

	
	 
}
