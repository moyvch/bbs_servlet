package com.moyv.bbs_servlet.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/27
 * Time: 11:13
 * Description:一条记录包含的东西
 */
public class Record {
    private Post post;
    private User user;
    private List<RemarkAndReply> remarkAndReplies;
    private List<Star> stars;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RemarkAndReply> getRemarkAndReplies() {
        return remarkAndReplies;
    }

    public void setRemarkAndReplies(List<RemarkAndReply> remarkAndReplies) {
        this.remarkAndReplies = remarkAndReplies;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Record{" +
                "post=" + post +
                ", user=" + user +
                ", remark=" + remarkAndReplies +
                ", star=" + stars +
                '}';
    }
}
