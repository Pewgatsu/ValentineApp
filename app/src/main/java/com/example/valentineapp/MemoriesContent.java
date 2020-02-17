package com.example.valentineapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MemoriesContent extends AppCompatActivity {

    ImageView selectedImage;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_memories);
        selectedImage = (ImageView) findViewById(R.id.selectedImage); // init a ImageView
        textView = (TextView) findViewById(R.id.textView6);
        Intent intent = getIntent(); // get Intent which we set from Previous Activity
        selectedImage.setImageResource(intent.getIntExtra("image", 0)); // get image from Intent and set it in ImageView
        textView.setText(intent.getIntExtra("description",0));
    }
}
