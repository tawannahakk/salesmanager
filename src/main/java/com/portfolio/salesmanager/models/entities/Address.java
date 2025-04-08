package com.portfolio.salesmanager.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "address_seq", allocationSize = 1)
    private Long id;

    private String street;

    private String number;

    @Column(name = "zip_code")
    private String zipCode;

    private String neighborhood;

    private String city;

    private String state;

    private String complement;

    @ManyToMany(mappedBy = "addresses")
    private List<Person> people = new ArrayList<>();
}
