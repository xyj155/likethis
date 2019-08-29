package com.fastchar.likethis.pojo;

import java.util.Date;

public class FeedbackContent {
    private Integer id;

    private Integer userid;

    private String feedtype;

    private String feedcontent;

    private String contacttel;

    private Date time;

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

    public String getFeedtype() {
        return feedtype;
    }

    public void setFeedtype(String feedtype) {
        this.feedtype = feedtype == null ? null : feedtype.trim();
    }

    public String getFeedcontent() {
        return feedcontent;
    }

    public void setFeedcontent(String feedcontent) {
        this.feedcontent = feedcontent == null ? null : feedcontent.trim();
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}