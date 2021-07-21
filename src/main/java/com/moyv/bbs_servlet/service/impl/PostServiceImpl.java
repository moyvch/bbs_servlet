package com.moyv.bbs_servlet.service.impl;

import com.moyv.bbs_servlet.dao.PostMapper;
import com.moyv.bbs_servlet.entity.Post;
import com.moyv.bbs_servlet.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/19
 * Time: 14:56
 * Description:
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;
    @Override
    public Post selectTest(Integer postId) {
        return postMapper.selectById(postId);
    }


}
