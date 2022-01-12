package com.trilha.back.financys.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeEnum {

	REVENUE("revenue"), 
	EXPENSE("expense");

	private String typeEnum;

	private TypeEnum(String typeEnum) {
		this.typeEnum = typeEnum;
	}

	@JsonValue
	public String getTypeEnum() {
		return this.typeEnum;
	}

}
