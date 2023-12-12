package com.ida.user;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    Optional<User> findById(int id);

    @Insert("INSERT INTO users (id,name, gender, age) VALUES (#{id},#{name}, #{gender}, #{age})")
    void insertUser(User user);



}
