package com.example.feilz.tindercopy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by feilz on 08/10/2016.
 */
public class EntryPage extends Activity {
    ImageView title,cont;
    public static Data dt;
    ImageView friends, anything, wink, love;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrypage);
        title = (ImageView)findViewById(R.id.title);
        title.setImageResource(R.drawable.meetin);
        cont = (ImageView)findViewById(R.id.cont);
        cont.setImageResource(R.drawable.continu);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainpage = new Intent(getApplicationContext(), MainPage.class);
                startActivity(mainpage);
            }
        });
        dt = new Data();
        friends = (ImageView)findViewById(R.id.friends);
        setFriends();
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFriends();
            }
        });
        anything = (ImageView)findViewById(R.id.anything);
        setAnything();
        anything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleAnything();
            }
        });
        wink = (ImageView)findViewById(R.id.wink);
        setWink();
        wink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleWink();
            }
        });
        love = (ImageView)findViewById(R.id.love);
        setLove();
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleLove();
            }
        });
    }

    private void toggleFriends(){
        if (dt.getFriends()){
            friends.setImageResource(R.drawable.white_friends);
            dt.setFriends(false);
        } else {
            friends.setImageResource(R.drawable.gray_friends);
            dt.setFriends(true);
        }
    }
    private void toggleAnything(){
        if (dt.getAnything()){
            anything.setImageResource(R.drawable.white_anything);
            dt.setAnything(false);
        } else {
            anything.setImageResource(R.drawable.gray_anything);
            dt.setAnything(true);
        }
    }
    private void toggleWink(){
        if (dt.getWink()){
            wink.setImageResource(R.drawable.white_wink);
            dt.setWink(false);
        } else {
            wink.setImageResource(R.drawable.gray_wink);
            dt.setWink(true);
        }
    }
    private void toggleLove(){
        if (dt.getLove()){
            love.setImageResource(R.drawable.white_love);
            dt.setLove(false);
        } else {
            love.setImageResource(R.drawable.gray_love);
            dt.setLove(true);
        }
    }
    private void setLove(){
        if (dt.getLove()){
            love.setImageResource(R.drawable.gray_love);
        }else{
            love.setImageResource(R.drawable.white_love);
        }
    }
    private void setWink(){
        if (dt.getWink()){
            wink.setImageResource(R.drawable.gray_wink);
        }else{
            wink.setImageResource(R.drawable.white_wink);
        }
    }
    private void setFriends(){
        if (dt.getFriends()){
            friends.setImageResource(R.drawable.gray_friends);
        }else{
            friends.setImageResource(R.drawable.white_friends);
        }
    }
    private void setAnything(){
        if (dt.getAnything()){
            anything.setImageResource(R.drawable.gray_anything);
        }else{
            anything.setImageResource(R.drawable.white_anything);
        }
    }
}
