package com.koparyProjekt.koparyProjekt.data;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="kopary1")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kopara {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kopary1_seq")
    @SequenceGenerator(name = "kopary1_seq", sequenceName = "kopary1_seq", allocationSize = 1)
    private long id;

    private String brand;

    private String color;

    private int weight;

}
