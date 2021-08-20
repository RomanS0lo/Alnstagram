package com.dts.ainstagram.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import com.dts.ainstagram.*
import com.dts.ainstagram.databinding.FragmentMainHolderBinding
import com.dts.ainstagram.presentation.camera.CameraFragment
import com.dts.ainstagram.presentation.core.CoreFragment
import com.dts.ainstagram.presentation.mall.MallFragment
import com.dts.ainstagram.presentation.person.PersonFragment
import com.dts.ainstagram.presentation.search.SearchFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainHolderFragment :
    CoreFragment<FragmentMainHolderBinding, MainHolderViewModel>(R.layout.fragment_main_holder) {

    private val viewModel: MainHolderViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentMainHolderBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        val frCamera = CameraFragment()
        //create instance of class home fragment
        val frSearch = SearchFragment()
        val frShoppingCart = MallFragment()
        val frPerson = PersonFragment()

        viewModel.log()
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.camera -> setCurrentFragment(frCamera)
                //create reference to home item and set up navigation
                R.id.person -> setCurrentFragment(frPerson)
                R.id.search -> setCurrentFragment(frSearch)
                R.id.shopCart -> setCurrentFragment(frShoppingCart)
            }
            true
        }

       // setCurrentFragment() //set home fragment as default fragment
    }

    private fun setCurrentFragment(fragment: Fragment) =
        parentFragmentManager.commit {
            replace(R.id.flFragment, fragment)
            setReorderingAllowed(true)
        }
    }
