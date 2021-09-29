package com.example.myandroid3.data.models;

import com.example.myandroid3.data.AndroidApi;

public class RetrofitBuilder {

    private RetrofitBuilder(){}

    private static AndroidApi instance;

    static AndroidApi getInstance(){
        if (instance == null){
            instance = createService();
        }
        return instance;
    }
}
