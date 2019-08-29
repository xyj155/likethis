package com.fastchar.likethis.pojo;

public class GameType {
    private Integer id;

    private String game;

    private String gamelogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game == null ? null : game.trim();
    }

    public String getGamelogo() {
        return gamelogo;
    }

    public void setGamelogo(String gamelogo) {
        this.gamelogo = gamelogo == null ? null : gamelogo.trim();
    }
}