package com.fastchar.likethis.pojo;

public class ShopBanner {
    private Integer id;

    private String city;

    private String shopbanner;

    private Integer shopid;

    private String shopurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getShopbanner() {
        return shopbanner;
    }

    public void setShopbanner(String shopbanner) {
        this.shopbanner = shopbanner == null ? null : shopbanner.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopurl() {
        return shopurl;
    }

    public void setShopurl(String shopurl) {
        this.shopurl = shopurl == null ? null : shopurl.trim();
    }
}