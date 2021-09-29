package com.example.myandroid1.data;

import java.util.Objects;

public class Card<CardContent> {

    private boolean isFaceUp;
    private boolean isMached;
    private CardContent content;
    private int id;

    public Card(boolean isFaceUp, boolean isMached, CardContent content, int id) {
        this.isFaceUp = isFaceUp;
        this.isMached = isMached;
        this.content = content;
        this.id = id;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }

    public boolean isMached() {
        return isMached;
    }

    public void setMached(boolean mached) {
        isMached = mached;
    }

    public CardContent getContent() {
        return content;
    }

    public void setContent(CardContent content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card<?> card = (Card<?>) o;
        return Objects.equals(content, card.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFaceUp, isMached, content, id);
    }

    @Override
    public String toString() {
        return "Card{" +
                "isFaceUp=" + isFaceUp +
                ", isMached=" + isMached +
                ", content=" + content +
                ", id=" + id +
                '}';
    }
}
