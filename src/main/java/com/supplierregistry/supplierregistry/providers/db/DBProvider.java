package com.supplierregistry.supplierregistry.providers.db;

import com.supplierregistry.supplierregistry.entities.AddressDTO;
import com.supplierregistry.supplierregistry.entities.SupplierDTO;
import com.supplierregistry.supplierregistry.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBProvider {

    @Autowired
    AddressRepository addressRepository;


    public boolean InsertSupplier(SupplierDTO supplier) {

       /* var transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(supplier);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            // todo logování
            transaction.rollback();
            return false;
        }*/
        return true;
    }

    public boolean InsertAddress(AddressDTO address) {
        try {
            addressRepository.save(address);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
