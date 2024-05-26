package com.supplierregistry.supplierregistry.repository;

import com.supplierregistry.supplierregistry.entities.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<AddressDTO,Long> {
}
