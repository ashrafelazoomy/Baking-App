package com.example.adam.baking_app.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.adam.baking_app.R;
import com.example.adam.baking_app.models.Step;
import com.example.adam.baking_app.ui.RecipeStepDetailFragment;

import java.util.List;

/**
 * Created by Adam on 4/28/2018.
 */

public class StepsFragmentPagerAdapter  extends FragmentPagerAdapter {
    private Context mContext;
    private List<Step> mSteps;

    public StepsFragmentPagerAdapter(Context context, List<Step> steps, FragmentManager fm) {
        super(fm);
        this.mContext = context;
        this.mSteps = steps;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle arguments = new Bundle();
        arguments.putParcelable(RecipeStepDetailFragment.STEP_KEY, mSteps.get(position));
        RecipeStepDetailFragment fragment = new RecipeStepDetailFragment();
        fragment.setArguments(arguments);

        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return String.format(mContext.getString(R.string.step), position+1);
    }

    @Override
    public int getCount() {
        return mSteps.size();
    }


}
