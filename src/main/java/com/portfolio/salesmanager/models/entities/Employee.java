package com.portfolio.salesmanager.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Employee extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Employee supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Employee> subordinates = new ArrayList<>();
}
