package com.fastchar.likethis.pojo;

public class ShopList {
    private Integer id;

    private String shopname;

    private String shopaddress;

    private String destributefree;

    private String totalfree;

    private String shoppicture;

    private String shoptype;

    private String ordercount;

    private String special;

    private String city;

    private String latitude;

    private String longitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress == null ? null : shopaddress.trim();
    }

    public String getDestributefree() {
        return destributefree;
    }

    public void setDestributefree(String destributefree) {
        this.destributefree = destributefree == null ? null : destributefree.trim();
    }

    public String getTotalfree() {
        return totalfree;
    }

    public void setTotalfree(String totalfree) {
        this.totalfree = totalfree == null ? null : totalfree.trim();
    }

    public String getShoppicture() {
        return shoppicture;
    }

    public void setShoppicture(String shoppicture) {
        this.shoppicture = shoppicture == null ? null : shoppicture.trim();
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(String ordercount) {
        this.ordercount = ordercount == null ? null : ordercount.trim();
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special == null ? null : special.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }
}