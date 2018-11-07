package com.example.julie.muamatcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegMua3 extends AppCompatActivity {

    TextView tvFName,tvLName, tvPassword, tvEmail, tvAddress1, tvAddress2, tvTown, tvCity, tvCounty, tvZip;
    String FName, LName, Email,Password,Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX;
    Button btnFinish;
    FirebaseDatabase database;
    DatabaseReference databaseMUAs;
    CheckBox cbBridal, cbFestival, cbDaytoDay, cbOccasion, cbSpecialFx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_mua3);
        database = FirebaseDatabase.getInstance();
        databaseMUAs = FirebaseDatabase.getInstance().getReference("muas");

        tvFName = (TextView)findViewById(R.id.tvReg1);
        tvLName = (TextView)findViewById(R.id.tvReg2);
        tvEmail = (TextView)findViewById(R.id.tvReg3);
        tvPassword = (TextView)findViewById(R.id.tvReg4);
        tvAddress1 = (TextView)findViewById(R.id.tvReg5);
        tvAddress2 = (TextView)findViewById(R.id.tvReg6);
        tvTown = (TextView)findViewById(R.id.tvReg7);
        tvCity = (TextView)findViewById(R.id.tvReg8);
        tvCounty = (TextView)findViewById(R.id.tvReg9);
        tvZip = (TextView)findViewById(R.id.tvReg10);
        cbBridal = (CheckBox)findViewById(R.id.cbBridal);
        cbFestival=(CheckBox)findViewById(R.id.cbFestival);
        cbDaytoDay =(CheckBox)findViewById(R.id.cbDay);
        cbOccasion=(CheckBox)findViewById(R.id.cbOccasion);
        cbSpecialFx = (CheckBox)findViewById(R.id.cbFX);


        //Bring in the data from previous page and set it to the text of the textviews
        // Used Youtube tutorial to help me with this: Passing Edit Text Value From One Activity to Another Activity
        FName = getIntent().getExtras().getString("FNameMUA");
        LName = getIntent().getExtras().getString("LNameMUA");
        Email = getIntent().getExtras().getString("EmailMUA");
        Password = getIntent().getExtras().getString("PasswordMUA");
        Address1 = getIntent().getExtras().getString("Address1");
        Address2 = getIntent().getExtras().getString("Address2");
        Town = getIntent().getExtras().getString("Town");
        City = getIntent().getExtras().getString("City");
        County = getIntent().getExtras().getString("County");
        Zip = getIntent().getExtras().getString("Zip");
        tvFName.setText(FName);
        tvLName.setText(LName);
        tvEmail.setText(Email);
        tvPassword.setText(Password);
        tvAddress1.setText(Address1);
        tvAddress2 .setText(Address2);
        tvTown .setText(Town);
        tvCity .setText(City);
        tvCounty.setText(County);
        tvZip.setText(Zip);

        btnFinish = (Button)findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMUA();


            }
        });
    }

    private void addMUA(){


        String FName = tvFName.getText().toString().trim();
        String LName = tvLName.getText().toString().trim();
        String Email = tvEmail.getText().toString().trim();
        String Password = tvPassword.getText().toString().trim();
        String Address1 = tvAddress1.getText().toString().trim();
        String Address2 = tvAddress2.getText().toString().trim();
        String Town = tvTown.getText().toString().trim();
        String City = tvCity.getText().toString().trim();
        String County = tvCounty.getText().toString().trim();
        String Zip = tvZip.getText().toString().trim();



        if(cbBridal.isChecked() && cbFestival.isChecked()&& cbDaytoDay.isChecked()&&cbOccasion.isChecked()&& cbSpecialFx.isChecked()){

            String id = databaseMUAs.push().getKey();
            String Bridal = "Bridal";
            String Festival = "Festival";
            String DaytoDay = "Day to Day";
            String Occasion = "Occasion";
            String SpecialFX = "Special FX";


            MUA mua = new MUA(id, FName,LName,Email,Password,Address1,Address2,Town,City,County,Zip,Bridal,Festival,DaytoDay,Occasion,SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }

        else if(!cbBridal.isChecked()  || !cbFestival.isChecked() || !cbDaytoDay.isChecked() || !cbOccasion.isChecked() || !cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "";
            String DaytoDay = "";
            String Occasion = "";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
        else if(cbBridal.isChecked()  || !cbFestival.isChecked() || !cbDaytoDay.isChecked() || !cbOccasion.isChecked() || !cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "Bridal";
            String Festival = "";
            String DaytoDay = "";
            String Occasion = "";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
        else if (!cbBridal.isChecked()  || cbFestival.isChecked() || !cbDaytoDay.isChecked() || !cbOccasion.isChecked() || !cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "Festival";
            String DaytoDay = "";
            String Occasion = "";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
       else if(!cbBridal.isChecked()  || !cbFestival.isChecked() || cbDaytoDay.isChecked() || !cbOccasion.isChecked() || !cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "";
            String DaytoDay = "Day to Day";
            String Occasion = "";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
        else if(!cbBridal.isChecked()  || !cbFestival.isChecked() || !cbDaytoDay.isChecked() || cbOccasion.isChecked() || !cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "";
            String DaytoDay = "";
            String Occasion = "Occasion";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
        else if(!cbBridal.isChecked()  || !cbFestival.isChecked() || !cbDaytoDay.isChecked() || !cbOccasion.isChecked() || cbSpecialFx.isChecked()) {

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "";
            String DaytoDay = "";
            String Occasion = "";
            String SpecialFX = "Special FX";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
        else {
           // (!cbBridal.isChecked()  || cbFestival.isChecked() || !cbDaytoDay.isChecked() || cbOccasion.isChecked() || !cbSpecialFx.isChecked())

            String id = databaseMUAs.push().getKey();
            String Bridal = "";
            String Festival = "Festival";
            String DaytoDay = "";
            String Occasion = "Occasion";
            String SpecialFX = "";
            MUA mua = new MUA(id, FName, LName, Email, Password, Address1, Address2, Town, City, County, Zip, Bridal, Festival, DaytoDay, Occasion, SpecialFX);
            databaseMUAs.child(id).setValue(mua);
            Toast.makeText(this, "Makeup Artist Added", Toast.LENGTH_LONG).show();
            Intent i = new Intent(RegMua3.this, HomeMua.class);
            startActivity(i);
        }
    }


}