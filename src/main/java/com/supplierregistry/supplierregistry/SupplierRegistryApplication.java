package com.supplierregistry.supplierregistry;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class SupplierRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierRegistryApplication.class, args);

	}

}
