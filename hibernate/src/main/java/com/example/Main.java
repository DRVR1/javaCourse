package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        // Initialization
        // Config
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();
        // Build and open session
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        // Create a new student to work with
        Student s1 = new Student(126, "ian", 100);

        // Create
        // Save the student
        try {
            Transaction transaction = session.beginTransaction();
            session.persist(s1);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error persisting student: " + e);
        }

        // Read
        // Load student
        Student s2 = session.find(Student.class, s1.getId());
        System.out.println("Loaded student name is: " + s2.getSname());

        // Update the before loaded student
        s2.setSname("newname");
        try {
            Transaction transaction = session.beginTransaction();
            session.merge(s2);
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error updating student: " + e);
        }

        // Delete
        try {
            Transaction transaction = session.beginTransaction();
            session.remove(s2);
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error deleting student: " + e);
        }

        session.close();
        sf.close();

    }
}