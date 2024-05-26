package com.supplierregistry.supplierregistry.entities;

/**
 * Address entity.
 */
public class Address {
	public String street;
	public String city;
	public String postalCode;
	public String country;

	public static Address create(String street, String city, String postalCode, String country) {
		Address address = new Address();

		address.street = street;
		address.city = city;
		address.postalCode = postalCode;
		address.country = country;

		return address;
	}
}
