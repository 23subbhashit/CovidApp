package www.bmsit.loginatuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    //LazyLoader lights;
    boolean isLoadAnimationPlaying = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        lights = (LazyLoader) findViewById(R.id.lazy);
//        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
//                ContextCompat.getColor(this, R.color.loader_selected),
//                ContextCompat.getColor(this, R.color.loader_selected));
//        loader.setAnimDuration(1000);
//        loader.setFirstDelayDuration(100);
//        loader.setSecondDelayDuration(200);
//        loader.setInterpolator(new LinearInterpolator());
//
//        lights.addView(loader);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(MainActivity.this, /*MainActivity3.class*/ JParse.class);
                startActivity(i);
                finish();
            }
        }, 2000);


    }


}