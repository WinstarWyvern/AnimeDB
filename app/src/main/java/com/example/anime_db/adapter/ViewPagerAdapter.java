package com.example.anime_db.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.anime_db.homeFragment.ListFragment;
import com.example.anime_db.homeFragment.UserFragment;
import com.example.anime_db.homeFragment.UserListFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new UserFragment();
            case 2:
                return new UserListFragment();
            default:
                return new ListFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
