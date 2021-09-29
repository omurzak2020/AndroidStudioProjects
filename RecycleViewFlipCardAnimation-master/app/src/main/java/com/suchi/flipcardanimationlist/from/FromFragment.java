package com.suchi.flipcardanimationlist.from;

import android.os.Bundle;
import androidx.core.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.suchi.flipcardanimationlist.R;

public class FromFragment extends Fragment {


    public FromFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_from, container, false);
    }
}