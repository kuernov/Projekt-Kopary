package com.koparyProjekt.koparyProjekt.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KoparaDto {
    private long id;
    @NotBlank
    private String brand;
    @NotBlank
    private String color;
    @NotEmpty
    private int weight;

    public KoparaDto(String brand, String color, int weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
    }

}
