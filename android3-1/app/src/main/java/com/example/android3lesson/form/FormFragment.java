package com.example.android3lesson.form;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.android3lesson.R;
import com.example.android3lesson.ui.GameModel;
import com.example.android3lesson.ui.MainActivity;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class FormFragment extends Fragment {

    private Button button;
    private EditText editText1;
    private EditText editText2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_form, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText1 = view.findViewById(R.id.editText1);
        editText2 = view.findViewById(R.id.editText2);
        button = view.findViewById(R.id.sendbtn);
        init(view);
    }

    private void init(View view) {

        button.setOnClickListener(v -> {
            String text1 = editText1.getText().toString();
            String text2 = editText2.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putSerializable("text1", text1);
            bundle.putSerializable("text2", text2);
           getParentFragmentManager().setFragmentResult("rk_text", bundle);
            ((MainActivity) requireActivity()).closeFragment();
            Log.d("TAG", "init: "+bundle);

        });

    }

}