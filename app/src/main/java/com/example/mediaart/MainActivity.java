package com.example.mediaart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image1_1;
    ImageView image1_2;
    ImageView image1_3;
    ImageView image1_4;

    ImageView image2_1;
    ImageView image2_2;
    ImageView image2_3;
    ImageView image2_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN
        );

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);

        image1_1 = this.findViewById(R.id.ImageView1_1);
        image1_2 = this.findViewById(R.id.ImageView1_2);
        image1_3 = this.findViewById(R.id.ImageView1_3);
        image1_4 = this.findViewById(R.id.ImageView1_4);

        image2_1 = this.findViewById(R.id.ImageView2_1);
        image2_2 = this.findViewById(R.id.ImageView2_2);
        image2_3 = this.findViewById(R.id.ImageView2_3);
        image2_4 = this.findViewById(R.id.ImageView2_4);

        image1_1.setOnClickListener(this);
        image1_2.setOnClickListener(this);
        image1_3.setOnClickListener(this);
        image1_4.setOnClickListener(this);
        image2_1.setOnClickListener(this);
        image2_2.setOnClickListener(this);
        image2_3.setOnClickListener(this);
        image2_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ImageView1_1){
            Toast t = Toast.makeText(this.getApplicationContext(), "1번 이미지", Toast.LENGTH_LONG);
            t.show();
            Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
        } else if(v.getId() == R.id.ImageView1_2){
            Toast t = Toast.makeText(this.getApplicationContext(), "2번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView1_3){
            Toast t = Toast.makeText(this.getApplicationContext(), "3번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView1_4){
            Toast t = Toast.makeText(this.getApplicationContext(), "4번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView2_1){
            Toast t = Toast.makeText(this.getApplicationContext(), "5번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView2_2){
            Toast t = Toast.makeText(this.getApplicationContext(), "6번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView2_3){
            Toast t = Toast.makeText(this.getApplicationContext(), "7번 이미지", Toast.LENGTH_LONG);
            t.show();
        } else if(v.getId() == R.id.ImageView2_4){
            Toast t = Toast.makeText(this.getApplicationContext(), "8번 이미지", Toast.LENGTH_LONG);
            t.show();
        }

    }



}