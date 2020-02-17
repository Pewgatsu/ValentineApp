package com.example.valentineapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int pictures[];
    int[] description;
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext, int[] pictures, int[] description) {
        this.context = applicationContext;
        this.pictures = pictures;
        this.description = description;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return pictures.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_gridview, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(pictures[i]); // set logo images
        return view;
    }

}
