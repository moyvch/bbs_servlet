package com.moyv.bbs_servlet.entity;

public class Reply {
    private Integer replyId;
    private Integer remarkId;
    private Integer replyAccount;
    private String replyContent;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Integer remarkId) {
        this.remarkId = remarkId;
    }

    public Integer getReplyAccount() {
        return replyAccount;
    }

    public void setReplyAccount(Integer replyAccount) {
        this.replyAccount = replyAccount;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", remarkId=" + remarkId +
                ", replyAccount=" + replyAccount +
                ", replyContent='" + replyContent + '\'' +
                '}';
    }
}
