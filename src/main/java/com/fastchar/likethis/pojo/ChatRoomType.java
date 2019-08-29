package com.fastchar.likethis.pojo;

public class ChatRoomType {
    private Integer id;

    private String roomarray;

    private String roomtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomarray() {
        return roomarray;
    }

    public void setRoomarray(String roomarray) {
        this.roomarray = roomarray == null ? null : roomarray.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }
}