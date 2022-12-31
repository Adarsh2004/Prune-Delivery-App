package com.example.prunedeliveryapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    ArrayList<ListProvider> arrayList = new ArrayList<ListProvider>();

    public RecyclerAdapter(ArrayList<ListProvider> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        RecyclerViewHolder recyclerViewHolder;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        ListProvider listProvider;

        listProvider = arrayList.get(position);
        holder.list_sim_number.setText(listProvider.getSim_number());
        holder.list_mobile_number.setText(listProvider.getMobile_number());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        int view_type;
        TextView list_sim_number, list_mobile_number;


        public RecyclerViewHolder(View view) {
            super(view);

            list_sim_number = (TextView) view.findViewById(R.id.sim_numberid);
            list_mobile_number = (TextView) view.findViewById(R.id.mobile_numberid);

        }

    }

}
