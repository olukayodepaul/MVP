package com.leventisfoods.paul;

import android.text.TextUtils;

public class MainPresenterIml implements MainContract.LoginPresenter{

    private MainContract.LoginView views;


    MainPresenterIml(MainContract.LoginView views){
        this.views = views;
    }

    @Override
    public void signIn(String user, String password){
        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(password)){
            views.showValidationError("Please enter password and usernamer");
        }else{
            views.signSuccess();
        }
    }

}
