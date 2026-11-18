package com.example.task_18_11_26;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
 @PersistenceContext
    private EntityManager entityManager;

 @Transactional
    public Student createStudent(String name){
     Student student = new Student();
     student.setName(name);
     entityManager.persist(student);
     return student;
 }
 public Student findUser(Long id){
     return entityManager.find(Student.class, id);
 }
 @Autowired
 public StudentRepository studentRepository;

public List<Student> findAllStudents(){
     return studentRepository.findAll();
}

  @Transactional
    public void deleteStudent(Long id){
     Student student = entityManager.find(Student.class, id);
     if (student != null){
         entityManager.remove(student);
     }

  }
  @Transactional
    public Student Group(Long studentId, Long groupId){
    Student student = entityManager.find(Student.class, studentId);
    StudentGroup group = entityManager.find(StudentGroup.class, groupId);

    if (student != null && group != null){
        student.setGroup(group);
    }
    return student;
  }
}
