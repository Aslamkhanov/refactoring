package com.javaacademy;

import lombok.Getter;
import lombok.NonNull;

@Getter
public enum GarbageType {
    PAPER("Бумага"),
    GLASS("Стекло"),
    MIXED("Смешанный мусор");
    private final String value;

    GarbageType(@NonNull String value) {
        this.value = value;
    }
}
