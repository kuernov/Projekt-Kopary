package com.koparyProjekt.koparyProjekt.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@Getter
@NoArgsConstructor
public class Kopara {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
