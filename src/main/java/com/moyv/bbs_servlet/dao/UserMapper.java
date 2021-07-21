package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 通过userAccount查询用户信息
     * @param userAccount
     * @return
     */
    User selectByAccount(String userAccount);
}
