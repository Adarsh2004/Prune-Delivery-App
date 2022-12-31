package com.example.prunedeliveryapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prunedeliveryapplication.region.ApiInterface;
import com.example.prunedeliveryapplication.region.RetrofitClient;
import com.example.prunedeliveryapplication.region.model.PostModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class GetMoreOrdersFragment extends Fragment implements BottomSheet_CloseCallBack.interface_BottomSheetCloseCallBack {
    ArrayList<OrderModel> orderText = new ArrayList<>();
    Dialog Odailog;
    EditText listedit;
    Button  Close_button;

    private ProgressDialog progressDialog;
    Dialog detaildialog;
    Dialog acceptOrder;


    public GetMoreOrdersFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_getmoreorders, container, false);
        BottomSheet_CloseCallBack.getInstance().init_interface_ItemSelected(this);



        Odailog = new Dialog(getActivity());
        Odailog.setContentView(R.layout.orderdailog);
        Odailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Odailog.show();
        Odailog.setCancelable(false);
        listedit = Odailog.findViewById(R.id.listedit);
        Button submitbutton = Odailog.findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GetMoreOrdersFragment.this.getActivity(), listedit.getText() + " : Submitted", Toast.LENGTH_LONG).show();
                /*sendData();*/
                Odailog.dismiss();
                RecyclerView recyclerorder = v.findViewById(R.id.recyclerorder);
                recyclerorder.setLayoutManager(new LinearLayoutManager(getActivity()));

                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "0876789087", "987650", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "0000000000", "111111", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "1111111111", "222222", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "2222222222", "333333", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "3333333333", "444444", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "4444444444", "555555", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));
                orderText.add(new OrderModel(R.drawable.ic_baseline_error_outline_24, R.drawable.ic_baseline_location_on_24, "5555555555", "666666", "Shikarpur Bulandshahr", "01:30 PM-03:45 PM", "SIMM", "22 KMs"));

                detaildialog = new Dialog(getActivity());
                detaildialog.setContentView(R.layout.orderdetaildailog);
                detaildialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Button Close_button = (Button) v.findViewById(R.id.Close_button);

                acceptOrder = new Dialog(getActivity());
                acceptOrder.setContentView(R.layout.orderacceptdialog);
                acceptOrder.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));


                RecyclerOrderAdapter adapter = new RecyclerOrderAdapter(getActivity(), orderText,detaildialog,Close_button , acceptOrder);
                recyclerorder.setAdapter(adapter);


            }
        });


        listedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                GetMoreOrdersFragment.this.selectGoalSettings();

            }
        });

        return v;
    }

   /* private void sendData() {
        progressDialog.setMessage("Post Data in Progress...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        ApiInterface apiInterface = RetrofitClient.getRetrofit().create(ApiInterface.class);
        final PostModel postModel = new PostModel(listedit.getText().toString());
        Call<PostModel> call = apiInterface.postData(postModel);

        call.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    Toast.makeText(getActivity(),"Region Selected",Toast.LENGTH_SHORT).show();
                    return;

                }
                else {
                    Toast.makeText(getActivity(), "Region Selected", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(getActivity(),t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }*/


    public void showAddressPopup() {
        ListView listView = new ListView(getActivity());
        List<String> address = new ArrayList<>();
        address.add("Noida Sector 45");
        address.add("Noida Botanical Garden");
        address.add("India Gate");
        address.add("ABCDEFGHIJKLMN");
        address.add("ZYXWVUTSR");
        address.add("Block-A, Shastri Nagar New Delhi");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, address);
        listView.setAdapter(adapter);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(true);
        builder.setView(listView);
        final AlertDialog dialog1 = builder.create();
        listedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.show();

            }
        });

    }

    @Override
    public void on_BottomSheetItemSelected(int itemPosition, String itemName, String callingFrom) {
        Toast.makeText(requireActivity(), "Address Selected : " + itemName, Toast.LENGTH_SHORT).show();
        if (!TextUtils.isEmpty(itemName)) {
            listedit.setText(itemName);
        }

    }


    private void selectGoalSettings() {
        SelectAddressBottomSheet selectAddressBottomSheet = new SelectAddressBottomSheet();
        FragmentManager ft = getActivity().getSupportFragmentManager();
        selectAddressBottomSheet.setCancelable(true);
        selectAddressBottomSheet.show(ft, "selectAddressBottomSheet");
    }
}



