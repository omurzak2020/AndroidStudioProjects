package com.example.myandroid2.data.remote;

import retrofit2.Retrofit;

public class RetrofirFactory {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://ghibliapi.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
