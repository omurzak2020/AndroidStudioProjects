package com.example.taskapp.ui.home;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskapp.models.Note;
import com.example.taskapp.R;
import com.example.taskapp.interfaces.OnItemClickListener;


import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private static final String TAG = "getItem";
    private ArrayList<Note> list = new ArrayList<>();
    private OnItemClickListener itemClickListener;
    private int pos;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_task, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        this.pos = position;
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void addList(List<Note> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void addItem(Note note) {
        list.add(0, note);
        notifyDataSetChanged();
    }

    public void deleteElement(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }

    public void updateItem(int position, Note note) {
        list.set(position, note);
        notifyItemChanged(position);
    }

    // returns the element or object in clicked position;
//    which we called inside the click method to pass into the DAO methods;
    public Note getItem(int position) {
        Log.e(TAG, "getItem: " + position);
        return list.get(position);
    }

    public void clearList(List<Note> list) {
        list.clear();
        notifyDataSetChanged();
    }


//    public void setElement(int pos, String text) {
//        list.set(pos, text);
//        notifyDataSetChanged();
//    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private TextView timeView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewTask);
            timeView = itemView.findViewById(R.id.timeView);
            clickListeners();
        }

        private void clickListeners() {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onItemClick(getAdapterPosition());
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    itemClickListener.onLongClick(getAdapterPosition());
                    return true;
                }
            });
        }

        public void bind(Note s) {
            s.setId(s.getId());
            textView.setText(s.getTitle());
            timeView.setText(s.getCreatedAt());
            if (pos % 2 == 0)
                itemView.setBackgroundColor(itemView.getResources().getColor(R.color.colorBackgroundElement_grey));
            else
                itemView.setBackgroundColor(itemView.getResources().getColor(R.color.colorBackgroundElement_blueShade));
        }
    }
}
