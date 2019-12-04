package com.istiak.audiopoem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1234,btn_abc,btn_bingo,btn_baa_baa,btn_head_and_shoulders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1234 = findViewById(R.id.btn_poem1);
        btn_abc = findViewById(R.id.btn_poem2);
        btn_bingo = findViewById(R.id.btn_poem3);
        btn_baa_baa = findViewById(R.id.btn_poem4);
        btn_head_and_shoulders = findViewById(R.id.btn_poem5);

        btn_1234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PoemActivity.class);
                intent.putExtra("id","poem1");
                startActivity(intent);

            }
        });




        btn_abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PoemActivity.class);
                intent.putExtra("id","poem2");
                startActivity(intent);

            }
        });



        btn_bingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PoemActivity.class);
                intent.putExtra("id","poem3");
                startActivity(intent);

            }
        });




        btn_baa_baa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PoemActivity.class);
                intent.putExtra("id","poem4");
                startActivity(intent);

            }
        });





        btn_head_and_shoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PoemActivity.class);
                intent.putExtra("id","poem5");
                startActivity(intent);

            }
        });

    }
}
