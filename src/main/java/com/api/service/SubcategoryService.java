package com.api.service;

import com.api.mapper.SubcategoryMapper;
import com.api.model.SubCategorys;

import java.util.List;

public interface SubcategoryService {
    SubCategorys create(SubCategorys subCategorys);
    List<SubcategoryMapper> all();
}
