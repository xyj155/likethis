package com.fastchar.likethis.pojo;

import java.util.Date;

public class GameEvaluate {
    private Integer id;

    private Integer userid;

    private String evaluatedesc;

    private Date createtime;

    private Integer gameuserid;

    private String rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEvaluatedesc() {
        return evaluatedesc;
    }

    public void setEvaluatedesc(String evaluatedesc) {
        this.evaluatedesc = evaluatedesc == null ? null : evaluatedesc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getGameuserid() {
        return gameuserid;
    }

    public void setGameuserid(Integer gameuserid) {
        this.gameuserid = gameuserid;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }
}