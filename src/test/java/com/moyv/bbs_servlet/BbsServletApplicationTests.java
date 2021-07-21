package com.moyv.bbs_servlet;

import com.moyv.bbs_servlet.dao.*;
import com.moyv.bbs_servlet.entity.Post;
import com.moyv.bbs_servlet.entity.Reply;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@SpringBootTest
@RunWith(SpringRunner.class)
class BbsServletApplicationTests {
    @Autowired
    PostMapper postMapper;
    @Autowired
    RemarkMapper remarkMapper;
    @Autowired
    ReplyMapper replyMapper;
    @Autowired
    StarMapper starMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void postMapperTest(){
//        System.out.println(postMapper.selectAll());
        Post post=new Post();
        post.setPostAccount("0540");
        post.setPostContent("插入的post");
        post.setPostImages(0);
        post.setPostTime(new Timestamp(System.currentTimeMillis()));
        System.out.println(postMapper.insertPost(post));
    }
    @Test
    void remarkMapperTest(){
        System.out.println(remarkMapper.selectByPostId(2));
    }

    @Test
    void replyMapperTest(){
        System.out.println(replyMapper.selectByRemarkId(2));
    }

    @Test
    void starMapperTest(){
//        System.out.println(starMapper.selectByPostId(1));
        System.out.println(starMapper.selectByAccount("0540"));
    }
    @Test
    void userMapperTest(){
        System.out.println(userMapper.selectByAccount("2409"));
    }
}
