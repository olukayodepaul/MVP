package com.mobiletrader.paul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mobiletrader.contactors.ContractHandler;
import com.mobiletrader.paul.mvp.R;
import com.mobiletrader.util.AppUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ContractHandler.LoginView {


    private MainPresenterIml mainPresenter;
    private Button mBtns;

    @BindView(R.id.users)
    EditText users;

    @BindView(R.id.pass)
    EditText pass;

    @BindView(R.id.btns)
    Button btns;



    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterIml(MainActivity.this);
        ButterKnife.bind(this);

        btns.setOnClickListener(v -> {
            String user = users.getText().toString();
            String pas = pass.getText().toString();
            mainPresenter.signIn(user,pas);

        });
    }

    @Override
    public void showValidationError(String msg){
        AppUtil.showToast(getApplicationContext(),msg);
    }

    @Override
    public void signSuccess() {
        AppUtil.showAlertDialog(MainActivity.this, "Error","please enter users and password","Ok");
    }


}
