package com.example.demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
