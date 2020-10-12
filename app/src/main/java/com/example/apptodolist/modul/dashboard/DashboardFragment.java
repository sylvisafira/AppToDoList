package com.example.apptodolist.modul.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

import com.example.apptodolist.R;
import com.example.apptodolist.base.BaseFragment;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardFragment extends BaseFragment<DashboardActivity, DashboardContract.Presenter> implements DashboardContract.View {

    //private FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.activity_main, container, false);
        mPresenter = new DashboardPresenter(this);
        mPresenter.start();

        //fab = findViewById(R.id.floatingActionButton);
        setTitle("Dashboard");
        return fragmentView;
    }
    public void setBtLoginClick(){
    }

    @Override
    public void setPresenter(DashboardContract.Presenter presenter) {
        mPresenter = presenter;
    }

    public void redirectToDashboard() {
        Intent intent = new Intent(activity, AddActivity.class);
        startActivity(intent);
        activity.finish();
    }

    @Override
    public void showAuthFailed() {

    }
}
