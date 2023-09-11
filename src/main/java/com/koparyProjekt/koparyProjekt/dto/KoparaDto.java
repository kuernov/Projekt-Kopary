package com.koparyProjekt.koparyProjekt.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class KoparaDto {
    private long id;
    @NotEmpty(message = "brand shouldn't be empty")
    private String brand;
    @NotEmpty(message = "color shouldn't be empty")
    private String color;
    @Min(value = 1,message = "weight should be greater than 0")
    private int weight;

    public KoparaDto(String brand, String color, int weight) {
        super();
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

}
