package com.example.mlkittext

import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.camera2.*;


class CameraClass : AppCompatActivity() {
    private lateinit var camera2: Camera

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_class)
        camera2 = Camera()



    }

}