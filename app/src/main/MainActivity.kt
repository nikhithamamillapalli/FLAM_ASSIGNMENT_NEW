package com.flam.demo

import android.os.Bundle
import android.view.SurfaceView
import org.opencv.android.*
import org.opencv.core.*

class MainActivity : CameraBridgeViewBase.CvCameraViewListener2 {
    private lateinit var cameraView: JavaCameraView

    external fun processFrameJNI(input: Long, output: Long)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cameraView = findViewById(R.id.camera_view)
        cameraView.visibility = SurfaceView.VISIBLE
        cameraView.setCvCameraViewListener(this)
    }

    override fun onCameraFrame(inputFrame: CameraBridgeViewBase.CvCameraViewFrame?): Mat {
        val input = inputFrame!!.rgba()
        val output = Mat()
        processFrameJNI(input.nativeObjAddr, output.nativeObjAddr)
        return output
    }
}
