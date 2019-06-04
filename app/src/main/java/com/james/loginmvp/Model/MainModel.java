package com.james.loginmvp.Model;

import android.util.Log;

/**
 * Created by 101716 on 2019/6/4.
 */

public class MainModel {
    private String msg = "";
    private static final String TAG = "MainModel";
    public void checkAccount(String account, String pass) {
        Log.e(TAG,"checkAccount");
        if(account.equals("james")){
            msg = "Successful";
        }else{
            msg = "Fail";
        }

    }

    public String checkSuccessMsg() {
        Log.e(TAG,"checkSuccessMsg");
        return msg;
    }
}
