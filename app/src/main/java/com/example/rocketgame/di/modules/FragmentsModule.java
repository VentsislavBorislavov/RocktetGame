package com.example.rocketgame.di.modules;

import com.example.rocketgame.ui.activities.MainActivity;
import com.example.rocketgame.ui.fragments.BaseFragment;
import com.example.rocketgame.ui.fragments.MainMenuFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract MainMenuFragment provideMainMenuFragment();

}
