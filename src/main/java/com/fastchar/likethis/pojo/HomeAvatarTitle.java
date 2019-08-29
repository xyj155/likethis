package com.fastchar.likethis.pojo;

public class HomeAvatarTitle {
    private Integer id;

    private String activename;

    private String activepicture;

    private String activesorted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivename() {
        return activename;
    }

    public void setActivename(String activename) {
        this.activename = activename == null ? null : activename.trim();
    }

    public String getActivepicture() {
        return activepicture;
    }

    public void setActivepicture(String activepicture) {
        this.activepicture = activepicture == null ? null : activepicture.trim();
    }

    public String getActivesorted() {
        return activesorted;
    }

    public void setActivesorted(String activesorted) {
        this.activesorted = activesorted == null ? null : activesorted.trim();
    }
}