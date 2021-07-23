package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 0
 */
@Mapper
public interface ReplyMapper {
    /**
     * 通过remarkId查询指定评论下的全部回复
     * @param remarkId
     * @return
     */
    List<Reply> selectByRemarkId(@Param("remarkId") Integer remarkId);

    /**
     * 添加一条回复信息
     * @param reply
     * @return
     */
    Integer insertReply(@Param("reply")Reply reply);

    /**
     * 删除指定replyId的回复
     * @param replyId
     * @return
     */
    Integer delReply(@Param("replyId") Integer replyId);
}
