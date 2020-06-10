package com.zf.userserver.services;


import com.github.pagehelper.Page;
import com.zf.userserver.mapper.UserMapper;
import com.zf.userserver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public Page<User> getUserList(){
        return userMapper.getUserList();
    }
}