package com.leventisfoods.paul;

public class MainPresenter  implements MainContract.MvpPresenter{

    private MainContract.MvpView views;


    MainPresenter(MainContract.MvpView views){
        this.views = views;
    }

}
