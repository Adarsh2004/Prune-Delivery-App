package com.example.prunedeliveryapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityLogsMyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView Black;
    TextView Id,Type,Date, Amount,Completed;
    LogItemClickListener itemClickListener;


     ActivityLogsMyHolder(@NonNull View itemView) {
        super(itemView);
        this.Black = itemView.findViewById(R.id.Black);
        this.Id = itemView.findViewById(R.id.Id);
        this.Type = itemView.findViewById(R.id.Type);
        this.Date = itemView.findViewById(R.id.Date);
        this.Amount = itemView.findViewById(R.id.Amount);
        this.Completed = itemView.findViewById(R.id.Completed);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(view, getLayoutPosition());

    }
    public void setItemClickListener(LogItemClickListener ic){
        this.itemClickListener = ic;
    }
}
