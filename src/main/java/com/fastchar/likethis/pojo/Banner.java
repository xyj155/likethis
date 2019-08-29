package com.fastchar.likethis.pojo;

public class Banner {
    private Integer id;

    private String bannerurl;

    private String bannerpicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerurl() {
        return bannerurl;
    }

    public void setBannerurl(String bannerurl) {
        this.bannerurl = bannerurl == null ? null : bannerurl.trim();
    }

    public String getBannerpicture() {
        return bannerpicture;
    }

    public void setBannerpicture(String bannerpicture) {
        this.bannerpicture = bannerpicture == null ? null : bannerpicture.trim();
    }
}