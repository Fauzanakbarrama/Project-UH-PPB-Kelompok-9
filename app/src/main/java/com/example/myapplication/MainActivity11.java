package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    public void openShopeeLink(View view) {
        String shopeeLink = "https://shp.ee/rt576xa";
        Uri linkShopee = Uri.parse(shopeeLink);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        builder.setMessage("Do you want to open Shopee link?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked Yes button
                        Intent i = new Intent(Intent.ACTION_VIEW, linkShopee);
                        startActivity(i);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked No button
                        // You can add code here to handle the case when the user clicks No
                    }
                });
// Create the AlertDialog object and show it
        builder.create().show();


    }
}