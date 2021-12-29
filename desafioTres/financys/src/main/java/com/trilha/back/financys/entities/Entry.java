package com.trilha.back.financys.entities;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Entry {
	private long id;
	private String name;
	private String description;
	private String type;
	private String amount;
	private String date;
	private boolean paid;
	private long categoryId;
	
}
