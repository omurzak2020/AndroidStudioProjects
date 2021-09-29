package com.example.homeworkk1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homeworkk1.ui.dashboard.DashboardFragment
import com.example.homeworkk1.ui.home.HomeFragment
import com.example.homeworkk1.ui.notifications.NotificationsFragment

class ViewPagerAdapter(fragment:FragmentActivity) : FragmentStateAdapter(fragment){
    companion object{
         private  var PAGE_COUNT = 3
    }

    override fun getItemCount()= PAGE_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            1-> DashboardFragment()
            2-> NotificationsFragment()
            else ->HomeFragment()
        }
    }
}