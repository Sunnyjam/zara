package com.zara.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int deleteUser(int userId){
        return userMapper.deleteUser(userId);
    }

    public List<User> readUser(){
        return userMapper.readUser();
    }

    public User readDetailUser(String id){
        return userMapper.readDetailUser(id);
    }

    public String checkId(String id) {
        return userMapper.checkId(id);
    }

    public User findPassword(User user) {
        return userMapper.findPassword(user);
    }

    public User findId(User user) {
        return userMapper.findId(user);
    }

    public User login(User user) {
        return userMapper.login(user);
    }

    public String selectSession(String sessionId){
        return userMapper.selectSession(sessionId);
    }
}
