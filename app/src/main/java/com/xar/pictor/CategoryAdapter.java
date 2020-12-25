package com.xar.pictor;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentStateAdapter} that can provide the layout for
 * each objects.
 */
public class CategoryAdapter extends FragmentStateAdapter {

    // Context of the app
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     */
    public CategoryAdapter(FragmentManager fm, Lifecycle lifecycle) {
        super(fm, lifecycle);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new CameraFragment();
        } else {
            return new SettingFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

}