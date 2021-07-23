package com.moyv.bbs_servlet;

import com.moyv.bbs_servlet.dao.*;
import com.moyv.bbs_servlet.entity.*;
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
        System.out.println(postMapper.selectByAccount("0540"));
//        Post post=new Post();
//        post.setPostAccount("2409");
//        post.setPostContent("插入的post");
//        post.setPostImages(0);
//        post.setPostTime(new Timestamp(System.currentTimeMillis()));
//        System.out.println(postMapper.insertPost(post));
    }
    @Test
    void remarkMapperTest(){
//        System.out.println(remarkMapper.selectByPostId(2));
        Remark remark = new Remark();
        remark.setRemarkAccount("0540");
        remark.setPostId(3);
        remark.setRemarkContent("评论消息");
        remark.setRemarkTime(new Timestamp(System.currentTimeMillis()));
        remarkMapper.insertRemark(remark);
    }

    @Test
    void replyMapperTest(){

//        System.out.println(replyMapper.selectByRemarkId(2));

        //insert test
//        Reply reply = new Reply();
//        reply.setReplyAccount("2409");
//        reply.setRemarkId(2);
//        reply.setReplyContent("insert");
//        reply.setReplyTime(new Timestamp(System.currentTimeMillis()));
//        replyMapper.insertReply(reply);

        //delete test
        replyMapper.delReply(1);
    }

    @Test
    void starMapperTest(){
//        System.out.println(starMapper.selectByPostId(1));
//        System.out.println(starMapper.selectByAccount("0540"));
//        Star star = new Star();
//        star.setStarAccount("2409");
//        star.setPostId(3);
//        star.setStarTime(new Timestamp(System.currentTimeMillis()));
//        starMapper.insertStar(star);
        starMapper.delStar(3);
    }
    @Test
    void userMapperTest(){
//        System.out.println(userMapper.selectByAccount("2409"));

//        User user = new User();
//        user.setUserAccount("3225");
//        user.setUserName("起飞");
//        user.setUserSex("男");
//        user.setUserPassword("123456");
//        user.setUserSign("hight sign");
//        user.setUserLoginTime(new Timestamp(System.currentTimeMillis()));
//        userMapper.insertUser(user);

        User user = new User();
        user.setUserAccount("3225");
        user.setUserName("起飞");
        user.setUserSex("男");
        user.setUserSign("啦啦");
        userMapper.updateUser(user);
    }
}
