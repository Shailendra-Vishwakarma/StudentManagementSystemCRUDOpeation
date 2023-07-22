package com.sms.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public student createStudent(student student) {
        return studentRepository.save(student);
    }

    public student updateStudent(student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}

