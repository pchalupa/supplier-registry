package com.supplierregistry.supplierregistry.service;

import com.supplierregistry.supplierregistry.model.Company;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CompanyService {
    private Map<String, Company> companies = new HashMap<>();

    public Company getCompanyByIco(String ico) {
        return companies.get(ico);
    }

    public void addCompany(Company company) {
        companies.put(company.getIco(), company);
    }
}
