package com.covidscape.app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface covidapi
{
    @GET("confirmed")
    Call<List<covidModel>> getCases();
}
