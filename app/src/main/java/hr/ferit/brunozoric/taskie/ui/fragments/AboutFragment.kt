package hr.ferit.brunozoric.taskie.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.ui.adapters.AboutAdapter
import hr.ferit.brunozoric.taskie.ui.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment: BaseFragment(){

    override fun getLayoutResourceId() = R.layout.fragment_about

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        viewPager.adapter = AboutAdapter(fragmentManager)

        return inflater.inflate(getLayoutResourceId(), container, false)
    }

}