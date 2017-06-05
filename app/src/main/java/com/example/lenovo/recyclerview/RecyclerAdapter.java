package com.example.lenovo.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lenovo on 5/6/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private String[] country,capital;

    RecyclerAdapter(String[] country, String[] capital){
        this.country = country;
        this.capital = capital;

    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText(country[position]);
        holder.textView1.setText(capital[position]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView textView,textView1;

        public RecyclerViewHolder(View view){
            super(view);

            textView = (TextView)view.findViewById(R.id.country_name);
            textView1 = (TextView)view.findViewById(R.id.capital_name);

        }
    }
}
