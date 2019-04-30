package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private Context context;
    private ArrayList<String> al;
    private TextView textViewModule;
    private ImageView imageView;

    public ModuleAdapter(Context context, int resource, ArrayList<String> objects){
        super(context, resource, String);
        al = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        textViewModule =         rowView.findViewById(R.id.textViewModule);
        imageView =             rowView.findViewById(R.id.imageView);

        String currentModule = al.get(position);
        // Set the TextView to show the food

        textViewModule.setText(currentModule.getCode());
        // Set the image to star or nostar accordingly
        if(currentModule.isStar()) {
            ivStar.setImageResource(R.drawable.star);
        }
        else {
            ivStar.setImageResource(R.drawable.nostar);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }







}
