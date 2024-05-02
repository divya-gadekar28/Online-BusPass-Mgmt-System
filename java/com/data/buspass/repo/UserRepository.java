package com.data.buspass.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.buspass.model.UserData;


@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {


	
}

