package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Star;
import com.moyv.bbs_servlet.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 通过userAccount查询用户信息
     * @param userAccount
     * @return
     */
    User selectByAccount(@Param("userAccount") String userAccount);

    /**
     * register user
     * @param user
     * @return
     */
    Integer insertUser(@Param("user") User user);

    /**
     * update user
     * @param user
     * @return
     */
    Integer updateUser(@Param("user") User user);
}
