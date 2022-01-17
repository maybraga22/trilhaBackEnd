package com.trilha.back.financys.dto;

import com.trilha.back.financys.entities.Category;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
public class CategoryResponseDTO {
	
	private String name;
	private String description;
	
    public static CategoryResponseDTO transformaEmDTO(Category category) {
        return new CategoryResponseDTO(
        		category.getName(), 
        		category.getDescription());
    }

}
