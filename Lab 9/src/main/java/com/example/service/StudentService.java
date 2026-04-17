package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.exception.StudentNotFoundException;
import com.example.model.Student;

@Service
public class StudentService {

    private static final Map<Integer, Student> STUDENTS = new HashMap<>();

    static {
        STUDENTS.put(270, new Student(270, "Deva", "CSE"));
        STUDENTS.put(766, new Student(766, "Sahith", "CSE"));
        STUDENTS.put(152, new Student(152, "Santhosh", "CS-IT"));
    }

    public Student getStudentById(int id) {

        if (!STUDENTS.containsKey(id)) {
            throw new StudentNotFoundException("Student not found with ID: " + id);
        }

        return STUDENTS.get(id);
    }
}
