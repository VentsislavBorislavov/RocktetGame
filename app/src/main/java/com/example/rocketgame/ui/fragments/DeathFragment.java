package com.example.rocketgame.ui.fragments;

import android.os.Bundle;
import android.view.View;

import com.example.rocketgame.App.GameEngine;
import com.example.rocketgame.R;
import com.example.rocketgame.core.contract.DeathFragmentContract;
import com.example.rocketgame.core.contract.PauseMenuFragmentContract;
import com.example.rocketgame.databinding.FragmentSinglePlayerDeadBinding;

import javax.inject.Inject;

public class DeathFragment extends BaseFragment<FragmentSinglePlayerDeadBinding, PauseMenuFragment.OnPauseMenuFragmentInteractionListener>
        implements DeathFragmentContract.ViewListener{

    @Inject
    DeathFragmentContract.PresentListener presentListener;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_single_player_dead;
    }

    @Override
    protected void onFragmentCreated(View view, Bundle savedInstanceState) {
        GameEngine.GAMESTAGE = null;
        presentListener.setViewListener(this);
        binding.btnHome.setOnClickListener(v -> presentListener.onMenuBtnClicked());
        binding.btnRetry.setOnClickListener(v -> presentListener.onRestartBtnClicked());
    }

    @Override
    public void goToMainMenu() {
        activityListener.goToMainMenu();
    }


    @Override
    public void RestartGame() {
        activityListener.RestartGame();
    }

    public interface OnDeathFragmentInteractionListener {

        void goToMainMenu();
        void RestartGame();
    }
}
