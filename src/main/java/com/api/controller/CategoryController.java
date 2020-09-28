package com.api.controller;

import com.api.model.Categorys;
import com.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid Categorys categorys) {
        return new ResponseEntity<>(categoryService.create(categorys), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }
}
