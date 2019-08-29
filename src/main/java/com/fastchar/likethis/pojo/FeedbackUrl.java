package com.fastchar.likethis.pojo;

public class FeedbackUrl {
    private Integer id;

    private String feedbackurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedbackurl() {
        return feedbackurl;
    }

    public void setFeedbackurl(String feedbackurl) {
        this.feedbackurl = feedbackurl == null ? null : feedbackurl.trim();
    }
}