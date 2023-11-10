package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    LinearLayout personLinearLayout;
    CardView cactusCardView;
    CardView chairCardView;
    CardView worderCardView;
    CardView lampCardView;
    CardView item5CardView;
    CardView item6CardView;
    CardView item7CardView;
    CardView item8CardView;
    CardView item9CardView;
    CardView item10CardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        personLinearLayout = findViewById(R.id.person_linear_layout);
//        favorite = findViewById(R.id.favorite);

        cactusCardView = findViewById(R.id.cactus_card_view);
        chairCardView = findViewById(R.id.chair);
        worderCardView = findViewById(R.id.worder);
        lampCardView = findViewById(R.id.lamp);
        item5CardView = findViewById(R.id.item5);
        item6CardView = findViewById(R.id.item6);
        item7CardView = findViewById(R.id.item7);
        item8CardView = findViewById(R.id.item8);
        item9CardView = findViewById(R.id.item9);
        item10CardView = findViewById(R.id.item10);

//        personLinearLayout.setOnClickListener(view -> {
//            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
//            startActivity(intent);
//        });
//        favorite.setOnClickListener(view -> {
//            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
//            startActivity(intent);
//        });
        cactusCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);

        });
        chairCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), activity_main6.class);
            startActivity(intent);

        });
        worderCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
            startActivity(intent);
        });
        lampCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity8.class);
            startActivity(intent);
        });

        item5CardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity9.class);
            startActivity(intent);
        });
        item6CardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity10.class);
            startActivity(intent);
        });
        item7CardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity11.class);
            startActivity(intent);
        });
        item8CardView.setOnClickListener(view ->{
            Intent intent = new Intent(getApplicationContext(), MainActivity12.class);
            startActivity(intent);
        });
       item9CardView.setOnClickListener(view -> {
           Intent intent = new Intent(getApplicationContext(), MainActivity13.class);
           startActivity(intent);
       });
        item10CardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity14.class);
            startActivity(intent);
        });
    }
}
