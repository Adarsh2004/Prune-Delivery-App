package com.example.prunedeliveryapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;

public class IdentityDetails extends AppCompatActivity {
 /*   int SELECT_PICTURE = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;

    *//* renamed from: i1 *//*
    ImageView f0i1;

    *//* renamed from: i2 *//*
    ImageView f1i2;

    *//* renamed from: t1 *//*
    TextView f2t1;

    *//* renamed from: t2 *//*
    TextView f3t2;*/

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity_details);
        /*this.f2t1 = (TextView) findViewById(R.id.uploadpic);
        this.f3t2 = (TextView) findViewById(R.id.uploadpanpic);
        this.f0i1 = (ImageView) findViewById(R.id.adhar_image);
        this.f1i2 = (ImageView) findViewById(R.id.pan_image);
        this.f2t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                IdentityDetails.this.imageChooser();
            }
        });
        this.f3t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                IdentityDetails.this.imageChooser();
            }
        });
    }

    *//* access modifiers changed from: package-private *//*
    public void imageChooser() {
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(i, "Select Picture"), this.SELECT_PICTURE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri selectedImageUri;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == this.SELECT_PICTURE && (selectedImageUri = data.getData()) != null) {
            this.f0i1.setImageURI(selectedImageUri);
            this.f1i2.setImageURI(selectedImageUri);
        }*/
    }

    public void openRelevantActivity(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.aadhaar_CardView:
                Intent aIntent = new Intent(this, AadhaarCardActivity.class);
                startActivity(aIntent);
                break;
            case R.id.pan_CardView:
                Intent panIntent = new Intent(this, PanCardActivity.class);
                startActivity(panIntent);
                break;
            case R.id.dl_CardView:
                Intent dlIntent = new Intent(this, dlActivity.class);
                startActivity(dlIntent);
                break;
        }

    }
}