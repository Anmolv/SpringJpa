package com.springboot.springjpa.Repository;

import com.springboot.springjpa.Entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDaoRepository extends JpaRepository<User, Long> {
}
