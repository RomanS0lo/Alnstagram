package com.dts.ainstagram.presentation.camera


import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentCameraBinding
import com.dts.ainstagram.presentation.core.CoreFragment
import com.github.florent37.camerafragment.PreviewActivity
import com.github.florent37.camerafragment.configuration.Configuration
import com.github.florent37.camerafragment.listeners.CameraFragmentResultListener


class CameraFragment:CoreFragment<FragmentCameraBinding, CameraViewModel>(R.layout.fragment_camera) {

    companion object{
        const val KEY = "object"
    }

    private lateinit var cameraFragment: CameraFragment

    private val viewModel: CameraViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentCameraBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        setupListener()
        permissionCheck()
    }

    private fun permissionCheck() {
        if (ContextCompat.checkSelfPermission(requireContext(),Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            startActivityCameraFragment()
        }else{
            requestPermission()
        }
    }

    @SuppressLint("MissingPermission")
    private fun startActivityCameraFragment() {
        cameraFragment = CameraFragment.newInstance(Configuration.Builder().build())

        childFragmentManager.beginTransaction().replace(R.id.content, cameraFragment, "Nothing")
            .commit()

    }




    private fun setupListener() {
        binding.btnTakePhoto.setOnClickListener {
            takeNewPhoto()
        }
    }

    private fun takeNewPhoto() {
        var callBackListener: CameraFragmentResultListener = object :CameraFragmentResultListener{
            override fun onVideoRecorded(filePath: String?) {
                println(filePath)
            }

            override fun onPhotoTaken(bytes: ByteArray?, filePath: String?) {
                val intent = PreviewActivity.newIntentPhoto(requireContext(),filePath)
                startActivityForResult(intent, 200)
            }

        }
        cameraFragment.takePhotoOrCaptureVideo(callBackListener, "storage/self/primary", "Photo_test")
    }

    private fun requestPermission() {
        val permissions = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )

        activity?.let { ActivityCompat.requestPermissions(it, permissions, PackageManager.PERMISSION_GRANTED) }
    }

}
