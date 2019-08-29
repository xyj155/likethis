package com.fastchar.likethis.pojo;

import java.math.BigDecimal;

public class SnackAll {
    private Integer id;

    private String foodname;

    private BigDecimal foodsprice;

    private String foodssize;

    private String foodpicture;

    private Integer activityid;

    private Integer kindid;

    private String foodsowner;

    private String isshow;

    private String needcount;

    private String foodsorign;

    private Integer snackkindid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public BigDecimal getFoodsprice() {
        return foodsprice;
    }

    public void setFoodsprice(BigDecimal foodsprice) {
        this.foodsprice = foodsprice;
    }

    public String getFoodssize() {
        return foodssize;
    }

    public void setFoodssize(String foodssize) {
        this.foodssize = foodssize == null ? null : foodssize.trim();
    }

    public String getFoodpicture() {
        return foodpicture;
    }

    public void setFoodpicture(String foodpicture) {
        this.foodpicture = foodpicture == null ? null : foodpicture.trim();
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getFoodsowner() {
        return foodsowner;
    }

    public void setFoodsowner(String foodsowner) {
        this.foodsowner = foodsowner == null ? null : foodsowner.trim();
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }

    public String getNeedcount() {
        return needcount;
    }

    public void setNeedcount(String needcount) {
        this.needcount = needcount == null ? null : needcount.trim();
    }

    public String getFoodsorign() {
        return foodsorign;
    }

    public void setFoodsorign(String foodsorign) {
        this.foodsorign = foodsorign == null ? null : foodsorign.trim();
    }

    public Integer getSnackkindid() {
        return snackkindid;
    }

    public void setSnackkindid(Integer snackkindid) {
        this.snackkindid = snackkindid;
    }
}