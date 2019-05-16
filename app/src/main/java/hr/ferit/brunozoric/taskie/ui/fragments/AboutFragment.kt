package hr.ferit.brunozoric.taskie.ui.fragments

import android.os.Bundle
import android.view.View
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.fragments.base.BaseFragment

abstract class AboutFragment:BaseFragment(){


    override fun getLayoutResourceId() = R.layout.fragment_about

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}