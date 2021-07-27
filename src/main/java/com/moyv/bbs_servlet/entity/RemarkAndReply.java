package com.moyv.bbs_servlet.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/27
 * Time: 16:32
 * Description:
 */
public class RemarkAndReply {
    private Remark remark;
    private List<Reply> replyList;

    @Override
    public String toString() {
        return "RemarkAndReply{" +
                "remark=" + remark +
                ", replyList=" + replyList +
                '}';
    }

    public Remark getRemark() {
        return remark;
    }

    public void setRemark(Remark remark) {
        this.remark = remark;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }
}
