package com.project.schoolmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "First_Name", nullable = false)
    private String firstname;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Age")
    private int age;

    @Column(name = "Email")
    private String email;

    public Student(){
        //default constructor with no parameter
    }

    public Student(String firstname, String surname, int age, String email) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
