package com.api.service;

import com.api.mapper.CategoryMapper;
import com.api.model.Categorys;

import java.util.List;

public interface CategoryService {
    Categorys create(Categorys categorys);
    List<CategoryMapper> getAll();
}
