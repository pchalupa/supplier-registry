package com.supplierregistry.supplierregistry;


import com.supplierregistry.supplierregistry.entities.AddressDTO;
import com.supplierregistry.supplierregistry.entities.SupplierDTO;
import com.supplierregistry.supplierregistry.providers.db.DBProvider;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;


@SpringBootTest
class SupplierRegistryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void insertSupplier()
	{
		var dt = new Date();
		var address = new AddressDTO("Cz","Litoměřice","Dlouhá","41201");
		var supplier = new SupplierDTO("Aleš","123","523",dt,dt,address);
		var dbProvider = new DBProvider();
		var res = dbProvider.InsertAddress(address);
		Assert.isTrue(res,"Test se nezdařil");
	}

}
