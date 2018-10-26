package com.example.diskominfo.layanan;

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
    public void notif (View view){
        Intent notifikasi = new Intent(this,NotifActivity.class);
        startActivity(notifikasi);
    }
}
