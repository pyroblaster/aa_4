package hr.ferit.brunozoric.taskie.ui.activities

import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.common.showFragment
import hr.ferit.brunozoric.taskie.ui.activities.base.BaseActivity
import hr.ferit.brunozoric.taskie.ui.fragments.AboutFragment
import hr.ferit.brunozoric.taskie.ui.fragments.TasksFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getLayoutResourceId() = R.layout.activity_main

    override fun setUpUi() {
        showFragment(TasksFragment.newInstance())
        bottomNav.setOnNavigationItemSelectedListener(this)
    }


}