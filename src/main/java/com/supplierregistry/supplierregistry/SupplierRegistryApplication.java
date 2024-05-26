package com.supplierregistry.supplierregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.supplierregistry.supplierregistry.providers.*;
// import com.supplierregistry.supplierregistry.providers.Ares.AresProvider;

@SpringBootApplication
public class SupplierRegistryApplication {

	public static void main(String[] args) {
		// AresProvider ares = new AresProvider();

		// ares.findByIco("06149341");
		SpringApplication.run(SupplierRegistryApplication.class, args);
	}

}
