package com.mobiletrader.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.mobiletrader.contactors.ContractHandler;
import com.mobiletrader.implementation.LoginPresenterIml;
import com.mobiletrader.ui.mvp.R;
import com.mobiletrader.util.AppUtil;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ContractHandler.LoginView {


    private LoginPresenterIml mainPresenter;
    private Button mBtns;

    @BindView(R.id.users)
    EditText users;

    @BindView(R.id.pass)
    EditText pass;

    @BindView(R.id.btns)
    Button btns;

    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new LoginPresenterIml(MainActivity.this);
        ButterKnife.bind(this);

        btns.setOnClickListener(v -> {
            String user = users.getText().toString();
            String pas = pass.getText().toString();
            mainPresenter.signIn(user,pas);
        });
    }

    @Override
    public void showError(String msg){
        //AppUtil.showToast(getApplicationContext(),msg);
        AppUtil.showAlertDialog(MainActivity.this, "Error","please enter users and password","Ok");
    }

    @Override
    public void signSuccess() {
        //Return realm model
        intent = new Intent(MainActivity.this, homeActivity.class);
        startActivity(intent);
        finish();
    }

}
