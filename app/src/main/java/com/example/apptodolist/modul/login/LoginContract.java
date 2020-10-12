package com.example.apptodolist.modul.login;

import com.example.apptodolist.base.BasePresenter;
import com.example.apptodolist.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile(String email, String password);
        void showAuthFailed();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
