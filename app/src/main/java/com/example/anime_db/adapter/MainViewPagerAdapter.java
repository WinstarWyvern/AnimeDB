package com.example.anime_db.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.anime_db.homeFragment.ListFragment;
import com.example.anime_db.homeFragment.UserFragment;
import com.example.anime_db.homeFragment.ScheduleFragment;

public class MainViewPagerAdapter extends FragmentStateAdapter {
    private final String userName;

    public MainViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, String userName) {
        super(fragmentActivity);
        this.userName = userName;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new UserFragment(this.userName);
            case 2:
                return new ScheduleFragment();
            default:
                return new ListFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
