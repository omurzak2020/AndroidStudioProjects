package com.example.myandroid1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myandroid1.R;
import com.example.myandroid1.data.Card;

public class MainActivity extends AppCompatActivity implements EmogiAdapter.Listener{

    private RecyclerView recyclerView;
    private EmogiAdapter adapter;
    private EmogiGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_cards);
        game = new EmogiGame();
        adapter = new EmogiAdapter(game, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void cardClick(Card<String> card) {
        game.choose(card);
        adapter.notifyDataSetChanged();
    }
}