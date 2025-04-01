package com.blurdel.ssc.repositories;

import java.util.Optional;

import com.blurdel.ssc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
}
