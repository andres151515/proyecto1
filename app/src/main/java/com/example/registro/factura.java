package com.example.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class factura extends AppCompatActivity {
    private Button a3, c3, s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);


            a3=findViewById(R.id.a3);
            c3=findViewById(R.id.c3);
            s3=findViewById(R.id.s3);


           s3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(factura.this,MainActivity.class));

                }
            });
    }
}
