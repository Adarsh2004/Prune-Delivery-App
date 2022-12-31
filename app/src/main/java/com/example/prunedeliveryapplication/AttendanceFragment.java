package com.example.prunedeliveryapplication;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import com.example.prunedeliveryapplication.Attendance.ApiInterface;
import com.example.prunedeliveryapplication.Attendance.PostModel;
import com.example.prunedeliveryapplication.region.RetrofitClient;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AttendanceFragment extends Fragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    TextView dateText;
    ImageView ImageBttn;
    View myView;

    View view1, view2, view3, view4, view5, view6;
    private ProgressDialog progressDialog;

    public AttendanceFragment() {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myView = inflater.inflate(
                R.layout.fragment_attendance, container, false);

        view1 = myView.findViewById(R.id.view1);
        view2 = myView.findViewById(R.id.view2);
        view3 = myView.findViewById(R.id.view3);
        view4 = myView.findViewById(R.id.view4);
        view5 = myView.findViewById(R.id.view5);
        view6 = myView.findViewById(R.id.view6);


        initAllView();

        return myView;

    }

    private void showDatePickupDailog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                getActivity(), android.R.style.Theme_DeviceDefault_Dialog, this,
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.YEAR));
        datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        datePickerDialog.show();

    }


    private void initAllView() {
        ImageBttn = myView.findViewById(R.id.ImageBttn);
        dateText = myView.findViewById(R.id.dateText);

        ImageBttn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ImageBttn) {
            showDatePickupDailog();
            sendData();

        }

    }

    private void sendData() {
        progressDialog.setMessage("Post Data in Progress...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        ApiInterface apiInterface = RetrofitClient.getRetrofit().create(ApiInterface.class);
        final PostModel postModel = new PostModel(view1.getTransitionName().toString(), view2.getTransitionName().toString(), view3.getTransitionName().toString());

        Call<PostModel> call = apiInterface.postData(postModel);

        call.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()) {
                    Toast.makeText(getActivity(), "Attendance Taken", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        month = month + 1;
        String day = "Date: " + dayOfMonth + "-" + month + "-" + year;
        dateText.setText(day);
    }
}