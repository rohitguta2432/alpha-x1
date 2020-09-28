package com.api.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubcategoryMapper {
    private UUID subCategoryId;
    private String name;
    private String img;
    private UUID categoryId;

}
