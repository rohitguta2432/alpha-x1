package com.api.repository;

import com.api.model.SubCategorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubCategorys, UUID> {
}
