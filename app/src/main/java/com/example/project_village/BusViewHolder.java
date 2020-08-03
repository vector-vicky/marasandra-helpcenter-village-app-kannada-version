package com.example.project_village;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BusViewHolder extends RecyclerView.ViewHolder {

    public final View view;
    public final TextView busname;
    public final TextView bustime;

    public BusViewHolder(@NonNull View itemView) {
        super(itemView);
        this.view = itemView;
        this.busname = view.findViewById(R.id.layout_bus_name);
        this.bustime = view.findViewById(R.id.layout_bus_time);
    }
}
