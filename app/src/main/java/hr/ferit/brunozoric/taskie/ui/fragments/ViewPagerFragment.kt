package hr.ferit.brunozoric.taskie.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.adapters.ViewPagerAdapter
import hr.ferit.brunozoric.taskie.ui.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_about.*

class ViewPagerFragment: BaseFragment(){

    override fun getLayoutResourceId() = R.layout.fragment_about

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //viewPager?.adapter = ViewPagerAdapter(childFragmentManager)

        return inflater.inflate(getLayoutResourceId(), container, false)
    }

}