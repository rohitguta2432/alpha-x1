package com.api.repository;

import com.api.mapper.CategoryMapper;
import com.api.model.Categorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Categorys, UUID> {

    @Query("select new com.api.mapper.CategoryMapper(c.categoryId,c.name,c.img) from Categorys c")
    List<CategoryMapper> getAllCategory();

}
