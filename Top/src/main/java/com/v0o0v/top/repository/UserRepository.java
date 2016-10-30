package com.v0o0v.top.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.v0o0v.top.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(@Param("name") String name);
}
