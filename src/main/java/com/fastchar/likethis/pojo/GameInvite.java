package com.fastchar.likethis.pojo;

import java.util.Date;

public class GameInvite {
    private Integer id;

    private Integer gameid;

    private Integer userid;

    private String gameslogan;

    private String gametitle;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getGameslogan() {
        return gameslogan;
    }

    public void setGameslogan(String gameslogan) {
        this.gameslogan = gameslogan == null ? null : gameslogan.trim();
    }

    public String getGametitle() {
        return gametitle;
    }

    public void setGametitle(String gametitle) {
        this.gametitle = gametitle == null ? null : gametitle.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}