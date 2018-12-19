package com.leventisfoods.paul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.leventisfoods.paul.mvp.R;
import com.leventisfoods.util.AppToast;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {


    private MainPresenterIml mainPresenter;
    private Button mBtns;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterIml(MainActivity.this);
        mainPresenter.signIn("Paul","sola");

    }


    @Override
    public void showValidationError(String call, String message) {
        AppToast.showToast(getApplicationContext(), message);
    }

    @Override
    public void signSuccess() {

    }

    @Override
    public void signInError() {
    }
}
