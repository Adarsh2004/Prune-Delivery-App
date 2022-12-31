package com.example.prunedeliveryapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
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
import android.widget.TextView;
import android.widget.Toast;


import com.example.prunedeliveryapplication.utils.CameraUtils;
import com.google.android.gms.tasks.OnFailureListener;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class PanCardActivity extends AppCompatActivity {
    private Button Reset, ocr1;
    private ImageView Imageview;
    private Bitmap mImageBitmap;
    String mCurrentPhotoPath;
    static final int REQUEST_TAKE_PHOTO = 1;
    private EditText pan_name_edittext, fathername, dob_edit, pan_number_edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_card);

        ocr1 = (Button) findViewById(R.id.ocr1);
        Imageview = (ImageView) findViewById(R.id.Imageview);
        Reset = (Button) findViewById(R.id.Reset);
        Reset.setText("R" + "\n" + "E" + "\n" + "S" + "\n" + "E" + "\n" + "T");

        pan_name_edittext = (EditText) findViewById(R.id.pan_name_edittext);
        fathername = (EditText) findViewById(R.id.fathername);
        dob_edit = (EditText) findViewById(R.id.dob_edit);
        pan_number_edittext = (EditText) findViewById(R.id.pan_number_edittext);


    }

    public void takepicture(View view) {
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
            Imageview.setImageBitmap(mImageBitmap);
            Reset.setVisibility(View.VISIBLE);
        }
    }

    public void Reset(View view) {
        mImageBitmap = null;
        Imageview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.takephoto));
        dob_edit.getText().clear();
        pan_number_edittext.getText().clear();
        pan_name_edittext.getText().clear();
        fathername.getText().clear();
        Reset.setVisibility(View.GONE);
    }

    private void presentOutput(HashMap<String, String> dataMap) {
        if (dataMap != null) {
            pan_number_edittext.setText(dataMap.get("pan"), TextView.BufferType.EDITABLE);
            dob_edit.setText(dataMap.get("dob"), TextView.BufferType.EDITABLE);
            pan_name_edittext.setText(dataMap.get("Name"), TextView.BufferType.EDITABLE);
            fathername.setText(dataMap.get("fathername"), TextView.BufferType.EDITABLE);
        }
    }

}