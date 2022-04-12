package com.enigma.wmbahari.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter@Setter
@NoArgsConstructor
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_generator")

    private Integer number;
    private Boolean isReserved;

    public Table(Integer number, Boolean isReserved) {
        this.number = number;
        this.isReserved = isReserved;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", isReserved=" + isReserved +
                '}';
    }
}
