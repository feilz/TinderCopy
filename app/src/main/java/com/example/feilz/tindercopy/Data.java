package com.example.feilz.tindercopy;

import android.app.Application;
/**
 * Created by feilz on 08/10/2016.
 */
public class Data extends Application {
    private boolean friends, anything, wink, love, looksForMen, looksForWomen, iAmMan;
    private int myAge, maxSearchDistance, looksForAgeMin, looksForAgeMax;

    public Data() {
        friends=false;
        anything=false;
        wink=false;
        love=false;
        looksForMen=false;
        looksForWomen=false;
        iAmMan=false;
        myAge=0;
        maxSearchDistance=0;
        looksForAgeMin=0;
        looksForAgeMax=100;
    }
    public synchronized void setiAmMan(boolean x){
        iAmMan=x;
    }
    public synchronized void setLooksForMen(boolean x){
        looksForMen =x;
    }
    public synchronized void setLooksForWomen(boolean x){
        looksForWomen = x;
    }
    public synchronized void setmyAge(int x){
        myAge = x;
    }
    public synchronized void setLooksforAgeMin(int x){
        looksForAgeMin = x;
    }
    public synchronized void setLooksForAgeMax(int x){
        looksForAgeMax = x;
    }
    public synchronized void setMaxSearchDistance(int x){
        maxSearchDistance = x;
    }

    public synchronized void setFriends(boolean x){
        friends = x;
    }
    public synchronized void setAnything(boolean x){
        anything = x;
    }

    public synchronized void setWink(boolean x){
        wink = x;
    }

    public synchronized void setLove(boolean x){
        love = x;
    }
    public boolean getFriends(){
        return friends;
    }

    public boolean getAnything(){
        return anything;
    }

    public boolean getWink(){
        return wink;
    }
    public boolean getLove(){
        return love;
    }
    public boolean getLooksForMen(){
        return looksForMen;
    }
    public boolean getLooksForWomen(){
        return looksForWomen;
    }
    public int getMyAge(){
        return myAge;
    }
    public int getMaxSearchDistance(){
        return maxSearchDistance;
    }
    public int getLooksForAgeMin(){
        return looksForAgeMin;
    }
    public int getLooksForAgeMax(){
        return looksForAgeMax;
    }
    public boolean getIAmMan(){
        return iAmMan;
    }
}

