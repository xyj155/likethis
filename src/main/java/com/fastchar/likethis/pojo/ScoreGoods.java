package com.fastchar.likethis.pojo;

import java.util.Date;

public class ScoreGoods {
    private Integer id;

    private String goodsname;

    private String scorespend;

    private Date createtime;

    private String type;

    private String giftimageurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getScorespend() {
        return scorespend;
    }

    public void setScorespend(String scorespend) {
        this.scorespend = scorespend == null ? null : scorespend.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getGiftimageurl() {
        return giftimageurl;
    }

    public void setGiftimageurl(String giftimageurl) {
        this.giftimageurl = giftimageurl == null ? null : giftimageurl.trim();
    }
}