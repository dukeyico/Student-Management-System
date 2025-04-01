package com.project.schoolmanagementsystem.Service;

import com.project.schoolmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService
{
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getsStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
