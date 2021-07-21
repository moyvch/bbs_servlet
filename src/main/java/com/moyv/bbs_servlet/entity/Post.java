package com.moyv.bbs_servlet.entity;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/19
 * Time: 14:50
 * Description:
 */
public class Post {
    private Integer postId;
    private Integer postImages;
    private String postContent;
    private Integer postAccount;
    private Timestamp postTime;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostImages() {
        return postImages;
    }

    public void setPostImages(Integer postImages) {
        this.postImages = postImages;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Integer getPostAccount() {
        return postAccount;
    }

    public void setPostAccount(Integer postAccount) {
        this.postAccount = postAccount;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postImages=" + postImages +
                ", postContent='" + postContent + '\'' +
                ", postAccount=" + postAccount +
                ", postTime=" + postTime +
                '}';
    }
}
