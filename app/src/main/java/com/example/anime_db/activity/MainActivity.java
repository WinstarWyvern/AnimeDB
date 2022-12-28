package com.example.anime_db.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.anime_db.R;
import com.example.anime_db.activity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickLoginBtn(View v){
        Intent toHome = new Intent(this, HomeActivity.class);
        String name = ((EditText)findViewById(R.id.textUserName)).getText().toString();

        if(name.equals("")){
            name = "Guest";
        }
        toHome.putExtra("username",name);
        startActivity(toHome);
    }

}