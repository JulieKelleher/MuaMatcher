package com.example.julie.muamatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegMua1 extends AppCompatActivity {
    Button btnNext;
    EditText etFNameMUA, etSurnameMUA, etEmailMUA, etPasswordMUA;
    String FNameMUA,SurnameMUA,PasswordMUA,EmailMUA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_mua1);

        //Assign what is in the edittext boxes etc and assign themto the variables declared
        etFNameMUA = (EditText)findViewById(R.id.etFNameMUA);
        etSurnameMUA = (EditText)findViewById(R.id.etSurnameMUA);
        etEmailMUA = (EditText)findViewById(R.id.etEmailMUA);
        etPasswordMUA = (EditText)findViewById(R.id.etPasswordMUA);

        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegMua1.this, RegMua2.class);
                //Assign the variables to a string to reference to in the next page
                // Used Youtube tutorial to help me with this: Passing Edit Text Value From One Activity to Another Activity
                FNameMUA = etFNameMUA.getText().toString();
                SurnameMUA = etSurnameMUA.getText().toString();
                EmailMUA = etEmailMUA.getText().toString();
                PasswordMUA = etPasswordMUA.getText().toString();
                //in the next page the name will be called and will contain the variable
                i.putExtra("FNameMUA",FNameMUA);
                i.putExtra("LNameMUA",SurnameMUA);
                i.putExtra("EmailMUA",EmailMUA);
                i.putExtra("PasswordMUA",PasswordMUA);
                startActivity(i);
            }
        });
    };
}