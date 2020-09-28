package com.api.controller;

import com.api.model.Items;
import com.api.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid Items items) {
        return new ResponseEntity<>(itemService.create(items), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return new ResponseEntity<>(itemService.all(), HttpStatus.OK);
    }
}
