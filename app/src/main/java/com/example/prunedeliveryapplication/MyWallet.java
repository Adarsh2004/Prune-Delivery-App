package com.example.prunedeliveryapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MyWallet extends Fragment {

    RecyclerView recycleview;
    WalletAdapter walletAdapter;

    SeekBar seekBar;
    TextView txtView;

    public MyWallet() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mywallet, container, false);
        setHasOptionsMenu(true);

        recycleview = view.findViewById(R.id.recycleview);
        recycleview.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recycleview.setLayoutManager(new GridLayoutManager(container.getContext(), 1));
        walletAdapter = new WalletAdapter(getContext(), getText());
        recycleview.setAdapter(walletAdapter);


        seekBar = view.findViewById(R.id.seekBar);
        txtView = view.findViewById(R.id.txtView);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtView.setText(progress + "/1500");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        return view;
    }

    private ArrayList<WalletModel> getText() {
        ArrayList<WalletModel> model = new ArrayList<>();
        WalletModel m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("910101");
        m.setDate1("1 Jan 2000");
        m.setId1("AKLDLDJ098DYE");
        m.setType1("Online");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("87651");
        m.setDate1("1 Oct 2000");
        m.setId1("NBVR56789JBG");
        m.setType1("Offline");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("789032");
        m.setDate1("10 Aug 2000");
        m.setId1("KJGF4578HUH");
        m.setType1("Offline");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("123445");
        m.setDate1("25 Dec 2000");
        m.setId1("BHGFR9785TU");
        m.setType1("Internet Banking");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("325493");
        m.setDate1("1 Jan 2000");
        m.setId1("BNVC78675D");
        m.setType1("Cash");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("107436");
        m.setDate1("1 Jan 2000");
        m.setId1("KNB5432T");
        m.setType1("Debit Card");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("373525");
        m.setDate1("1 Jan 2000");
        m.setId1("YTYHG543SD");
        m.setType1("Credit Card");
        model.add(m);

        m = new WalletModel();
        m.setBlack1(R.drawable.b_circle);
        m.setAmount_pay("26283");
        m.setDate1("1 Jan 2000");
        m.setId1("JHK8764DG");
        m.setType1("Internet Banking");
        model.add(m);


        return model;
    }
}