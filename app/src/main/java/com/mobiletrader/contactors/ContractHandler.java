package com.mobiletrader.contactors;


import com.mobiletrader.ui.MainActivity;
import com.mobiletrader.implementation.LoginPresenterIml;

/**
 * Define the contract between the View {@link MainActivity} and the Presenter
 * {@link LoginPresenterIml}
 */


public interface ContractHandler {

    //Response to view
    interface LoginView {
        void showError(String message);
        void signSuccess();
    }

    //Request from view
    interface LoginPresenter {
        void signIn(String user, String password);
    }

}
