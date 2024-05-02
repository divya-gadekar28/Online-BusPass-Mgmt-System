package com.data.buspass.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.buspass.model.StudentData;


@Repository
public interface StudentRepository extends JpaRepository<StudentData, Integer> {


	
}

