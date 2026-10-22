package com.craft;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void main(String[] args) {
        // 1. CREATE: Insert a new student
        Student student = new Student();
        student.setName("Darik Kefelegn");
        student.setTech("Java & JPA");
        createStudent(student);
        System.out.println("Student created successfully!");

        // 2. READ: Fetch student by ID (assuming ID 1)
        Student fetchedStudent = getStudentById(1);
        System.out.println("READ (Get by ID): " + fetchedStudent);

        // 3. UPDATE: Update the student's name
        updateStudentName("Darik K.", 1);
        System.out.println("AFTER UPDATE: " + getStudentById(1));

        // 4. DELETE: Remove student by ID (activated)
        deleteStudentById(1);
        System.out.println("Student deleted successfully!");
    } // <--- This closing brace for main() was missing!

    // --- CREATE ---
    public static void createStudent(Student student) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    // --- READ ---
    public static Student getStudentById(int id) {
        EntityManager em = getEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    // --- UPDATE ---
    public static void updateStudentName(String newName, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        Student student = em.find(Student.class, id);
        if (student != null) {
            student.setName(newName);
        }

        em.getTransaction().commit();
        em.close();
    }

    // --- DELETE ---
    public static void deleteStudentById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        Student student = em.find(Student.class, id);
        if (student != null) {
            em.remove(student);
        }

        em.getTransaction().commit();
        em.close();
    }
} // <--- Closing brace for the App class










