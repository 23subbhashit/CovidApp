package com.covidscape.app;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("everything")
    Call<ResponseModel> getLatestNews(@Query("q") String source,@Query("pageSize") Integer pages,@Query("sortBy") String sortBy,@Query("apiKey") String apiKey);
}
