package org.example.oneToOne.entities;

import javax.persistence.*;

@Entity
@Table(name = "director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;
    @Column(name = "name")
    private String fullName;
    @Column(name = "age")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    private School school;
}
