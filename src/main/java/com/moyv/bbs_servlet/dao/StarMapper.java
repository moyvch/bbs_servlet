package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Star;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 0
 */
@Mapper
public interface StarMapper {
    Star selectById(Integer starId);
}
