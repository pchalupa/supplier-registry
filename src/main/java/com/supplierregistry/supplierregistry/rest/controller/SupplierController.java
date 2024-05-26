package com.supplierregistry.supplierregistry.rest.controller;

import com.supplierregistry.supplierregistry.entities.Subject;
import com.supplierregistry.supplierregistry.providers.Ares.AresProvider;
import com.supplierregistry.supplierregistry.rest.exception.BadRequestException;
import com.supplierregistry.supplierregistry.rest.model.Company;
import com.supplierregistry.supplierregistry.rest.model.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private AresProvider provider;


    @Autowired
    public SupplierController( AresProvider aresProvider){
        this.provider = aresProvider;
    }


    private static final Pattern ICO_PATTERN = Pattern.compile("^[0-9]{8}$");

    @GetMapping("/{ico}")
    public ResponseEntity<BaseResponse> getSupplierByIco(@PathVariable String ico) {

        if (!ICO_PATTERN.matcher(ico).matches()) {
            throw new BadRequestException("IČO must be 8 digits");
        }

        Subject subject = provider.findByIco(ico);
        if (subject == null) {
            throw new BadRequestException("Company not found");
        }
        return new ResponseEntity<>(new BaseResponse(true, subject), HttpStatus.OK);
    }


}
