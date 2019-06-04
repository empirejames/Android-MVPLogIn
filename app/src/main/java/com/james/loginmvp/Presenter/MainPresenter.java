package com.james.loginmvp.Presenter;

import android.util.Log;

import com.james.loginmvp.Model.MainModel;
import com.james.loginmvp.View.MainView;

/**
 * Created by 101716 on 2019/6/4.
 */

public class MainPresenter {
    private static final String TAG = "MainPresenter";
    private MainModel mainModel;
    private MainView mainView;
    public MainPresenter(MainView mainView, MainModel mainModel){
        this.mainModel = mainModel;
        this.mainView = mainView;
    }

    public void onCreate(){
        Log.e(TAG, "onCreate");
        mainView.setContentView();
    }
    public void onLoginClick(String account, String pass){
        Log.e(TAG,"Login Click");
        mainModel.checkAccount(account, pass);
        mainView.clearEdittext();
        mainView.toastmsg(mainModel.checkSuccessMsg());
    }
}
