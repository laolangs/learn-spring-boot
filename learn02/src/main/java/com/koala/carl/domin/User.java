package com.koala.carl.domin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by carl on 16-11-16.
 */
@Entity
public class User {

            @Id
            @GeneratedValue
            private Long id;
            @Column(nullable = false)
            private String name;
            @Column(nullable = false)
            private Integer age;
    public User() {
    }
    public User(String name,Integer age) {
        this.age = age;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
