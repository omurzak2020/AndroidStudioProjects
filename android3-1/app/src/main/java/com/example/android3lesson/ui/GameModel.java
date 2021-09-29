package com.example.android3lesson.ui;

import com.example.android3lesson.home.HomeFragment;

import java.io.Serializable;
import java.util.ArrayList;

public class GameModel implements Serializable {
    private String first;
    private String second;
    private boolean knopka=true;

    public GameModel(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public GameModel(EmogiGame game) {

    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public boolean isKnopka() {
        return knopka;
    }

    public void setKnopka(boolean knopka) {
        this.knopka = knopka;
    }
}
