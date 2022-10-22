package com.example.anime_db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickLoginBtn(View v){
        Intent toHome = new Intent(this,HomeActivity.class);
        String name = ((EditText)findViewById(R.id.textUserName)).getText().toString();

        if(name.equals("")){
            name = "Guest";
        }
        toHome.putExtra("username",name);
        startActivity(toHome);
    }

}