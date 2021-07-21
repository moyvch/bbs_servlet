package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReplyMapper {
    /**
     * 通过remarkId查询指定评论下的全部回复
     * @param remarkId
     * @return
     */
    List<Reply> selectByRemarkId(@Param("remarkId") Integer remarkId);
}
