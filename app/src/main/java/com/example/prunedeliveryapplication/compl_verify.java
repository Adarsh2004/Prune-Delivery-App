package com.example.prunedeliveryapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;
import java.util.Objects;

public class compl_verify extends AppCompatActivity {
    CardView cview1;
    RadioGroup rg_language;
    RadioButton rb_english, rb_hindi;
    TextView tv_select;

    Button create_account_but;
    CardView cview2;
    CardView cview3;
    CardView cview4;
    Button popup;
    Dialog mDailog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compl_verify);
        tv_select = findViewById(R.id.tv_select);
        rg_language = findViewById(R.id.rg_language);
        rb_english = findViewById(R.id.rb_english);
        rb_hindi = findViewById(R.id.rb_hindi);


        rg_language.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_english:
                        String language = "en";
                        setLocale(language);
                        break;
                    case R.id.rb_hindi:
                        setLocale("hi");
                        break;
                }
            }
        });
        this.cview1 = findViewById(R.id.verify_card1);
        this.cview2 = findViewById(R.id.verify_card2);
        this.cview3 = findViewById(R.id.verify_card3);
        this.cview4 = findViewById(R.id.verify_card4);
        this.create_account_but = (Button) findViewById(R.id.create_account_but);
        mDailog = new Dialog(this);
        popup = (Button) findViewById(R.id.popup);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDailog.setContentView(R.layout.popup);
                mDailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDailog.setCancelable(false);
                ImageView close_btn = mDailog.findViewById(R.id.close_btn);
                close_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mDailog.dismiss();
                    }
                });
                mDailog.show();
            }
        });

        cview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compl_verify.this, personal_details_screen.class);
                startActivity(intent);
            }
        });
        cview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compl_verify.this, take_photo_activity.class);
                startActivity(intent);
            }
        });

        cview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compl_verify.this, tshirt_size.class);
                startActivity(intent);
            }
        });
        cview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compl_verify.this, Payment.class);
                startActivity(intent);
            }
        });
        create_account_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(compl_verify.this, NavigationScreen.class);
                startActivity(intent);
            }
        });

    }

    private void setLocale(String language) {
        Resources resources = getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale= new Locale(language);
        resources.updateConfiguration(configuration,metrics);
        onConfigurationChanged(configuration);

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        tv_select.setText(R.string.select_language);
        rb_english.setText(R.string.english);
        rb_hindi.setText(R.string.hindi);
        create_account_but.setText(R.string.create_acc);

    }
}