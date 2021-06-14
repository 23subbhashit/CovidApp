package com.covidscape.app;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class city_wise_data extends AppCompatActivity {

    ListView listView;

    public static List<city_wise_model> modelList = new ArrayList<>();
    city_wise_model model;
    city_wise_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_wise_layout);

        listView = findViewById(R.id.listView);
        fetchData();

    }

    private void fetchData() {

        String url = "https://api.covid19india.org/state_district_wise.json";

        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {

            try {
                // Creating JSON Object
                JSONObject object = new JSONObject(response);

                // From that object we are fetching data
                JSONObject object1 = object.getJSONObject("Uttar Pradesh");
                JSONObject object2 = object1.getJSONObject("districtData");
                JSONObject object3 = object2.getJSONObject("Prayagraj");
                JSONObject object4 = object3.getJSONObject("delta");


                String active = object3.getString("active");
                String confirmed = object3.getString("confirmed");
                String deceased = object3.getString("deceased");
                String recovered = object3.getString("recovered");

                String confInc = object4.getString("confirmed");
                String confDec = object4.getString("deceased");
                String confRec = object4.getString("recovered");

                model = new city_wise_model("Prayagraj", confirmed, deceased, recovered, active,
                        confInc, confDec, confRec);
                modelList.add(model);

                object3 = object2.getJSONObject("Ballia");

                active = object3.getString("active");
                confirmed = object3.getString("confirmed");
                deceased = object3.getString("deceased");
                recovered = object3.getString("recovered");
                object4 = object3.getJSONObject("delta");
                confInc = object4.getString("confirmed");
                confDec = object4.getString("deceased");
                confRec = object4.getString("recovered");

                model = new city_wise_model("Ballia", confirmed, deceased, recovered, active,
                        confInc, confDec, confRec);
                modelList.add(model);

                object3 = object2.getJSONObject("Lucknow");

                active = object3.getString("active");
                confirmed = object3.getString("confirmed");
                deceased = object3.getString("deceased");
                recovered = object3.getString("recovered");
                object4 = object3.getJSONObject("delta");

                confInc = object4.getString("confirmed");
                confDec = object4.getString("deceased");
                confRec = object4.getString("recovered");

                model = new city_wise_model("Lucknow", confirmed, deceased, recovered, active,
                        confInc, confDec, confRec);
                modelList.add(model);

                object3 = object2.getJSONObject("Varanasi");

                active = object3.getString("active");
                confirmed = object3.getString("confirmed");
                deceased = object3.getString("deceased");
                recovered = object3.getString("recovered");
                object4 = object3.getJSONObject("delta");

                confInc = object4.getString("confirmed");
                confDec = object4.getString("deceased");
                confRec = object4.getString("recovered");

                model = new city_wise_model("Varanasi", confirmed, deceased, recovered, active,
                        confInc, confDec, confRec);
                modelList.add(model);

                object3 = object2.getJSONObject("Agra");

                active = object3.getString("active");
                confirmed = object3.getString("confirmed");
                deceased = object3.getString("deceased");
                recovered = object3.getString("recovered");
                object4 = object3.getJSONObject("delta");
                confInc = object4.getString("confirmed");
                confDec = object4.getString("deceased");
                confRec = object4.getString("recovered");

                model = new city_wise_model("Agra", confirmed, deceased, recovered, active,
                        confInc, confDec, confRec);
                modelList.add(model);

                adapter = new city_wise_Adapter(city_wise_data.this, modelList);
                listView.setAdapter(adapter);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(city_wise_data.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}
