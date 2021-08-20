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
import com.dts.ainstagram.presentation.tab_home.TabHomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainHolderFragment :
    CoreFragment<FragmentMainHolderBinding, MainHolderViewModel>(R.layout.fragment_main_holder) {

    private val viewModel: MainHolderViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentMainHolderBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
        val frCamera = CameraFragment()
        val frHome = TabHomeFragment()
        val frSearch = SearchFragment()
        val frShoppingCart = MallFragment()
        val frPerson = PersonFragment()

        viewModel.log()
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.camera -> setCurrentFragment(frCamera)
                R.id.home -> setCurrentFragment(frHome)
                R.id.person -> setCurrentFragment(frPerson)
                R.id.search -> setCurrentFragment(frSearch)
                R.id.shopCart -> setCurrentFragment(frShoppingCart)
            }
            true
        }

        setCurrentFragment(frHome)
    }

    private fun setCurrentFragment(fragment: Fragment) =
        parentFragmentManager.commit {
            replace(R.id.flFragment, fragment)
            setReorderingAllowed(true)
        }
    }
