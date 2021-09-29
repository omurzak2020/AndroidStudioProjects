package com.example.myandroid1.ui;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myandroid1.R;
import com.example.myandroid1.data.Card;

public class EmogiAdapter extends RecyclerView.Adapter<EmogiAdapter.EmogiHolder> {

    private EmogiGame game;
    private Listener listener;

    public EmogiAdapter(EmogiGame game, Listener listener) {
        this.game = game;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EmogiHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new EmogiHolder(view,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull EmogiHolder holder, int position) {
        holder.bind(game.getCards().get(position));
    }


    @Override
    public int getItemCount() {
        return game.getCards().size();
    }

      class EmogiHolder extends RecyclerView.ViewHolder{

        private  Listener listener;
         private TextView tvCard;

        public EmogiHolder(@NonNull View itemView, Listener listener) {
            super(itemView);
            this.listener = listener;
            tvCard = itemView.findViewById(R.id.tv_card);
        }

        public void addListener(Listener listener){
            this.listener= listener;
        }
        public void bind(Card<String> card){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.cardClick(card);
                    notifyDataSetChanged();
                }
            });
            if (card.isFaceUp()){
                tvCard.setBackgroundColor(Color.YELLOW);
                tvCard.setText(card.getContent());
            }else {
                tvCard.setBackgroundColor(Color.GRAY);
                tvCard.setText("");
            }
        }
    }

    interface Listener{
        void cardClick(Card<String> card);
    }
}
