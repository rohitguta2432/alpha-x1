package com.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "categorys")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Categorys extends AuditEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID categoryId;
    @NotNull(message = "Required")
    @Column(length = 50)
    private String name;
    @Column(length = 200)
    private String img;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",foreignKey = @ForeignKey(name = "fk_category_sub_category"))
    private Set<SubCategorys> subCategorys;
}
