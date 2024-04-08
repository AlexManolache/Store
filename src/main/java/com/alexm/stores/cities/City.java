package com.alexm.stores.cities;

import java.util.List;

import com.alexm.stores.addresses.Address;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class City {
	
	@Id
	@GeneratedValue
	private int id; 
	
	@Nonnull
	private String cityName;
	
	@OneToMany(mappedBy = "city")
    private List<Address> addresses;
	
	protected City() {}
	
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}
	public int getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + "]";
	}



}
