package com.psi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User>findByUserName(String userName);

}
