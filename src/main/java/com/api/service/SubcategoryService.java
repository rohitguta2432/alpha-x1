package com.api.service;

import com.api.model.SubCategorys;

import java.util.List;

public interface SubcategoryService {
    SubCategorys create(SubCategorys subCategorys);
    List<SubCategorys> all();
}
