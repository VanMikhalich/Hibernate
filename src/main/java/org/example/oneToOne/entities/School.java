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

    public School() {
    }

    public School(String city, int number, Director director) {
        this.city = city;
        this.number = number;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
