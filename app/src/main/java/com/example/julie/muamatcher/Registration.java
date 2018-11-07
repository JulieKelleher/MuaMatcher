package com.example.julie.muamatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registration extends AppCompatActivity {


    Button btnNext;
    RadioButton rbCustomer;
    RadioButton rbMUA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        rbCustomer = (RadioButton)findViewById(R.id.rbCustomer);
        rbMUA = (RadioButton)findViewById(R.id.rbMUA);
        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rbCustomer.isChecked()) {
                    Intent i = new Intent(Registration.this, RegCust1.class);
                    startActivity(i);
                }
                if(rbMUA.isChecked()){
                    Intent i = new Intent(Registration.this, RegMua1.class);
                    startActivity(i);
                }
                if(!rbCustomer.isChecked() && !rbMUA.isChecked()){
                    Toast.makeText(getApplicationContext(), "Please Select User Type", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
