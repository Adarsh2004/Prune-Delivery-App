package com.example.prunedeliveryapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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


import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class dlActivity extends AppCompatActivity {

    private Button Re_set, ocr1;
    private ImageView ImageView1;
    private Bitmap mImageBitmap;
    String mCurrentPhotoPath;
    static final int REQUEST_TAKE_PHOTO = 1;
    private CardView cv1;
    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl);

        ocr1 = (Button) findViewById(R.id.ocr1);
        ImageView1 = (ImageView) findViewById(R.id.ImageView1);
        Re_set = (Button) findViewById(R.id.Re_set);
        Re_set.setText("R" + "\n" + "E" + "\n" + "S" + "\n" + "E" + "\n" + "T");

        TextView = (TextView) findViewById(R.id.TextView);
        cv1 = (CardView) findViewById(R.id.cv1);

        if (savedInstanceState !=null){
            mCurrentPhotoPath = savedInstanceState.getString("CurrentPhotoPath");
            mImageBitmap= CameraUtils.getBitmap(mCurrentPhotoPath);
            Re_set.setVisibility(View.VISIBLE);
        }
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
            ImageView1.setImageBitmap(mImageBitmap);
            Re_set.setVisibility(View.VISIBLE);
        }
    }

    public void Reset(View view) {
        mImageBitmap = null;
        ImageView1.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.takephoto));
        TextView.setText(R.string.extracted_info);
        Re_set.setVisibility(View.GONE);
    }
    private void presentOutput(HashMap<String, String> dataMap){
        if (dataMap != null){
          TextView.setText(dataMap.get("text"));
        }
    }

}