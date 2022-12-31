package com.example.prunedeliveryapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.prunedeliveryapplication.utils.CameraUtils;

import java.io.File;
import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class bank_details extends AppCompatActivity {
    EditText bank_name, account_no,confirm_account_number,ifsc_code;
    static final int REQUEST_TAKE_PHOTO = 1;
    private Bitmap mImageBitmap;
    String mCurrentPhotoPath;
    ImageView upload_cheque;
    Button save_but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);
        bank_name = findViewById(R.id.bank_name);
        account_no = findViewById(R.id.account_no);
        confirm_account_number = findViewById(R.id.confirm_account_number);
        ifsc_code = findViewById(R.id.ifsc_code);
        save_but = findViewById(R.id.save_but);
        upload_cheque = findViewById(R.id.upload_cheque);

        save_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processData(bank_name.getText().toString(),account_no.getText().toString(),confirm_account_number.getText().toString(), ifsc_code.getText().toString());
            }
        });
    }

    private void processData(String bank_name, String account_no, String  confirm_account_number, String  ifsc_code)
    {

        Call<BankDetailsResponseModel> call= BankDetailsApiController.getInstance()
                .getApi()
                .getPicture(bank_name, account_no, confirm_account_number,ifsc_code);

        call.enqueue(new Callback<BankDetailsResponseModel>() {
            @Override
            public void onResponse(Call<BankDetailsResponseModel> call, Response<BankDetailsResponseModel> response) {
               /* BankDetailsResponseModel obj = response.body();*/

            }

            @Override
            public void onFailure(Call<BankDetailsResponseModel> call, Throwable t) {

            }
        });
    }

    public void TakePhoto(View view) {

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
                Uri photoURL = FileProvider.getUriForFile(this,
                        "com.example.prunedeliveryapplication.fileprovider",
                        photoFile);
                takePic.putExtra(MediaStore.EXTRA_OUTPUT, photoURL);
                startActivityForResult(takePic, REQUEST_TAKE_PHOTO);
            }
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_TAKE_PHOTO && resultCode == RESULT_OK) {
            mImageBitmap = CameraUtils.getBitmap(mCurrentPhotoPath);
            upload_cheque.setImageBitmap(mImageBitmap);
        }
    }

}