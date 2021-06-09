package com.blurdel.ssc.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blurdel.ssc.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String username);
}
