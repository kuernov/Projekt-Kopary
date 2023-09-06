package com.koparyProjekt.koparyProjekt.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity(name="kopary1")
@Getter
@NoArgsConstructor
public class Kopara {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kopary1_seq")
    @SequenceGenerator(name = "kopary1_seq", sequenceName = "kopary1_seq", allocationSize = 1)
    private long id;

    private String brand;

    private String color;

    private int weight;

    public Kopara(String brand, String color, int weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }


}
