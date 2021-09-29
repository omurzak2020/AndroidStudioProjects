package com.example.myandroid1.ui;

import com.example.myandroid1.data.Card;
import com.example.myandroid1.data.Game;

import java.util.List;
import java.util.SplittableRandom;

public class EmogiGame {

    private Game game;

    public EmogiGame() {
        List<String> content = List.of("smile", "sad", "bad");
        game = new Game<>(content);
    }

    public void choose(Card<String> card ){
        game.choose(card);
    }

    public List<Card<String>> getCards(){
        return game.getCards();
    }
}
