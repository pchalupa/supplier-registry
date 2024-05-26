package com.supplierregistry.supplierregistry.providers.db;

import com.supplierregistry.supplierregistry.entities.AddressDTO;
import com.supplierregistry.supplierregistry.entities.SupplierDTO;
import com.supplierregistry.supplierregistry.repository.IAddressRepository;
import com.supplierregistry.supplierregistry.repository.ISupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBProvider {

    @Autowired
    IAddressRepository IAddressRepository;

    @Autowired
    ISupplierRepository iSupplierRepository;


    public boolean InsertSupplier(SupplierDTO supplier) {


        try {
        iSupplierRepository.save(supplier);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean InsertAddress(AddressDTO address) {
        try {
            IAddressRepository.save(address);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
