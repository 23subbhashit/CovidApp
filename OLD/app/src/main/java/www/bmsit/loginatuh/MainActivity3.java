package www.bmsit.loginatuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity3 extends AppCompatActivity {
    TextView tv;
    String url="https://jsonplaceholder.typicode.com/";
//    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText("");
//        b.findViewById(R.id.button);
        Retrofit retrofit=new Retrofit.Builder()
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
                    tv.append(" SL No:"+data.get(i).getId()+" \n Title :"+data.get(i).getTitle()+"\n\n\n");
            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {

            }
        });

//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity3.this, JsonParser.class);
//                startActivity(i);
//            }
//        });
    }

}