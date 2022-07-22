package com.nkdebug.springprofileapp.repository;

import com.nkdebug.springprofileapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
