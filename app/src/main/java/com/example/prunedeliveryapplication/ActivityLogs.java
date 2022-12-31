package com.example.prunedeliveryapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityLogs extends Fragment {

    RecyclerView recycler_View;
    LogsAdapter myAdapter;

    public ActivityLogs() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activitylogs, container, false);
        setHasOptionsMenu(true);


        recycler_View = root.findViewById(R.id.recycler_View);
        recycler_View.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recycler_View.setLayoutManager(new GridLayoutManager(container.getContext(), 1));

        myAdapter = new LogsAdapter(getContext(), getPlayers());
        recycler_View.setAdapter(myAdapter);


        return root;
    }

    private ArrayList<ActivityLogsModel> getPlayers() {
        ArrayList<ActivityLogsModel> models = new ArrayList<>();
        ActivityLogsModel p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("123097SDF545");
        p.setCompleted("Pending");
        p.setDate("1 January 2022");
        p.setType("Online");
        p.setAmount("9807");
        models.add(p);


        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614GFD12");
        p.setCompleted("Completed");
        p.setDate("5 October 2022");
        p.setType("Credit Card");
        p.setAmount("1000");
        models.add(p);

        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614GLKI12");
        p.setCompleted("Pending");
        p.setDate("10 October 2022");
        p.setType("Offline");
        p.setAmount("5000");
        models.add(p);

        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("091273HASKL");
        p.setCompleted("Completed");
        p.setDate("7 October 2022");
        p.setType("Debit Card");
        p.setAmount("2000");
        models.add(p);

        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614GFD12");
        p.setCompleted("Pending");
        p.setDate("1 October 2022");
        p.setType("Online");
        p.setAmount("1000");
        models.add(p);


        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614GFD12");
        p.setCompleted("Pending");
        p.setDate("30 December 2020");
        p.setType("UPI");
        p.setAmount("19000");
        models.add(p);

        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614G12");
        p.setCompleted("Pending");
        p.setDate("1 October 2022");
        p.setType("Net Banking");
        p.setAmount("00000");
        models.add(p);

        p = new ActivityLogsModel();
        p.setImg(R.drawable.b_circle);
        p.setTransaction_ID("982614GFD12");
        p.setCompleted("Completed");
        p.setDate("1 October 2022");
        p.setType("Online");
        p.setAmount("1000");
        models.add(p);


        return models;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                myAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);

                return false;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(getContext(), "Settings", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}