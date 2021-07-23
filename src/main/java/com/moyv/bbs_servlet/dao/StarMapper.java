package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Reply;
import com.moyv.bbs_servlet.entity.Star;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    List<Star> selectByPostId(@Param("postId") Integer postId);

    /**
     * 通过starAccount查询用户点过的赞的信息
     * @param starAccount
     * @return
     */
    List<Star> selectByAccount(@Param("starAccount") String starAccount);

    /**
     * 添加点赞
     * @param star
     * @return
     */
    Integer insertStar(@Param("star") Star star);

    /**
     * 删除指定点赞
     * @param starId
     * @return
     */
    Integer delStar(@Param("starId") Integer starId);
}
