package com.zf.userserver.mapper;

import com.zf.userserver.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);
}