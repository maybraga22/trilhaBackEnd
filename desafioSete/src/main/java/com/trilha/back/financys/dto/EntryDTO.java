package com.trilha.back.financys.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntryDTO {
	
	private String name;
	private String type;
	private String amount;
	private long categoryId;
}