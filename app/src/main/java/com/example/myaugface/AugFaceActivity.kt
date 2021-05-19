package com.example.myaugface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myaugface.AugmentedFaceListener.AugmentedFaceListener
import com.example.myaugface.face.AugmentedFaceRenderer.AugmentedFaceNode

class AugFaceActivity : AppCompatActivity() ,AugmentedFaceListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onFaceAdded(face: AugmentedFaceNode) {

    }

    override fun onFaceUpdate(face: AugmentedFaceNode) {

    }
}