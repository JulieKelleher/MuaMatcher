package com.example.julie.muamatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegister = (TextView)findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {


            Intent i = new Intent(Login.this, Registration.class);
            startActivity(i);
    }
  });
 }
}


