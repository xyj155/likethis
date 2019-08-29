package com.fastchar.likethis.pojo;

public class SnackKind {
    private Integer id;

    private String kindname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname == null ? null : kindname.trim();
    }
}