package com.koala.carl.domin;

/**
 * Created by carl on 16-11-16.
 */
public class User {

        private Long id;
        private String name;
        private Integer age;

        // 省略setter和getter


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
