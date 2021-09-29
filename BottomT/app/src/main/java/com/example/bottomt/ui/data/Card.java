package com.example.bottomt.ui.data;

public class Card<CardContent> {

    private boolean isFaceUp;
    private boolean isMatched;
    private CardContent Content;
    private int id;

    public Card(boolean isFaceUp, boolean isMatched, CardContent content, int id) {
        this.isFaceUp = isFaceUp;
        this.isMatched = isMatched;
        Content = content;
        this.id = id;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }

    public CardContent getContent() {
        return Content;
    }

    public void setContent(CardContent content) {
        Content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
