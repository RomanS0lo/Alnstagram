package com.dts.ainstagram.presentation.camera


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentCameraBinding
import com.dts.ainstagram.presentation.core.CoreFragment

class CameraFragment:CoreFragment<FragmentCameraBinding, CameraViewModel>(R.layout.fragment_camera){

    private val viewModel: CameraViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentCameraBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {

    }

}