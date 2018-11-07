package com.example.julie.muamatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegCust1 extends AppCompatActivity {

    //Declare the variables
    EditText etFNameCust, etSurnameCust, etEmailCust, etPasswordCust;
    Button btnFinish;
    FirebaseDatabase database;
    DatabaseReference databaseCustomers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_cust1);

        database = FirebaseDatabase.getInstance();
        databaseCustomers = FirebaseDatabase.getInstance().getReference("customers");


        //Assign what is in the edittext boxes etc and assign themto the variables declared
        etFNameCust = (EditText)findViewById(R.id.etFNameCust);
        etSurnameCust = (EditText)findViewById(R.id.etSurnameCust);
        etEmailCust = (EditText)findViewById(R.id.etEmailCust);
        etPasswordCust = (EditText)findViewById(R.id.etPasswordCust);
        btnFinish = (Button)findViewById(R.id.btnFinish);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCustomer();


            }
        });
    }

    private void addCustomer(){
        String FNameCust = etFNameCust.getText().toString().trim();
        String SurnameCust = etSurnameCust.getText().toString().trim();
        String EmailCust = etEmailCust.getText().toString().trim();
        String PasswordCust = etPasswordCust.getText().toString().trim();



        if(!TextUtils.isEmpty(FNameCust)&& !TextUtils.isEmpty(SurnameCust)&&!TextUtils.isEmpty(EmailCust)&&!TextUtils.isEmpty(PasswordCust)){

            String id = databaseCustomers.push().getKey();

            Customer customer = new Customer(id, FNameCust, SurnameCust,EmailCust,PasswordCust);
            databaseCustomers.child(id).setValue(customer);
            Toast.makeText(this, "Customer Added", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(RegCust1.this, Login.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Please Fill Out All Fields", Toast.LENGTH_LONG).show();
        }

    }
}
