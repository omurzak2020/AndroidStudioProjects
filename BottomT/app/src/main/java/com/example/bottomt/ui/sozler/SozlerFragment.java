package com.example.bottomt.ui.sozler;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomt.R;

import java.util.ArrayList;

public class SozlerFragment extends Fragment {

    private RecyclerView recyclerView;
    private SozlerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new SozlerAdapter();
        ArrayList<String> list = new ArrayList<>();
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak omurzak");
        list.add("omurzak");
        list.add("omurzak");
        list.add("omurzak");
        list.add("omurzak");
        adapter.addList(list);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sozler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        initList();

    }

    private void initList() {
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
    }
}