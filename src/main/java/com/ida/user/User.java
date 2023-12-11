package com.ida.user;

public class User {

    private final int id;

    private final String name;

    private final String gender;

    private final int age;

    public User(int id, String name, String gender,int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
