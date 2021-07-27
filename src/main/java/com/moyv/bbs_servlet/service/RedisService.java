package com.moyv.bbs_servlet.service;

import com.alibaba.fastjson.JSON;
import com.moyv.bbs_servlet.dao.*;
import com.moyv.bbs_servlet.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/23
 * Time: 16:10
 * Description:初始化redis
 */
@Service
public class RedisService {
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

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    /**
     * 初始化redis
     */
    @PostConstruct
    public void initRedis(){
        stringRedisTemplate.delete("recordList");
        /**
         * 一条recode格式
         * post主题，
         * post对应的user
         * post对应的remark
         * remark对应的reply
         * remark对应的star
         */
        List<Record> recordList = new ArrayList<>();
        List<Post> postList = postMapper.selectAll();
        //遍历全部的post
        for (Post post:
             postList) {
            Record record = new Record();
            record.setPost(post);

            int postId = post.getPostId();

            //用户信息
            String postAccount = post.getPostAccount();
            User user = userMapper.selectByAccount(postAccount);
            record.setUser(user);

            //评论与回复
            List<RemarkAndReply> remarks = new ArrayList<>();
            List<Remark> remarkList = remarkMapper.selectByPostId(postId);
            for (Remark remark :
                    remarkList) {
                RemarkAndReply remarkAndReply = new RemarkAndReply();
                int remarkId = remark.getRemarkId();
                List<Reply> replyList = replyMapper.selectByRemarkId(remarkId);
                remarkAndReply.setRemark(remark);
                remarkAndReply.setReplyList(replyList);
                remarks.add(remarkAndReply);
            }
            record.setRemarkAndReplies(remarks);

            //点赞信息
            List<Star> starList = starMapper.selectByPostId(postId);
            record.setStars(starList);

            recordList.add(record);
        }
        stringRedisTemplate.opsForList().leftPush("recordList", JSON.toJSONString(recordList));
    }
}
