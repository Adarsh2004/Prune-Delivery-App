package com.example.prunedeliveryapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class NavigationScreen extends AppCompatActivity {

    SharedPrefManager sharedPrefManager;

    Switch switch_bttn;
    DrawerLayout navigation;
    NavigationView navigationView;
    Toolbar toolbar;
    Dialog mDailog;
    Dialog dailog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_screen);

        navigation = (DrawerLayout) findViewById(R.id.navigation);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDailog = new Dialog(this);
        dailog = new Dialog(this);

        sharedPrefManager= new SharedPrefManager(getApplicationContext());



        switch_bttn = (Switch) findViewById(R.id.switch_bttn);
        switch_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDailog.setContentView(R.layout.dailogbox);
                mDailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDailog.show();
                mDailog.setCancelable(false);

                Button d4 = mDailog.findViewById(R.id.d4);
                d4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dailog.setContentView(R.layout.dailogbox2);
                        dailog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        dailog.setCancelable(false);
                        dailog.show();
                        mDailog.dismiss();
                        Button d8 = dailog.findViewById(R.id.d8);
                        d8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dailog.dismiss();
                            }
                        });

                    }
                });

            }
        });






        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, navigation, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);

        navigation.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_profile:
                        loadFragment(new MyProfile());
                        break;
                    case R.id.nav_get_orders:
                        loadFragment(new GetMoreOrdersFragment());
                        break;
                    case R.id.nav_direct_sell:
                        loadFragment(new DirectSell());
                        break;
                    case R.id.nav_activity:
                        loadFragment(new ActivityLogs());
                        break;
                    case R.id.nav_wallet:
                        loadFragment(new MyWallet());
                        break;
                    case R.id.nav_attendance:
                        loadFragment(new AttendanceFragment());
                        break;
                }

                navigation.closeDrawer(GravityCompat.START);


                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (navigation.isDrawerOpen(GravityCompat.START)) {
            navigation.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav_logout:
                logoutUser();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void logoutUser() {


        sharedPrefManager.logout();
        Intent intent= new Intent(NavigationScreen.this, SendOTPActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        Toast.makeText(this, "You have been loggedOut", Toast.LENGTH_SHORT).show();

    }
}
