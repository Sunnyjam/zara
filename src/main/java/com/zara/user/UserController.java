package com.zara.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/insertUser")
    public int insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @PutMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public int deleteUser(@PathVariable int userId){
        return userService.deleteUser(userId);
    }

    @GetMapping("/readUser")
    public List<User> readUser() {
        return userService.readUser();
    }

    @GetMapping("/readDetailUser/{id}")
    public User readDetailUser(@PathVariable String id){
        return userService.readDetailUser(id);
    }

    @GetMapping("/{id}")
    public String checkId(@PathVariable String id){
        return userService.checkId(id);
    }
//
//    @PostMapping("/findPassword")
//    public User findPassword(@RequestBody User user) {
//        return userService.findPassword(user);
//    }

}
