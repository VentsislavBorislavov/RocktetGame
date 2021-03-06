package com.example.rocketgame.di.modules;

import com.example.rocketgame.ui.activities.MainActivity;
import com.example.rocketgame.ui.fragments.BaseFragment;
import com.example.rocketgame.ui.fragments.ClassationFragment;
import com.example.rocketgame.ui.fragments.DeathFragment;
import com.example.rocketgame.ui.fragments.GameFragment;
import com.example.rocketgame.ui.fragments.GameTypeChooseFragment;
import com.example.rocketgame.ui.fragments.MainMenuFragment;
import com.example.rocketgame.ui.fragments.MultiplayerHostFragment;
import com.example.rocketgame.ui.fragments.PauseMenuFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsModule {

    @ContributesAndroidInjector
    abstract MainMenuFragment provideMainMenuFragment();

    @ContributesAndroidInjector
    abstract GameFragment provideGameFragment();

    @ContributesAndroidInjector
    abstract MultiplayerHostFragment provideMultiplayerHostFragment();

    @ContributesAndroidInjector
    abstract PauseMenuFragment providePauseMenuFragment();

    @ContributesAndroidInjector
    abstract DeathFragment provideDeathFragment();

    @ContributesAndroidInjector
    abstract ClassationFragment provideClassationFragment();

    @ContributesAndroidInjector
    abstract GameTypeChooseFragment provideGameTypeChooseFragment();


}
