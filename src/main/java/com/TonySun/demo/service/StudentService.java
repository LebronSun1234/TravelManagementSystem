package com.TonySun.demo.service;

import com.TonySun.demo.entity.StudentEntity;
import com.TonySun.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource
    StudentRepository repository;

    public StudentEntity get(long id) {
        return repository.findById(id).orElse(null);
    }

    public StudentEntity save(StudentEntity entity) {
        return repository.save(entity);
    }

    public void delete(StudentEntity entity) {
        repository.delete(entity);
    }

    public Iterable<StudentEntity> all() {
        return repository.findAll();
    }

}