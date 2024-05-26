package com.supplierregistry.supplierregistry.repository;

import com.supplierregistry.supplierregistry.entities.SupplierDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierRepository extends JpaRepository<SupplierDTO, Integer> {
}
