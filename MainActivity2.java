package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
ImageView imageView1;
Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView1=(ImageView) findViewById(R.id.image1);

        Intent intent = getIntent();
        bitmap = (Bitmap) intent.getParcelableExtra("image");
        imageView1.setImageBitmap(bitmap);
    }
}