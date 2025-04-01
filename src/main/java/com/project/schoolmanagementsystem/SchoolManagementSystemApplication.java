package com.project.schoolmanagementsystem;

import com.project.schoolmanagementsystem.entity.Student;
import com.project.schoolmanagementsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
//        Student studentOne = new Student("Duke", "Okojie", 23, "dukeosamhengbe@gmail.com");
//        studentRepo.save(studentOne);
//
//        Student studentTwo = new Student("Israel", "Okojie", 18, "israel.osas@gmail.com");
//        studentRepo.save(studentTwo);
//
//        Student studentThree = new Student("Duke", "Okojie", 23, "dukeosamhengbe@gmail.com");
//        studentRepo.save(studentThree);
    }
}
