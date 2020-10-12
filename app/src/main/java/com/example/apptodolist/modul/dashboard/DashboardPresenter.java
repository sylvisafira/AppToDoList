package com.example.apptodolist.modul.dashboard;

/**
 * Created by fahrul on 13/03/19.
 */

public class DashboardPresenter implements DashboardContract.Presenter{
    private final DashboardContract.View view;



    public DashboardPresenter(DashboardContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        //proses login
        //if login success call redirect to profile
    }

}
