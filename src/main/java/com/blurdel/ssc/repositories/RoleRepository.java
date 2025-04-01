package com.blurdel.ssc.repositories;

import com.blurdel.ssc.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
