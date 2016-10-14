package com.example.feilz.tindercopy;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainPage extends Activity implements View.OnClickListener {
    private int i=-1;
    ImageView pic,loveSM,friendsSM,anythingSM,winkSM,like,dislike,roope;
    TextView name,age;
    ArrayList<Users> testUsers;
    RelativeLayout bk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        testUsers = new ArrayList<>();
        testUsers.add(new Users("brad1", "Brad", "52"));
        testUsers.add(new Users("cristiano1", "Cristiano", "31"));
        testUsers.add(new Users("emma1", "Emma", "26"));
        testUsers.add(new Users("beyonce1", "Beyonce", "35"));
        testUsers.add(new Users("iggy1", "Iggy", "26"));
        pic= (ImageView)findViewById(R.id.profpic);
        name = (TextView)findViewById(R.id.profname);
        age = (TextView)findViewById(R.id.profage);
        swapImage();
        loveSM=(ImageView)findViewById(R.id.loveSM);
        if (EntryPage.dt.getLove()) loveSM.setImageResource(R.drawable.gray_love_sm);
        else {loveSM.setImageResource(R.drawable.white_love_sm);}
        friendsSM=(ImageView)findViewById(R.id.friendsSM);
        if (EntryPage.dt.getFriends())friendsSM.setImageResource(R.drawable.gray_friends_sm);
        else {friendsSM.setImageResource(R.drawable.white_friends_sm);}
        anythingSM=(ImageView)findViewById(R.id.anythingSM);
        if (EntryPage.dt.getAnything())anythingSM.setImageResource(R.drawable.gray_anything_sm);
        else {anythingSM.setImageResource(R.drawable.white_anything_sm);}
        winkSM=(ImageView)findViewById(R.id.winkSM);
        if (EntryPage.dt.getWink()) winkSM.setImageResource(R.drawable.gray_wink_sm);
        else {winkSM.setImageResource(R.drawable.white_wink_sm);}
        bk=(RelativeLayout)findViewById(R.id.back);
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        like = (ImageView)findViewById(R.id.yes);
        like.setImageResource(R.drawable.accept);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapImage();
            }
        });
        dislike =(ImageView)findViewById(R.id.no);
        dislike.setImageResource(R.drawable.deny);
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapImage();
            }
        });/*
        pic.setOnClickListener(this);
        gest = new GestureDetector(this,new MyGestureDetector());
        gestListener = new View.OnTouchListener(){
            public boolean onTouch(View v,MotionEvent m){
                return gest.onTouchEvent(m);
            }
        };*/
        roope=(ImageView)findViewById(R.id.roope);
        roope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRoope();
            }
        });
    }
/*
    class MyGestureDetector extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            try {
                if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) swapImage();
                else if (Math.abs(e2.getX()-e1.getX())>SWIPE_MAX_OFF_PATH) swapImage();
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    pic.setTranslationX(e1.getX());
                    Toast.makeText(MainPage.this, "Left Swipe", Toast.LENGTH_SHORT).show();
                } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    pic.setTranslationX(e2.getX());
                    Toast.makeText(MainPage.this, "Right Swipe", Toast.LENGTH_SHORT).show();
                }
            } catch (Exception e) {
                // nothing
            }
            return false;
        }

    }*/
    public void onClick(View v){

    }
    public void swapImage(){
        i+=1;
        if (i== 5){
            i=0;
        }
        if (i==0) pic.setImageResource(R.drawable.brad1);
        else if(i==1) pic.setImageResource(R.drawable.cristiano1);
        else if(i==2)pic.setImageResource(R.drawable.emma1);
        else if(i==3)pic.setImageResource(R.drawable.beyonce1);
        else if(i==4)pic.setImageResource(R.drawable.iggy1);
        name.setText(testUsers.get(i).name);
        age.setText(testUsers.get(i).ika);
    }
    public void setRoope(){
        pic.setImageResource(R.drawable.roope);
        name.setText(R.string.roope);
        age.setText(R.string.roopeika);
    }
}
