package com.TonySun.demo.repository;

import com.TonySun.demo.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}

