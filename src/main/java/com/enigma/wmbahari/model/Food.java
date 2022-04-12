package com.enigma.wmbahari.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter@Setter
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_generator")

    private UUID id;
    private Integer code;
    private String name;
    private Integer price;

    public Food(UUID id, Integer code, String name, Integer price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
