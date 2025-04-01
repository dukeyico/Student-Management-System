package com.project.schoolmanagementsystem.repository;

import com.project.schoolmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Long>
{

}
