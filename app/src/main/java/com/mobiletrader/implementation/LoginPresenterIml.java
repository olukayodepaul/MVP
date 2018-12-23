package com.mobiletrader.implementation;

import android.text.TextUtils;

import com.mobiletrader.contactors.ContractHandler;

public class LoginPresenterIml implements ContractHandler.LoginPresenter{

    private ContractHandler.LoginView views;


    public LoginPresenterIml(ContractHandler.LoginView views) {
        this.views = views;
    }

    @Override
    public void signIn(String user, String password){

        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(password)){
            views.showError("Please enter password and usernamer");
        }else{
            views.signSuccess();
        }
    }

}
