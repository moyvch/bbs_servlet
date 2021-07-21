package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Star;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 0
 */
@Mapper
public interface StarMapper {
    /**
     * 通过postId查询一条帖子下的所有点赞信息
     * @param postId
     * @return
     */
    List<Star> selectByPostId(Integer postId);

    /**
     * 通过starAccount查询用户点过的赞的信息
     * @param starAccount
     * @return
     */
    List<Star> selectByAccount(String starAccount);
}
