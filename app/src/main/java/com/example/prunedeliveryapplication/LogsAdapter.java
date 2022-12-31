package com.example.prunedeliveryapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class LogsAdapter extends RecyclerView.Adapter<ActivityLogsMyHolder> implements Filterable {

    Context c;
    ArrayList<ActivityLogsModel> models, filterList;
    CustomFilter filter;


     LogsAdapter(Context c, ArrayList<ActivityLogsModel> models) {
        this.c = c;
        this.models = models;
        this.filterList = models;
    }

    @NonNull
    @Override
    public ActivityLogsMyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sortmodel, null);
        return new ActivityLogsMyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityLogsMyHolder holder, int position) {
        holder.Black.setImageResource(models.get(position).getImg());
        holder.Id.setText(models.get(position).getTransaction_ID());
        holder.Type.setText(models.get(position).getType());
        holder.Date.setText(models.get(position).getDate());
        holder.Amount.setText(models.get(position).getAmount());
        holder.Completed.setText(models.get(position).getCompleted());

        Animation animation = AnimationUtils.loadAnimation(c, android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);

        holder.setItemClickListener(new LogItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                String id = models.get(pos).getTransaction_ID();
                String type = models.get(pos).getType();
                String date = models.get(pos).getDate();
                String amount = models.get(pos).getAmount();
                String status = models.get(pos).getCompleted();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) holder.Black.getDrawable();
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream  = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);

                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c, DetailActivity.class);
                intent.putExtra("iID", id);
                intent.putExtra("type", type);
                intent.putExtra("date", date);
                intent.putExtra("amount", amount);
                intent.putExtra("status", status);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);



            }
        });

       /* holder.setItemClickListener(new LogItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                if (models.get(pos).getTransaction_ID().equals("123097SDF545")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614GFD12")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614GLKI12")){

                }
                if (models.get(pos).getTransaction_ID().equals("091273HASKL")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614GFD12")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614GFD12")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614G12")){

                }
                if (models.get(pos).getTransaction_ID().equals("982614GFD12")){

                }


            }
        });
*/
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public Filter getFilter() {
         if (filter == null){
             filter = new CustomFilter(filterList, this);
         }
        return filter;
    }
}
