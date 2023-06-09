package com.zara.user;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insertUser(User user);

    int updateUser(User user);

     int deleteUser(int userId);

     List<User> readUser();

     User readDetailUser(String id);

     String checkId(String id);

     User findPassword(User user);

     User findId(User user);

     User login(User user);

     String selectSession(String sessionId);
}
