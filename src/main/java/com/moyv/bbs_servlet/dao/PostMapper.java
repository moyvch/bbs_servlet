package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Post;
import org.apache.ibatis.annotations.Mapper;

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
    Post selectById(Integer postId);

    /**
     * 通过account查询post
     * @param account
     * @return
     */
    List<Post> selectByAccount(Integer account);

    /**
     * 查询全部的post
     * @return
     */
    List<Post> selectAll();

}
