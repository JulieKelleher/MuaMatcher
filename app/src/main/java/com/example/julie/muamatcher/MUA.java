package com.example.julie.muamatcher;

public class MUA {
    String muaID;
    String FName;
    String LName;
    String Email;
    String Password;
    String Address1;
    String Address2;
    String Town;
    String City;
    String County;
    String Zip;
    String Bridal;
    String Festival;
    String DaytoDay;
    String Occasion;
    String SpecialFX;

    public MUA(){

    }



    public MUA(String muaID, String FName, String LName, String email, String password, String address1, String address2, String town, String city, String county, String zip,String bridal, String festival, String daytoDay, String occasion, String specialFX) {
        this.muaID = muaID;
        this.FName = FName;
        this.LName = LName;
        this.Email = email;
        this.Password = password;
        this. Address1 = address1;
        this.Address2 = address2;
        this.Town = town;
        this.City = city;
        this.County = county;
        this.Zip = zip;
        Bridal = bridal;
        Festival = festival;
        DaytoDay = daytoDay;
        Occasion = occasion;
        SpecialFX = specialFX;
    }

    public String getMuaID() {
        return muaID;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public String getTown() {
        return Town;
    }

    public String getCity() {
        return City;
    }

    public String getCounty() {
        return County;
    }

    public String getZip() {
        return Zip;
    }

    public String getBridal() {
        return Bridal;
    }

    public String getFestival() {
        return Festival;
    }

    public String getDaytoDay() {
        return DaytoDay;
    }

    public String getOccasion() {
        return Occasion;
    }

    public String getSpecialFX() {
        return SpecialFX;
    }
}
