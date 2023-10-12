package org.softuni.mobilele.repository;

import org.softuni.mobilele.model.entity.BrandEntiy;
import org.softuni.mobilele.model.entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntiy, Long> {
}

