package com.istiak.audiopoem;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PoemActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnPause,btnStart;
    TextView subtitle;
    Boolean isPlaying =false;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        imageView = findViewById(R.id.imageView);
        btnPause = findViewById(R.id.btn_pause);
        btnStart = findViewById(R.id.btn_play);
        subtitle = findViewById(R.id.subtitle);


        String getId = getIntent().getExtras().getString("id");


        if (getId.equals("poem1")){
            imageView.setImageResource(R.drawable.poem1);

            subtitle.setText(R.string.poem1);

            player = MediaPlayer.create(PoemActivity.this,R.raw.poem1);

            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == false){
                        player.start();

                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == true){
                        player.pause();

                        isPlaying = false;
                    }
                }
            });

        }

        if (getId.equals("poem2")){
            imageView.setImageResource(R.drawable.poem2);
            subtitle.setText(R.string.poem2);

            player = MediaPlayer.create(PoemActivity.this,R.raw.poem2);

            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == false){
                        player.start();

                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == true){
                        player.pause();

                        isPlaying = false;
                    }
                }
            });
        }

        if (getId.equals("poem3")){
            imageView.setImageResource(R.drawable.poem3);
            subtitle.setText(R.string.poem3);

            player = MediaPlayer.create(PoemActivity.this,R.raw.poem3);

            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == false){
                        player.start();

                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == true){
                        player.pause();

                        isPlaying = false;
                    }
                }
            });
        }



        if (getId.equals("poem4")){
            imageView.setImageResource(R.drawable.poem4);
            subtitle.setText(R.string.poem4);

            player = MediaPlayer.create(PoemActivity.this,R.raw.poem4);

            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == false){
                        player.start();

                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == true){
                        player.pause();

                        isPlaying = false;
                    }
                }
            });
        }



        if (getId.equals("poem5")){
            imageView.setImageResource(R.drawable.poem5);
            subtitle.setText(R.string.poem5);

            player = MediaPlayer.create(PoemActivity.this,R.raw.poem5);

            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == false){
                        player.start();

                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying == true){
                        player.pause();

                        isPlaying = false;
                    }
                }
            });
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        player.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        player.start();
    }
}
