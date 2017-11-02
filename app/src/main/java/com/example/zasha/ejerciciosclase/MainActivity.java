package com.example.zasha.ejerciciosclase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar_RelativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }

    public void mostrar_TableLayout(View view) {
        Intent intent = new Intent(this, TableLayout.class);
        startActivity(intent);
    }

}
