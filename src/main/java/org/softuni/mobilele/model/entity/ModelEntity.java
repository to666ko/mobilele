package org.softuni.mobilele.model.entity;

import jakarta.persistence.*;
import org.softuni.mobilele.model.enums.ModelCategoryEnum;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity{


    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;

    @ManyToOne
    private BrandEntiy brand;

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ModelCategoryEnum getModelCategory() {
        return category;
    }

    public ModelEntity setModelCategory(ModelCategoryEnum modelCategory) {
        this.category = modelCategory;
        return this;
    }

    public BrandEntiy getBrand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntiy brand) {
        this.brand = brand;
        return this;
    }
}
