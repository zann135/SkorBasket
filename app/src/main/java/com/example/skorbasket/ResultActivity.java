package com.example.skorbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result, subJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = findViewById(R.id.textView3);
        subJudul = findViewById(R.id.textView2);


        if (getIntent().getBooleanExtra("seri", false) == true){
            subJudul.setText("Hasil Pertandingannya Seri");
            result.setVisibility(View.INVISIBLE);
        }else{
            result.setText(getIntent().getExtras().getString("winner"));
        }
    }
}