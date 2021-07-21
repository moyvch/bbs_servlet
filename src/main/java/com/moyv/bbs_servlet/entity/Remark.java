package com.moyv.bbs_servlet.entity;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/19
 * Time: 15:02
 * Description:
 */
public class Remark {
    private Integer remarkId;
    private Integer postId;
    private String remarkAccount;
    private String remarkContent;
    private Timestamp remarkTime;

    public Integer getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Integer remarkId) {
        this.remarkId = remarkId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getRemarkAccount() {
        return remarkAccount;
    }

    public void setRemarkAccount(String remarkAccount) {
        this.remarkAccount = remarkAccount;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }

    public Timestamp getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Timestamp remarkTime) {
        this.remarkTime = remarkTime;
    }

    @Override
    public String toString() {
        return "Remark{" +
                "remarkId=" + remarkId +
                ", postId=" + postId +
                ", remarkAccount=" + remarkAccount +
                ", remarkContent='" + remarkContent + '\'' +
                ", remarkTime=" + remarkTime +
                '}';
    }
}
