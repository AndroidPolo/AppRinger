package com.example.myapplication.ui.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPageAdapter : FragmentPagerAdapter {

    constructor(manager: FragmentManager) : super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    }

    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return ProductFragment()
            1 -> return PaymentFragment()
            2 -> return ShoppingFragment()
            else -> return ShoppingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "PRODUCT"
            }
            1 -> {
                return "PAYMENT"
            }
            2 -> {
                return "SHOPPING"
            }
        }
        return super.getPageTitle(position)
    }
}