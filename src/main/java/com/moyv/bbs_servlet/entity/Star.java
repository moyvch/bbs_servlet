package com.moyv.bbs_servlet.entity;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/18
 * Time: 22:00
 * Description:
 */

public class Star {
    private Integer starId;
    private Integer postId;
    private Integer starAccount;
    private Timestamp starTime;

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getStarAccount() {
        return starAccount;
    }

    public void setStarAccount(Integer starAccount) {
        this.starAccount = starAccount;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
    }

    @Override
    public String toString() {
        return "Star{" +
                "starId=" + starId +
                ", postId=" + postId +
                ", starAccount=" + starAccount +
                ", starTime=" + starTime +
                '}';
    }
}
