package com.example.prunedeliveryapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import java.io.File

class xyz : AppCompatActivity() {

    lateinit var imgView: ImageView
    lateinit var btnchange: Button
    lateinit var imageUri: Uri
    private val contract = registerForActivityResult(ActivityResultContracts.TakePicture()){
        imgView.setImageURI(imageUri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xyz)

        imgView = findViewById(R.id.imgView)
        btnchange = findViewById(R.id.btnchange)
        imageUri = createImageUri()!!
        btnchange.setOnClickListener {
            contract.launch(imageUri)
        }
    }

    private fun createImageUri(): Uri? {
        val image = File(applicationContext.filesDir, "camera_photo.png")
        return FileProvider.getUriForFile(applicationContext,
                "com.example.prunedeliveryapplication.fileProvider",
                 image
        )
    }
}