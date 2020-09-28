package com.api.service;

import com.api.mapper.CategoryMapper;
import com.api.model.Categorys;
import com.api.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CetegoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Categorys create(Categorys categorys) {
        log.info("create category : {} ", categorys);
        return categoryRepository.save(categorys);
    }

    @Override
    public List<CategoryMapper> getAll() {
        log.info("fetching all category : {} ");
        return categoryRepository.getAllCategory();
    }
}
