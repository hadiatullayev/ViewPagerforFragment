package developer.abdulahad.viewpagerforfragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import developer.abdulahad.viewpagerforfragment.ViewPagerFragment.ItemFragment1
import developer.abdulahad.viewpagerforfragment.ViewPagerFragment.ItemFragment2
import developer.abdulahad.viewpagerforfragment.models.User

class FragmentAdapter(fragmentManager: FragmentManager, val list: ArrayList<User>) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
         if (position%2==0){
            return ItemFragment1().newInstance(list[position])
        }
        else{
            return ItemFragment2.newInstance(list[position].name,list[position].imageLink)
         }
    }
}