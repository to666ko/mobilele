package org.softuni.mobilele.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="brands")
public class BrandEntiy extends BaseEntity{


    //TODO: Rename to 'name' and make unique
    @Column(unique = true, nullable = false)
    private String brand;

    public String getBrand() {
        return brand;
    }

    public BrandEntiy setBrand(String brand) {
        this.brand = brand;
        return this;
    }
}
