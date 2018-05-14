package com.example.adam.baking_app;

import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;

import com.example.adam.baking_app.ui.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;


/**
 * Created by Adam on 5/12/2018.
 */


public abstract class BaseTest {
    protected GlobalApplication globalApplication;
    protected IdlingResource mIdlingResource;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void registerIdlingResource() {
        globalApplication = (GlobalApplication) activityTestRule.getActivity().getApplicationContext();
        mIdlingResource = globalApplication.getIdlingResource();
        // Register Idling Resources
        IdlingRegistry.getInstance().register(mIdlingResource);
    }

    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister(mIdlingResource);
        }
    }
}

