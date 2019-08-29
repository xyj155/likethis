package com.fastchar.likethis.pojo;

import java.util.Date;

public class SnackShopCar {
    private Integer id;

    private Integer goodsid;

    private Integer tasteid;

    private Date createtime;

    private Integer userid;

    private String status;

    private String ordernum;

    private String message;

    private Integer addressid;

    private String postnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getTasteid() {
        return tasteid;
    }

    public void setTasteid(Integer tasteid) {
        this.tasteid = tasteid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getPostnum() {
        return postnum;
    }

    public void setPostnum(String postnum) {
        this.postnum = postnum == null ? null : postnum.trim();
    }
}