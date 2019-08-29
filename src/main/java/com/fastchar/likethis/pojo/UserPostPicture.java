package com.fastchar.likethis.pojo;

public class UserPostPicture {
    private Integer id;

    private String topicname;

    private String postcount;

    private Integer userid;

    private Integer topicpid;

    private String topicpicurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname == null ? null : topicname.trim();
    }

    public String getPostcount() {
        return postcount;
    }

    public void setPostcount(String postcount) {
        this.postcount = postcount == null ? null : postcount.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTopicpid() {
        return topicpid;
    }

    public void setTopicpid(Integer topicpid) {
        this.topicpid = topicpid;
    }

    public String getTopicpicurl() {
        return topicpicurl;
    }

    public void setTopicpicurl(String topicpicurl) {
        this.topicpicurl = topicpicurl == null ? null : topicpicurl.trim();
    }
}