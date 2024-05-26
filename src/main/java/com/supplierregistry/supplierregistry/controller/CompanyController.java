package com.supplierregistry.supplierregistry.controller;

import com.supplierregistry.supplierregistry.model.BaseResponse;
import com.supplierregistry.supplierregistry.model.Company;
import com.supplierregistry.supplierregistry.service.CompanyService;
import com.supplierregistry.supplierregistry.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/{ico}")
    public ResponseEntity<BaseResponse> getCompany(@PathVariable String ico) {
        Company company = companyService.getCompanyByIco(ico);
        if (company == null) {
            throw new BadRequestException("Company not found");
        }
        return new ResponseEntity<>(new BaseResponse(true, "Company found"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BaseResponse> addCompany(@RequestBody Company company) {
        if (company.getIco() == null || company.getName() == null) {
            throw new BadRequestException("Invalid company data");
        }
        companyService.addCompany(company);
        return new ResponseEntity<>(new BaseResponse(true, "Company added"), HttpStatus.CREATED);
    }
}
