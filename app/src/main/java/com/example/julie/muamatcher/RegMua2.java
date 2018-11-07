package com.example.julie.muamatcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegMua2 extends AppCompatActivity {
    Button btnNext;
    EditText etAddress1, etAddress2, etTown, etCity, etZip, etCounty;
    TextView tvFName,tvLName, tvEmail,tvPassword ;
    String FName, LName, Email,Password,FNameMUA,SurnameMUA,PasswordMUA,EmailMUA, Address1, Address2, Town,City,County,Zip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_mua2);

        etAddress1 = (EditText)findViewById(R.id.etAddressLine1);
        etAddress2 = (EditText)findViewById(R.id.etAddressLine2);
        etTown =(EditText)findViewById(R.id.etTown);
        etCity = (EditText)findViewById(R.id.etCity);
        etZip =(EditText)findViewById(R.id.etZip);
        etCounty = (EditText)findViewById(R.id.etCounty);



        tvFName = (TextView)findViewById(R.id.tvReg1);
        tvLName = (TextView)findViewById(R.id.tvReg2);
        tvEmail = (TextView)findViewById(R.id.tvReg3);
        tvPassword = (TextView)findViewById(R.id.tvReg4);


        //Bring in the data from previous page and set it to the text of the textviews
        FName = getIntent().getExtras().getString("FNameMUA");
        LName = getIntent().getExtras().getString("LNameMUA");
        Email = getIntent().getExtras().getString("EmailMUA");
        Password = getIntent().getExtras().getString("PasswordMUA");
        tvFName.setText(FName);
        tvLName.setText(LName);
        tvEmail.setText(Email);
        tvPassword.setText(Password);




        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegMua2.this, RegMua3.class);
                //Assign the variables to a string to reference to in the next page
                // Used Youtube tutorial to help me with this: Passing Edit Text Value From One Activity to Another Activity
                FNameMUA = tvFName.getText().toString();
                SurnameMUA = tvLName.getText().toString();
                EmailMUA = tvPassword.getText().toString();
                PasswordMUA = tvEmail.getText().toString();
                Address1 = etAddress1.getText().toString();
                Address2 = etAddress2.getText().toString();
                Town = etTown.getText().toString();
                City = etCity.getText().toString();
                Zip = etZip.getText().toString();
                County = etCounty.getText().toString();
                //in the next page the name will be called and will contain the variable
                i.putExtra("FNameMUA",FNameMUA);
                i.putExtra("LNameMUA",SurnameMUA);
                i.putExtra("EmailMUA",EmailMUA);
                i.putExtra("PasswordMUA",PasswordMUA);
                i.putExtra("Address1", Address1);
                i.putExtra("Address2", Address2);
                i.putExtra("Town",Town);
                i.putExtra("City",City);
                i.putExtra("County",County);
                i.putExtra("Zip",Zip);
                startActivity(i);
            }
        });
    };
}
