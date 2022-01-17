package com.trilha.back.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trilha.back.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String categoryName);
}
