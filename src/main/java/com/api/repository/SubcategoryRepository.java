package com.api.repository;

import com.api.mapper.SubcategoryMapper;
import com.api.model.SubCategorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubCategorys, UUID> {
    @Query("select new com.api.mapper.SubcategoryMapper(s.subCategoryId,s.name,s.img,s.category.categoryId) from SubCategorys s")
    List<SubcategoryMapper> getAllSubcategory();
}
