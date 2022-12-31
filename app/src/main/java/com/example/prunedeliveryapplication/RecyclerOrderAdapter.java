package com.example.prunedeliveryapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hbb20.CCPCountry;

import java.util.ArrayList;

public class RecyclerOrderAdapter extends RecyclerView.Adapter<RecyclerOrderAdapter.ViewHolder> {
    Button Close_button;
    Context context;
    ArrayList<OrderModel> orderText;
    Dialog detaildialog;
    Dialog acceptOrder;

    RecyclerOrderAdapter(Context context, ArrayList<OrderModel> orderText, Dialog detaildialog, Button close_button, Dialog acceptOrder) {
        this.context = context;
        this.orderText = orderText;
        this.detaildialog = detaildialog;
        this.acceptOrder = acceptOrder;
        this.Close_button = close_button;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.error_outlineimg.setImageResource(orderText.get(position).img1);
        holder.location_id.setImageResource(orderText.get(position).img2);
        holder.order_id.setText(orderText.get(position).order_id);
        holder.area_id.setText(orderText.get(position).area_id);
        holder.address_id.setText(orderText.get(position).address_id);
        holder.Time_Slot_id.setText(orderText.get(position).time_slot_id);
        holder.Order_Type_id.setText(orderText.get(position).Order_Type_id);
        holder.location_text.setText(orderText.get(position).location_text);



        holder.accept_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton();
            }
        });

        holder.error_outlineimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorOutlineClick();


            }
        });


    }

    private void clickButton() {
        acceptOrder.show();
        /*acceptOrder.setCancelable(false);*/
    }

    @Override
    public int getItemCount() {
        return orderText.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView error_outlineimg, location_id;
        TextView order, order_id, area, area_id, address, address_id, Time_Slot, Time_Slot_id, Order_Type, Order_Type_id, location_text;
        Button accept_button,Close_button;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            error_outlineimg = itemView.findViewById(R.id.error_outlineimg);
            location_id = itemView.findViewById(R.id.location_id);
            order = itemView.findViewById(R.id.order);
            order_id = itemView.findViewById(R.id.order_id);
            area = itemView.findViewById(R.id.area);
            area_id = itemView.findViewById(R.id.area_id);
            address = itemView.findViewById(R.id.address);
            address_id = itemView.findViewById(R.id.address_id);
            Time_Slot = itemView.findViewById(R.id.Time_Slot);
            Time_Slot_id = itemView.findViewById(R.id.Time_Slot_id);
            Order_Type_id = itemView.findViewById(R.id.Order_Type_id);
            Order_Type = itemView.findViewById(R.id.Order_Type);
            location_text = itemView.findViewById(R.id.location_text);
            accept_button = itemView.findViewById(R.id.accept_button);



        }
    }


    private void errorOutlineClick() {
        detaildialog.show();
     /*   detaildialog.setCancelable(false);*/


    }
}
