package com.dts.ainstagram.presentation.tab_home.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dts.ainstagram.presentation.camera.CameraFragment
import com.dts.ainstagram.presentation.camera.CameraFragment.Companion.KEY
import com.dts.ainstagram.presentation.tab_home.TabHomeFragment

private const val NUM_PAGES = 2

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> {
                CameraFragment()
            }
            1 ->{
                TabHomeFragment()
            }
            else -> {
                TabHomeFragment()
            }
        }
    }


}

