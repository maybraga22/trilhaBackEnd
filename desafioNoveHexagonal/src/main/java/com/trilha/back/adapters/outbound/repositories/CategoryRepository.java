package com.trilha.back.adapters.outbound.repositories;

import com.trilha.back.adapters.outbound.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findByName(String categoryName);
}
