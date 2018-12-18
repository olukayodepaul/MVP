package com.leventisfoods.paul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leventisfoods.paul.mvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);


    }


}
