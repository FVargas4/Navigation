package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    Button botonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

    botonLogin = findViewById(R.id.login);


        botonLogin.setOnClickListener(new View.OnClickListener(){

        public void onClick(View v){
            startActivity(new Intent(com.example.navigation.LoginScreen.this, Menu2Activity.class));

        }

        });
    }
}