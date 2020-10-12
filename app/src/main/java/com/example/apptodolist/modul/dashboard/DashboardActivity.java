package com.example.apptodolist.modul.dashboard;

import android.view.View;

import com.example.apptodolist.base.BaseFragmentHolderActivity;
import com.example.apptodolist.modul.dashboard.DashboardFragment;


public class DashboardActivity extends BaseFragmentHolderActivity {
    DashboardFragment dashboardFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        dashboardFragment = new DashboardFragment();
        setCurrentFragment(dashboardFragment, false);

    }



}
