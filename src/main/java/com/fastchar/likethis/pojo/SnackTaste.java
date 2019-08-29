package com.fastchar.likethis.pojo;

public class SnackTaste {
    private Integer id;

    private String foodstaste;

    private Integer foodsid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodstaste() {
        return foodstaste;
    }

    public void setFoodstaste(String foodstaste) {
        this.foodstaste = foodstaste == null ? null : foodstaste.trim();
    }

    public Integer getFoodsid() {
        return foodsid;
    }

    public void setFoodsid(Integer foodsid) {
        this.foodsid = foodsid;
    }
}