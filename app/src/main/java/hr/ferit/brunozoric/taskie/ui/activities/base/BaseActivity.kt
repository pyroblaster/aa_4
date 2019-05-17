package hr.ferit.brunozoric.taskie.ui.activities.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import hr.ferit.brunozoric.taskie.R
import hr.ferit.brunozoric.taskie.common.showFragment
import hr.ferit.brunozoric.taskie.ui.fragments.AboutFragment
import hr.ferit.brunozoric.taskie.ui.fragments.TasksFragment
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity: AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutResourceId())
        setUpUi()

    }

    protected fun showFragment(fragment: Fragment){
        showFragment(R.id.fragmentContainer, fragment)
    }

    abstract fun getLayoutResourceId(): Int
    abstract fun setUpUi()

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navigation_tasks ->{
                showFragment(R.id.fragmentContainer, TasksFragment())
            }
            R.id.navigation_about ->{
                showFragment(R.id.fragmentContainer, AboutFragment())
            }

        }
        return true
    }
}