package org.example.oneToOne.entities;

import javax.persistence.*;
@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "number")
    private int number;

    @OneToOne(cascade = CascadeType.ALL)
    private Director director;
}
