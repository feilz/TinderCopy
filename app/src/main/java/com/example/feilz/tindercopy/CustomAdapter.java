package com.example.feilz.tindercopy;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by feilz on 09/10/2016.
 */
public class CustomAdapter extends PagerAdapter {
    private int[] imgs = {R.drawable.brad1,R.drawable.cristiano1,R.drawable.emma1};
    private String[] names = {"Brad","Cristiano","Emma"};
    private String[] ages = {"52","31","26"};
    private LayoutInflater infl;
    private Context cont;

    public CustomAdapter(Context ctx){
        this.cont = ctx;
    }

    public int getCount(){
        return imgs.length;
    }
    @Override
    public boolean isViewFromObject(View v,Object o){
        return (v==o);
    }

    @Override
    public Object instantiateItem(ViewGroup vg,int pos){
        infl=(LayoutInflater)cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = infl.inflate(R.layout.swipegallery,vg,false);
        ImageView img = (ImageView)v.findViewById(R.id.profpic);
        img.setImageResource(imgs[pos]);
        TextView name = (TextView)v.findViewById(R.id.profname);
        name.setText(names[pos]);
        TextView age = (TextView)v.findViewById(R.id.profage);
        age.setText(ages[pos]);
        vg.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup vg,int pos,Object o){
        vg.invalidate();
    }


}
