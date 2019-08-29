package com.fastchar.likethis.pojo;

public class UserMission {
    private Integer mid;

    private String missionname;

    private String missionscore;

    private String missiontype;

    private String missionicon;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMissionname() {
        return missionname;
    }

    public void setMissionname(String missionname) {
        this.missionname = missionname == null ? null : missionname.trim();
    }

    public String getMissionscore() {
        return missionscore;
    }

    public void setMissionscore(String missionscore) {
        this.missionscore = missionscore == null ? null : missionscore.trim();
    }

    public String getMissiontype() {
        return missiontype;
    }

    public void setMissiontype(String missiontype) {
        this.missiontype = missiontype == null ? null : missiontype.trim();
    }

    public String getMissionicon() {
        return missionicon;
    }

    public void setMissionicon(String missionicon) {
        this.missionicon = missionicon == null ? null : missionicon.trim();
    }
}