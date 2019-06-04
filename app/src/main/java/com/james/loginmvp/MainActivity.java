package com.james.loginmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.james.loginmvp.Model.MainModel;
import com.james.loginmvp.Presenter.MainPresenter;
import com.james.loginmvp.View.MainView;

public class MainActivity extends AppCompatActivity implements MainView{
    private static final String TAG = "MainActivity";
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this,new MainModel());
        mainPresenter.onCreate();
    }

    @Override
    public void clearEdittext() {
        Log.e(TAG,"clearEdittext");
        getaccountViewById().setText("");
        getpassViewByid().setText("");
    }

    @Override
    public void toastmsg(String checkSuccessAccountMsg) {
        Log.e(TAG,"toastmsg");
        Toast.makeText(this,checkSuccessAccountMsg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_main);
    }

    public void btn_login(View view)
    {
        mainPresenter.onLoginClick(getaccountViewById().getText().toString(),getpassViewByid().getText().toString());
    }
    private EditText getpassViewByid() {
        return (EditText) findViewById(R.id.editText2);
    }

    private EditText getaccountViewById() {
        return (EditText) findViewById(R.id.editText);
    }
}
