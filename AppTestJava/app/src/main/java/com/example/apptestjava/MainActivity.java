package com.example.apptestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageMonke);

        if (image.getVisibility() == View.INVISIBLE) {
            image.setVisibility(View.VISIBLE);
        }
        else if (image.getVisibility() == View.VISIBLE) {
            image.setVisibility(View.INVISIBLE);
        }

    }
}