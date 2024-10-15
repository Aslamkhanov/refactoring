package com.javaacademy;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * Город
 */
@Getter
@ToString
public class City {
    public final String name;
    @ToString.Exclude
    @Setter
    public int peopleCount;

    public City(@NonNull String name, Integer peopleCount) {
        this.name = name;
        this.peopleCount = peopleCount;
    }

    public Garbage[] createGarbage() {
        return new Garbage[] {
            new Garbage(GarbageType.GLASS, 1000, this.name),
            new Garbage(GarbageType.PAPER, 15000, this.name),
            new Garbage(GarbageType.MIXED, 200000, this.name),
        };
    }

    //Внимание, только город выводится на экран
}
