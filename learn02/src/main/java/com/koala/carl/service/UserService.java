package com.koala.carl.service;

import com.koala.carl.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by carl on 16-11-17.
 */
public interface UserService extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByNameAndAge(String name, Integer age);
    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
