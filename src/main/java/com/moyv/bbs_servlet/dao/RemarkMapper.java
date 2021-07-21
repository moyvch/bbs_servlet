package com.moyv.bbs_servlet.dao;

import com.moyv.bbs_servlet.entity.Remark;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RemarkMapper {
    /**
     * 通过id查询remark
     * @param RemarkId
     * @return
     */
    Remark selectById(Integer RemarkId);

    /**
     * 通过一条post下所有的remark
     * @param PostId
     * @return
     */
    List<Remark> selectByPostId(Integer PostId);


}
