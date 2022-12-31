package com.example.prunedeliveryapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WalletHolder extends RecyclerView.ViewHolder {

    ImageView Black1;
    TextView Id1,Type1,Date1, amount_pay;

    public WalletHolder(@NonNull View itemView) {
        super(itemView);
        this.Black1 = itemView.findViewById(R.id.Black1);
        this.Id1 = itemView.findViewById(R.id.Id1);
        this.Type1 = itemView.findViewById(R.id.Type1);
        this.Date1 = itemView.findViewById(R.id.Date1);
        this.amount_pay = itemView.findViewById(R.id.amount_pay);


    }
}
