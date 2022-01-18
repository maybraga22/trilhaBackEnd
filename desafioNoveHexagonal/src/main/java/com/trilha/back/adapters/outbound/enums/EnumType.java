package com.trilha.back.adapters.outbound.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EnumType {

    REVENUE("revenue"),
    EXPENSE("expense");

    private String typeEnum;

    private EnumType(String typeEnum) {
        this.typeEnum = typeEnum;
    }

    @JsonValue
    public String getTypeEnum() {
        return this.typeEnum;
    }
}
