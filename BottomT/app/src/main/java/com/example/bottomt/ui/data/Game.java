package com.example.bottomt.ui.data;

import java.util.ArrayList;
import java.util.List;

public class Game<CardContent>  {

    private final List<Card<CardContent>> cards = new ArrayList<>();

    public Game(List<CardContent> contents){
        for (int i = 0; i < contents.size(); i++) {
            cards.add(new Card<>(false,false, contents.get(i),0));
            cards.add(new Card<>(false,false, contents.get(i),0));
        }
    }
    public void choose(Card<CardContent> card){
        card.setFaceUp(!card.isFaceUp());
        if (card.isFaceUp()){
            findPais(card);
        }
    }

    private void findPais(Card<CardContent> card) {
        for (Card<CardContent> seachCard : cards) {
            if (seachCard.isFaceUp() &&
                seachCard.getId() != card.getId()
                && seachCard.equals(card)){
                card.setMatched(true);
                seachCard.setMatched(true);
                return;
            }
        }
    }

    public List<Card<CardContent>> getCards(){
        return cards;
    }


}
