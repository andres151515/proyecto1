package com.example.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cliente extends AppCompatActivity {
    private Button a2, c2, s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        a2=findViewById(R.id.a2);
        c2=findViewById(R.id.c2);
        s2=findViewById(R.id.s2);


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cliente.this,MainActivity.class));

            }
        });
    }
}
