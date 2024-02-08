package org.example.manyToOne.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "number")
    private int number;
    @Column(name = "city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id")
    private List<Student> students = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(int number, String city, List<Student> students) {
        this.number = number;
        this.city = city;
        this.students = students;
    }
}
