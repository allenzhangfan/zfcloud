package com.zf.userserver.mapper;

import com.github.pagehelper.Page;
import com.zf.userserver.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);

    @Select("SELECT * FROM USER")
    Page<User> getUserList();
}