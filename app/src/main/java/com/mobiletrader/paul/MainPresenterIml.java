package com.mobiletrader.paul;

import android.text.TextUtils;

import com.mobiletrader.contactors.ContractHandler;

public class MainPresenterIml implements ContractHandler.LoginPresenter{

    private ContractHandler.LoginView views;

    MainPresenterIml(ContractHandler.LoginView views){
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
