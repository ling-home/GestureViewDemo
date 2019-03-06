package com.wdh.destureviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.wdh.destureview.GestureViewManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView targetView = findViewById(R.id.targetView);
        RelativeLayout groupView = findViewById(R.id.groupView);
        RelativeLayout parentView = findViewById(R.id.parentView);
        parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
        GestureViewManager bind = GestureViewManager.bind(this, groupView, parentView);
        bind.setFullGroup(true);
        bind.setOnScaleListener(new GestureViewManager.OnScaleListener() {
            @Override
            public void onScale(float scale) {
                Log.i("TAG", scale + "");
            }
        });
    }

}