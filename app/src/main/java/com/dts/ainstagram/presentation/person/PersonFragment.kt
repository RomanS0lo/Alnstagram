package com.dts.ainstagram.presentation.person

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dts.ainstagram.R
import com.dts.ainstagram.databinding.FragmentPersonBinding
import com.dts.ainstagram.presentation.core.CoreFragment

class PersonFragment :
    CoreFragment<FragmentPersonBinding, PersonViewModel>(R.layout.fragment_person) {

    private val viewModel: PersonViewModel by viewModels()

    override fun onViewBinding(view: View) = FragmentPersonBinding.bind(view)

    override fun onViewReady(view: View, savedInstanceState: Bundle?) {
    }
}