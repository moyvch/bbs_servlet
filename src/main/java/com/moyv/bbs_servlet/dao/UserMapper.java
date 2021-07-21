package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(Integer userAccount);
}
