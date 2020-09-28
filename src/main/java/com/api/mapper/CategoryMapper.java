package com.api.mapper;

import com.api.model.SubCategorys;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMapper {
    private UUID categoryId;
    private String name;
    private String img;
}
