package com.example.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class producto extends AppCompatActivity {
    private Button a1, c1, s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        a1=findViewById(R.id.a1);
        c1=findViewById(R.id.c1);
        s1=findViewById(R.id.s1);


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(producto.this,MainActivity.class));

            }
        });
    }
}
