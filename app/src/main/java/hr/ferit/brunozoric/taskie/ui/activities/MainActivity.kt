package hr.ferit.brunozoric.taskie.ui.activities

import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.common.showFragment
import hr.ferit.brunozoric.taskie.ui.activities.base.BaseActivity
import hr.ferit.brunozoric.taskie.ui.fragments.TasksFragment
import hr.ferit.brunozoric.taskie.ui.fragments.ViewPagerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener{

    override fun getLayoutResourceId() = R.layout.activity_main

    override fun setUpUi() {
        showFragment(TasksFragment.newInstance())
        bottomNav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navigation_tasks ->{
                showFragment(R.id.fragmentContainer, TasksFragment())
            }
            R.id.navigation_about ->{
                showFragment(R.id.fragmentContainer, ViewPagerFragment())
            }

        }
        return true
    }


}