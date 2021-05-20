package www.bmsit.loginatuh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JParse extends AppCompatActivity {

    private TextView parsedData;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jparse);
        String data = "";

        parsedData = (TextView) findViewById(R.id.ParsedData);
        //url = "https://covid19.mathdro.id/api/confirmed";

        try {
            URL Url = new URL("https://covid19.mathdro.id/api/confirmed");
            HttpURLConnection conn = (HttpURLConnection) Url.openConnection();

            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while ((line = bufferedReader.readLine()) != null){
                data = data + line;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        JsonObject obj = null;
        JsonArray array = null;
        JsonParser parser = new JsonParser();

        if (parser.parse(data).isJsonObject())
            obj = parser.parse(data).getAsJsonObject();
        else if (parser.parse(data).isJsonArray())
            array = parser.parse(data).getAsJsonArray();
        else {
            obj = null;
            array = null;
        }
        int confirmed[],deaths[], active[], count = 0;

        System.out.println(obj.toString());
        System.out.println(array.toString());

//        for (int i = 0; i < array.size(); i++)
//            if (array.get(i).isJsonObject())
//            {
//                obj = array.get(i).getAsJsonObject();
//                String country = obj.get("countryRegion").toString();
//                if(country.equalsIgnoreCase("india"))
//                    count++;
//            }
//
//        confirmed = new int[count];
//        deaths = new int[count];
//        active = new int[count];
//
//        for (int i = 0; i < count; i++) {
//            if (array.get(i).isJsonObject())
//            {
//                 obj = array.get(i).getAsJsonObject();
//                String country = obj.get("countryRegion").toString();
//                if(country.equalsIgnoreCase("india"))
//                {
//                    confirmed[i] = Integer.parseInt(obj.get("confirmed").toString());
//                    deaths[i] = Integer.parseInt(obj.get("deaths").toString());
//                    active[i] = Integer.parseInt(obj.get("active").toString());
//                }
//            }
//
//        }
//
//        for (int i = 0; i < count; i++) {
//            if (array.get(i).isJsonObject())
//            {
//                obj = array.get(i).getAsJsonObject();
//                String country = obj.get("countryRegion").toString();
//                if(country.equalsIgnoreCase("india"))
//                {
//                    confirmed[i] = Integer.parseInt(obj.get("confirmed").toString());
//                    deaths[i] = Integer.parseInt(obj.get("deaths").toString());
//                    active[i] = Integer.parseInt(obj.get("active").toString());
//
//                    parsedData.append("State : " + obj.get("provinceState") +
//                                      "Active :" + confirmed[i] +
//                                      "Death :" + deaths[i]);
//                }
//            }
//
//        }

/*        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jsonParse();
            }
        });

 */

        /*Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myapi api=retrofit.create(myapi.class);

        Call<List<model>> call=api.getmodels();

        call.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {
                List<model> data=response.body();
                for(int i=0; i<data.size();i++)
                    parsedData.append(" SL No:"+data.get(i).getId()+" \n Title :"+data.get(i).getTitle()+"\n\n\n");

            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {

            }
        });
        */

    }

    //JSON PARSE METHOD
    /*private void jsonParse(){
        String url = "https://covid19.mathdro.id/api/confirmed";
        JsonArrayRequest req = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            int count = 0;
                            JSONArray array = response.getJSONArray();

                            for (int i = 0;; i++) {
                                if(response.getString("countryRegion").equalsIgnoreCase("India")) {
                                    count++;
                                }
                            }

                            int[] confirmed;
                            int[] active;
                            int[] deaths;
                            confirmed = new int[count];
                            active = new int[count];
                            deaths = new int[count];

                            for (int i = 0; i < count; i++) {
                                if(response.getString("countryRegion").equalsIgnoreCase("India"))
                                {
                                    confirmed[i] = Integer.parseInt(response.getString("confirmed"));
                                    active[i] = Integer.parseInt(response.getString("active"));
                                    deaths[i] = Integer.parseInt(response.getString("deaths"));

                                }
                            }

                            for (int i = 0; i < count; i++) {
                                parsedData.append("Confirmed: " + confirmed[i]);
                                parsedData.append("Active: " + active[i]);
                                parsedData.append("Deaths: " + deaths[i]);

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
    }

     */
}