package hr.ferit.brunozoric.taskie.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import hr.ferit.brunozoric.taskie.ui.fragments.AboutAppFragment
import hr.ferit.brunozoric.taskie.ui.fragments.AboutAuthorFragment

class AboutAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = AboutAppFragment()
            1 -> fragment = AboutAuthorFragment()
        }
        return fragment!!
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