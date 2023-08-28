package com.koparyProjekt.koparyProjekt.data;

import jakarta.persistence.*;

@Entity
public class Kopara {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column
    private String brand;
    @Column
    private String color;
    @Column
    private int weight;

    public Kopara(String brand, String color, int weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

    public Kopara(){

    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }
}
