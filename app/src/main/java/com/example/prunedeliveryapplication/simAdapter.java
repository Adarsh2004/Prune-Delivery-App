package com.example.prunedeliveryapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prunedeliveryapplication.inventory.sim;

import java.util.List;

public class simAdapter extends BaseAdapter {
    private Context context;
    private List<sim> simList;

    public simAdapter(Context context,List<sim> simList){
        this.context= context;
        this.simList = simList;
    }
    @Override
    public int getCount() {
        return simList != null ? simList.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View rootView = LayoutInflater.from(context).
               inflate(R.layout.item_sim, viewGroup, false);

       TextView txtName = rootView.findViewById(R.id.name);
        ImageView image = rootView.findViewById(R.id.image);

        txtName.setText(simList.get(i).getName());
        image.setImageResource(simList.get(i).getImage());

        return rootView;
    }

}
