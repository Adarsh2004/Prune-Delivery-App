package com.example.prunedeliveryapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WalletAdapter  extends RecyclerView.Adapter<WalletHolder> {

    Context context;
    ArrayList<WalletModel> model;

    public WalletAdapter(Context context, ArrayList<WalletModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public WalletHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.walletmodel, null);
        return new WalletHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WalletHolder holder, int position) {

        holder.Black1.setImageResource(model.get(position).getBlack1());
        holder.Id1.setText(model.get(position).getId1());
        holder.Type1.setText(model.get(position).getType1());
        holder.Date1.setText(model.get(position).getDate1());
        holder.amount_pay.setText(model.get(position).getAmount_pay());

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
