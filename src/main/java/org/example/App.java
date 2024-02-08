package org.example;

import org.example.manyToOne.entities.Classroom;
import org.example.manyToOne.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Classroom.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        List<Student> studentList = new ArrayList<>();
        Student student = new Student(4, "Федя2");
        studentList.add(student);
        Classroom classroom = new Classroom(142, "Moscow2", studentList);

        session.save(classroom);

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
