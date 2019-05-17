package hr.ferit.brunozoric.taskie.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import hr.ferit.brunozoric.taskie.ui.fragments.AboutAppFragment
import hr.ferit.brunozoric.taskie.ui.fragments.AboutAuthorFragment

class ViewPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {

    override fun getItem(position: Int): Fragment {
        val fragment = when(position){
            0 -> AboutAppFragment.newInstance()
            1 -> AboutAuthorFragment.newInstance()
            else -> AboutAppFragment.newInstance()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "About App"
        } else if (position == 1) {
            title = "Author"
        }
        return title
    }

}