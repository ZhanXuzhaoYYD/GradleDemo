package com.zxz.gradledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        StringBuilder sb = new StringBuilder();
        sb.append("Y10\n")
                .append("applicationId: ")
                .append(AppUtils.getAppPackageName())
                .append("\n")
                .append("version code: ")
                .append(AppUtils.getAppVersionCode())
                .append("\n")
                .append("version name: ")
                .append(AppUtils.getAppVersionName());
        tv.setText(sb.toString());

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastText("y10");
            }
        });


    }

    private void toastText(String text) {
        Toast.makeText(this,
                text,
                Toast.LENGTH_SHORT).show();
    }
}
