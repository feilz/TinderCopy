package com.example.feilz.tindercopy;


import android.content.res.Resources;

public class Users {
    String name;
    int resID;
    String ika;

    public Users(String names,String namesReal,String age){
        resID = Resources.getSystem().getIdentifier(names, "drawable", BuildConfig.APPLICATION_ID);
        this.name = namesReal;
        ika = age;
    }
}
