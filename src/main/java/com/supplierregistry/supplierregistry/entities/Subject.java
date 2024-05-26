package com.supplierregistry.supplierregistry.entities;

/**
 * Subject entity.
 */
public class Subject {
	public String ico;
	public String name;
	public Address address;

	public static Subject create(String ico, String name, Address address) {
		Subject subject = new Subject();

		subject.ico = ico;
		subject.name = name;
		subject.address = address;

		return subject;
	}
}
