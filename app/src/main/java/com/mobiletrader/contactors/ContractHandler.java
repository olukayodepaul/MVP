package com.mobiletrader.contactors;


import com.mobiletrader.paul.MainActivity;
import com.mobiletrader.paul.MainPresenterIml;

/**
 * Define the contract between the View {@link MainActivity} and the Presenter
 * {@link MainPresenterIml}
 */


public interface ContractHandler {

    //Response to view
    interface LoginView {
        void showValidationError(String message);
        void signSuccess();
    }

    //Request from view
    interface LoginPresenter {
        void signIn(String user, String password);
    }

}
