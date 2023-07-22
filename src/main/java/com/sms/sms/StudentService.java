package com.sms.sms;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private static final Logger logger = Logger.getLogger(StudentService.class.getName());
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        Student savedStudent=studentRepository.save(student);
        logger.info("Student with ID " + savedStudent.getId() + " saved successfully.");
        return savedStudent;
    }

    public Student updateStudent(Student student) {
        Student updatedStudent = studentRepository.save(student);
        logger.info("Student with ID " + updatedStudent.getId() + " updated successfully.");
        return updatedStudent;
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        logger.info("Student with ID " + id + " deleted successfully.");
    }
}

