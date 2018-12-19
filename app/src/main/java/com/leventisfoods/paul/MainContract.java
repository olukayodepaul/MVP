package com.leventisfoods.paul;


/**
 * Define the contract between the View {@link MainActivity} and the Presenter
 * {@link MainPresenterIml}
 */



public interface MainContract  {

    interface MvpView{

        void showValidationError(String call, String message);
        void signSuccess();
        void signInError();

    }

    interface MvpPresenter{

        void signIn(String user, String password);
    }

}
