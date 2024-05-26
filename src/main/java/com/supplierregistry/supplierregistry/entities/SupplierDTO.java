package com.supplierregistry.supplierregistry.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "suppliers")
public class SupplierDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "ico")
    private String ICO;

    @Column(name = "legal_form_code")
    private String LegalFormCode;

    @Column(name = "established")
    private Date EstablishmentDate;

    @Column(name = "expired")
    private Date ExpirationDate;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private AddressDTO address;


    public SupplierDTO() {
    }

    public SupplierDTO(String name, String ICO, String legalFormCode, Date establishmentDate, Date expirationDate, AddressDTO address) {
        Name = name;
        this.ICO = ICO;
        LegalFormCode = legalFormCode;
        EstablishmentDate = establishmentDate;
        ExpirationDate = expirationDate;
        this.address = address;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getICO() {
        return ICO;
    }

    public void setICO(String ICO) {
        this.ICO = ICO;
    }

    public String getLegalFormCode() {
        return LegalFormCode;
    }

    public void setLegalFormCode(String legalFormCode) {
        LegalFormCode = legalFormCode;
    }

    public Date getEstablishmentDate() {
        return EstablishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        EstablishmentDate = establishmentDate;
    }

    public Date getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        ExpirationDate = expirationDate;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
