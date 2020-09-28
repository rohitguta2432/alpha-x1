package com.api.controller;

import com.api.model.SubCategorys;
import com.api.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("subcategory")
public class SubcategoryController {

    @Autowired
    private SubcategoryService subcategoryService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid SubCategorys subCategorys) {
        return new ResponseEntity<>(subcategoryService.create(subCategorys), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return new ResponseEntity<>(subcategoryService.all(), HttpStatus.OK);
    }
}
