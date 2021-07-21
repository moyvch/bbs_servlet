package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Reply;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {
    Reply selectById(Integer replyId);
}
