package com.zxz.gradledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = BuildConfig.API_URL + " --- " + BuildConfig.LOG;
        toastText(text);
    }

    private void toastText(String text) {
        Toast.makeText(this,
                text,
                Toast.LENGTH_SHORT).show();
    }
}
