package com.api.service;

import com.api.mapper.SubcategoryMapper;
import com.api.model.SubCategorys;
import com.api.repository.SubcategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SubcategoryServiceImpl implements SubcategoryService {

    @Autowired
    private SubcategoryRepository subcategoryRepository;

    @Override
    public SubCategorys create(SubCategorys subCategorys) {
        log.info("create subcategory : {} ", subCategorys);
        return subcategoryRepository.save(subCategorys);
    }

    @Override
    public List<SubcategoryMapper> all() {
        log.info("fetching all subcategory : {} ");
        return subcategoryRepository.getAllSubcategory();
    }
}
