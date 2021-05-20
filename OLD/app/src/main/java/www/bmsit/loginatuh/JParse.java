package www.bmsit.loginatuh;

import androidx.appcompat.app.AppCompatActivity;

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
    private TextView parsedData;
    private String url = "https://covid19.mathdro.id/api/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jparse);
        String data = "";
        parsedData = findViewById(R.id.ParsedData);
        parsedData.setText("");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        covidapi parse = retrofit.create(covidapi.class);

        Call<List<covidModel>> call = parse.getCases();

        call.enqueue(new Callback<List<covidModel>>() {
            @Override
            public void onResponse(Call<List<covidModel>> call, Response<List<covidModel>> response) {
                covidData = (List<covidModel>) response.body();


                for (int i = 0; i < covidData.size(); i++) {
                    if (covidData.get(i).getCountryRegion().equalsIgnoreCase("india"))
                        parsedData.append("\nState :" + covidData.get(i).getProvinceState() +
                                "\nConfirmed :" + covidData.get(i).getConfirmed() +
                                "\nActive :" + covidData.get(i).getActive() +
                                "\nDeaths :" + covidData.get(i).getDeaths());
                }
            }

            @Override
            public void onFailure(Call<List<covidModel>> call, Throwable t) {
                Toast.makeText(JParse.this, "Fail to get data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}