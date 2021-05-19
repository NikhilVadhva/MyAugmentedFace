package com.example.myaugface.AugmentedFaceListener

import com.example.myaugface.face.AugmentedFaceRenderer.AugmentedFaceNode

public interface AugmentedFaceListener {
    fun onFaceAdded(face: AugmentedFaceNode)
    fun onFaceUpdate(face: AugmentedFaceNode)
}