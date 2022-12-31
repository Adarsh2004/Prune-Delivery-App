package com.example.prunedeliveryapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;


import com.example.prunedeliveryapplication.api.PersonaldetailApiClient;
import com.example.prunedeliveryapplication.api.RequestDefault;
import com.example.prunedeliveryapplication.api.ResponseDefault;
import com.example.prunedeliveryapplication.utils.CameraUtils;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AadhaarCardActivity extends AppCompatActivity {

    private ImageView imageView, imageView1;
    String mCurrentPhotoPath, mCurrentPhotoPath2;
    static final int REQUEST_TAKE_PHOTO = 1;
    static final int REQUEST_TAKE_PHOTO_2 = 2;
    private Bitmap mImageBitmap, mImageBitmap2;
    private EditText name_edittext, dob_edittext, gender_edittext, aadhaar_edittext,
            pincode_edittext, address_edittext, fathername_edittext;

    private Button reset,ocr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadhaar_card);
        ocr = findViewById(R.id.ocr);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        name_edittext = findViewById(R.id.name_edittext);
        dob_edittext = findViewById(R.id.dob_edittext);
        gender_edittext = findViewById(R.id.gender_edittext);
        aadhaar_edittext = findViewById(R.id.aadhaar_edittext);
        pincode_edittext = findViewById(R.id.pincode_edittext);
        address_edittext = findViewById(R.id.address_edittext);


        fathername_edittext = findViewById(R.id.fathername_edittext);
        reset = findViewById(R.id.reset);

        reset.setText("R" + "\n" + "E" + "\n" + "S" + "\n" + "E" + "\n" + "T");

        ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUser(requestDefault());

            }
        });
    }
    @NonNull
    private RequestDefault requestDefault() {
        RequestDefault requestDefault = new RequestDefault();
        requestDefault.setAadhar_no(aadhaar_edittext.getText().toString());
        requestDefault.setAddress(address_edittext.getText().toString());
        requestDefault.setName(name_edittext.getText().toString());
        requestDefault.setFather_name(fathername_edittext.getText().toString());
        requestDefault.setGender(gender_edittext.getText().toString());
        requestDefault.setPincode(pincode_edittext.getText().toString());
        requestDefault.setDob(dob_edittext.getText().toString());

        return requestDefault();
    }

    public void saveUser(RequestDefault requestDefault) {
        Call<ResponseDefault>responseDefaultCall= PersonaldetailApiClient.getUserService().saveUser(requestDefault);
        responseDefaultCall.enqueue(new Callback<ResponseDefault>() {
            @Override
            public void onResponse(Call<ResponseDefault> call, Response<ResponseDefault> response) {
                if(response.isSuccessful()){
                    Toast.makeText(AadhaarCardActivity.this,"Saved successfully",Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(AadhaarCardActivity.this,"Failed",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseDefault> call, Throwable t) {
                Toast.makeText(AadhaarCardActivity.this,"Request Failed "+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });

    }
        public void takePicture (View view){
            Intent takePic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePic.resolveActivity(getPackageManager()) != null) {
                File photoFile = null;
                try {
                    photoFile = CameraUtils.createImageFile(this);
                    mCurrentPhotoPath = photoFile.getAbsolutePath();
                } catch (IOException ex) {
                    Toast.makeText(this, "Error creating File", Toast.LENGTH_SHORT).show();
                }
                if (photoFile != null) {
              /*  Uri photoURL = FileProvider.getUriForFile(this,
                        "com.example.prunedelive" +
                                "" +
                                "ryapplication.fileprovider",
                        photoFile);*/


                    Uri photoURL = FileProvider.getUriForFile(Objects.requireNonNull(getApplicationContext()),
                            BuildConfig.APPLICATION_ID + ".provider", photoFile);
                    takePic.putExtra(MediaStore.EXTRA_OUTPUT, photoURL);
                    startActivityForResult(takePic, REQUEST_TAKE_PHOTO);
                }
            }

        }

        public void takeBackPicture (View view){
            Intent takePic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePic.resolveActivity(getPackageManager()) != null) {
                File photoFile = null;
                try {
                    photoFile = CameraUtils.createImageFile(this);
                    mCurrentPhotoPath2 = photoFile.getAbsolutePath();
                } catch (IOException ex) {
                    Toast.makeText(this, "Error creating File", Toast.LENGTH_SHORT).show();
                }
                if (photoFile != null) {
                    Uri photoURL = FileProvider.getUriForFile(Objects.requireNonNull(getApplicationContext()),
                            BuildConfig.APPLICATION_ID + ".provider", photoFile);
                    takePic.putExtra(MediaStore.EXTRA_OUTPUT, photoURL);
                    startActivityForResult(takePic, REQUEST_TAKE_PHOTO_2);
                }
            }

        }

        @Override
        protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == REQUEST_TAKE_PHOTO && resultCode == RESULT_OK) {
                mImageBitmap = CameraUtils.getBitmap(mCurrentPhotoPath);
                imageView.setImageBitmap(mImageBitmap);
                reset.setVisibility(View.VISIBLE);
            } else if (requestCode == REQUEST_TAKE_PHOTO_2 && resultCode == RESULT_OK) {
                mImageBitmap2 = CameraUtils.getBitmap(mCurrentPhotoPath2);
                imageView1.setImageBitmap(mImageBitmap2);
                reset.setVisibility(View.VISIBLE);
            }
        }

        public void reset (View view){
            mImageBitmap = null;
            mImageBitmap2 = null;
            imageView1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aadhaar_back));
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aadhaar_front));
            name_edittext.getText().clear();
            dob_edittext.getText().clear();
            gender_edittext.getText().clear();
            aadhaar_edittext.getText().clear();
            pincode_edittext.getText().clear();
            address_edittext.getText().clear();
            fathername_edittext.getText().clear();
            reset.setVisibility(View.GONE);


        }

        private void presentFrontOutput (HashMap < String, String > dataMap){
            if (dataMap != null) {
                aadhaar_edittext.setText(dataMap.get("aadhaar"), TextView.BufferType.EDITABLE);
                gender_edittext.setText(dataMap.get("gender"), TextView.BufferType.EDITABLE);
                fathername_edittext.setText(dataMap.get("fatherName"), TextView.BufferType.EDITABLE);
                dob_edittext.setText(dataMap.get("dob"), TextView.BufferType.EDITABLE);
                name_edittext.setText(dataMap.get("name"), TextView.BufferType.EDITABLE);
            }
        }

        private void presentBackOutput (HashMap < String, String > dataMap){
            if (dataMap != null) {
                address_edittext.setText(dataMap.get("addressLine1"), TextView.BufferType.EDITABLE);
                pincode_edittext.setText(dataMap.get("pincode"), TextView.BufferType.EDITABLE);
            }
        }


}