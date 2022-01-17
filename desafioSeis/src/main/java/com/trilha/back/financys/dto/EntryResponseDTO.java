package com.trilha.back.financys.dto;

import com.trilha.back.financys.entities.Entry;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
public class EntryResponseDTO {
	
	private String name;
	private String description;
	private String type;
	private String amount;
	private String date;
	private boolean paid; 
	
    public static EntryResponseDTO transformaEmDTO(Entry entry) {
        return new EntryResponseDTO(
        		entry.getName(), 
        		entry.getDescription(),
        		entry.getType(), 
        		entry.getAmount(), 
        		entry.getDate(),
        		entry.isPaid());
    }

}
