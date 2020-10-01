package com.example.runningpro.ui.fragments


import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runningpro.R
import com.example.runningpro.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {
    private val viewModel: MainViewModel by viewModels()
}