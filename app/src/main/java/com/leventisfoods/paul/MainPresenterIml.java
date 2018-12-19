package com.leventisfoods.paul;

import android.text.TextUtils;

public class MainPresenterIml implements MainContract.MvpPresenter{

    private MainContract.MvpView views;


    MainPresenterIml(MainContract.MvpView views){
        this.views = views;
    }

    //here you can expose to api, realm and etc.
    @Override
    public void signIn(String user, String password) {

        if(TextUtils.isEmpty(user) || TextUtils.isEmpty(password)){
            views.showValidationError("rr","ppa");
        }else{
            views.signSuccess();
        }

    }

}
