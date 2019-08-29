package com.fastchar.likethis.pojo;

import java.util.Date;

public class CommentPicture {
    private Integer id;

    private Integer commentid;

    private String commentpicture;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommentpicture() {
        return commentpicture;
    }

    public void setCommentpicture(String commentpicture) {
        this.commentpicture = commentpicture == null ? null : commentpicture.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}