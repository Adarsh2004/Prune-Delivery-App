package com.example.prunedeliveryapplication;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.io.File;
import java.util.ArrayList;

import retrofit2.Call;

public class CustomGalleryActivity  extends AppCompatActivity  {

    ArrayList<String> f = new ArrayList<>();
    File[] listFile;
    private String folderName = "MyPhotoDir";
    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getFromSdcard();
        mViewPager = findViewById(R.id.viewPager_main);
        mViewPagerAdapter = new ViewPagerAdapter(this,f);
        mViewPager.setAdapter(mViewPagerAdapter);

        mViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                processdata(mViewPager.getAdapter().toString());
            }
        });



    }

    private void processdata(String image) {
    }

    public void getFromSdcard(){
        File file = new File(getExternalFilesDir(folderName), "/");
        if (file.isDirectory()){
            listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++){
                f.add(listFile[i].getAbsolutePath());
            }
        }
    }
}
