package com.fastchar.likethis.pojo;


import java.util.Date;

public class PostAll {
    private Integer id;

    private Integer userid;

    private String postcontent;

    private Date createtime;

    private String topictype;

    private String commentcount;

    private String thumbcount;

    private String sharecount;

    private String posttopic;

    private Integer posttype;

    private String duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent == null ? null : postcontent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTopictype() {
        return topictype;
    }

    public void setTopictype(String topictype) {
        this.topictype = topictype == null ? null : topictype.trim();
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount == null ? null : commentcount.trim();
    }

    public String getThumbcount() {
        return thumbcount;
    }

    public void setThumbcount(String thumbcount) {
        this.thumbcount = thumbcount == null ? null : thumbcount.trim();
    }

    public String getSharecount() {
        return sharecount;
    }

    public void setSharecount(String sharecount) {
        this.sharecount = sharecount == null ? null : sharecount.trim();
    }

    public String getPosttopic() {
        return posttopic;
    }

    public void setPosttopic(String posttopic) {
        this.posttopic = posttopic == null ? null : posttopic.trim();
    }

    public Integer getPosttype() {
        return posttype;
    }

    public void setPosttype(Integer posttype) {
        this.posttype = posttype;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }
}