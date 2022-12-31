package com.example.prunedeliveryapplication;

import android.widget.Filter;

import java.util.ArrayList;

public class CustomFilter extends Filter {

    LogsAdapter adapter;
    ArrayList<ActivityLogsModel> filterList;

    public CustomFilter(ArrayList<ActivityLogsModel> filterList,  LogsAdapter adapter){
        this.adapter = adapter;
        this.filterList = filterList;

    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();

        if (constraint != null && constraint.length()>0){
            constraint = constraint.toString().toUpperCase();
            ArrayList<ActivityLogsModel> filteredModels = new ArrayList<>();
            for (int i = 0; i<filterList.size(); i++){
                if (filterList.get(i).getTransaction_ID().toUpperCase().contains(constraint)){
                    filteredModels.add(filterList.get(i));
                }
            }
            results.count = filteredModels.size();
            results.values = filteredModels;

        }
        else {
            results.count = filterList.size();
            results.values = filterList;
        }

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.models = (ArrayList<ActivityLogsModel>) results.values;

        adapter.notifyDataSetChanged();

    }
}
