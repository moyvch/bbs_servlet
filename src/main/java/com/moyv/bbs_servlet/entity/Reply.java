package com.moyv.bbs_servlet.entity;

public class Reply {
    private Integer replyId;
    private Integer remarkId;
    private String replyAccount;
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

    public String getReplyAccount() {
        return replyAccount;
    }

    public void setReplyAccount(String replyAccount) {
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
