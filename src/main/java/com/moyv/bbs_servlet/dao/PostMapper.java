package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 0
 */
@Mapper
public interface PostMapper {
    /**
     * 通过id查询post
     * @param postId
     * @return
     */
    Post selectById(@Param("postId") Integer postId);

    /**
     * 通过account查询post
     * @param postAccount
     * @return
     */
    List<Post> selectByAccount(@Param("postAccount") String postAccount);

    /**
     * 查询全部的post
     * @return
     */
    List<Post> selectAll();

    /**
     * 插入一条post，发布帖子用
     * @param post
     * @return
     */
    Integer insertPost(@Param("post") Post post);
}
