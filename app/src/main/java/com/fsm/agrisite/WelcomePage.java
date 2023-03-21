package com.fsm.agrisite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomePage extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(username.getText().toString().equals("user") && password.getText().toString().equals("1234")){
                    Toast.makeText(WelcomePage.this, "Login Success !", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(WelcomePage.this, "Login Failed !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}