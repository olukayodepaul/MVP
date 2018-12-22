package com.leventisfoods.paul;


/**
 * Define the contract between the View {@link MainActivity} and the Presenter
 * {@link MainPresenterIml}
 */


public interface MainContract {

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
