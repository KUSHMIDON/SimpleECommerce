package com.example.SimpleECommerce.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product Name is Required")
    @Basic(optional = false)
    @Getter @Setter
    private String name;

    @Getter @Setter
    private Double price;

    @Getter @Setter
    private String pictureUrl;


}
