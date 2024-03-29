package com.example.apptodolist.modul.login;

/**
 * Created by fahrul on 13/03/19.
 */

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;



    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogin(final String email, final String password){
        //proses login
        //if login success call redirect to profile
        if((email.equals("sylvi") && password.equals("safira"))){
            view.redirectToProfile(email, password);
        } else {
            view.showAuthFailed();
        }
    }

}
