package com.example.apptodolist.modul.dashboard;

import com.example.apptodolist.base.BasePresenter;
import com.example.apptodolist.base.BaseView;

public interface DashboardContract {
    interface View extends BaseView<Presenter> {
        //void redirectToProfile(String email, String password);
        void showAuthFailed();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
