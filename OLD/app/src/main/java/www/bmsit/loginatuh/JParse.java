package www.bmsit.loginatuh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JParse extends AppCompatActivity {
    private List<covidModel> covidData;
    private List<covidModel> indiaData = new ArrayList<covidModel>();
    private String url = "https://covid19.mathdro.id/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jparse);
        String data = "";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        covidapi parse = retrofit.create(covidapi.class);

        Call<List<covidModel>> call = parse.getCases();

        call.enqueue(new Callback<List<covidModel>>() {
            @Override
            public void onResponse(Call<List<covidModel>> call, Response<List<covidModel>> response) {
                covidData = response.body();

                for (int i = 0; i < covidData.size(); i++) {
                    if(covidData.get(i).getCountryRegion().equalsIgnoreCase( "India")) {
                        indiaData.add(covidData.get(i));
                    }
                }
                System.out.println("----------------------------------------------------------------------------------------");
                for (int i = 0; i < indiaData.size(); i++) {
                    System.out.println("Country: " + indiaData.get(i).getCountryRegion());
                    System.out.println("Deaths: " + indiaData.get(i).getDeaths());
                }

                initRecyclerView();
            }

            @Override
            public void onFailure(Call<List<covidModel>> call, Throwable t) {
                Toast.makeText(JParse.this, "Fail to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.parseDisplay);
        RecyclerAdapter adapter = new RecyclerAdapter(indiaData, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}