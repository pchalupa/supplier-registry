package com.supplierregistry.supplierregistry.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier_address")
public class AddressDTO {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "country")
    private String Country;

    @Column(name = "city")
    private String City;

    @Column(name = "street")
    private String Street;

    @Column(name = "postal_code")
    private String PostalCode;


    public AddressDTO(String country, String city, String street, String postalCode) {
        Country = country;
        City = city;
        Street = street;
        PostalCode = postalCode;
    }

    public int getId() {
        return Id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }
}
