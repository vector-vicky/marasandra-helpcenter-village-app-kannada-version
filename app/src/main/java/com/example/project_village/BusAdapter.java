package com.example.project_village;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class BusAdapter extends RecyclerView.Adapter<BusViewHolder> {
    private ArrayList<Bus> bus;
    public BusAdapter(ArrayList<Bus> bus){
        this.bus=bus;

    }
    @NonNull
    @Override
    public BusViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v=(View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.buslayout,viewGroup,false);
        return new BusViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BusViewHolder viewHolder, int i) {

        Bus b=bus.get(i);
        viewHolder.busname.setText(b.getBusname());
        viewHolder.bustime.setText(b.getBustime());
    }

    @Override
    public int getItemCount() {
        if(bus!=null){
            return bus.size();
        }
        else {
        return 0;
    }
    }





}


