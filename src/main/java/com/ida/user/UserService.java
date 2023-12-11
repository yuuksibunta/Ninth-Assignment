package com.ida.user;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }
    public User findUser(int id) {
        Optional<User> user = this.userMapper.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException("Not found");
        }

    }

    @Transactional
    public User createUser(User newUser) {
        // ユーザーの作成ロジックを実装
        // userMapperを使用してデータベースにユーザーを挿入
        // ...
        return newUser;
    }


}


