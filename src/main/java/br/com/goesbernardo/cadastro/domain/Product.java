package br.com.goesbernardo.cadastro.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer amount;
    private Double value;

    public Product(Long id, String name, Integer amount, Double value) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.value = value;
    }
}
