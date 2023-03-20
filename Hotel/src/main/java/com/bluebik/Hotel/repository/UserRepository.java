package com.bluebik.Hotel.repository;

import com.bluebik.Hotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
