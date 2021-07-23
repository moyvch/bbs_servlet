package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Remark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 0
 */
@Mapper
public interface RemarkMapper {
    /**
     * 通过id查询remark
     * @param remarkId
     * @return
     */
    Remark selectById(@Param("remarkId") Integer remarkId);

    /**
     * 通过一条post下所有的remark
     * @param postId
     * @return
     */
    List<Remark> selectByPostId(@Param("postId") Integer postId);


    /**
     * 评论postId的帖子
     * @param remark
     * @return
     */
    Integer insertRemark(@Param("remark") Remark remark);

    /**
     * 通过postId删除一条评论
     * @param remarkId
     * @return
     */
    Integer delRemarkById(@Param("remarkId") Integer remarkId);
}
