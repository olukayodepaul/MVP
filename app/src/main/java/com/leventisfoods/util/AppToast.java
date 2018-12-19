package com.leventisfoods.util;



import android.content.Context;
import android.widget.Toast;


public class AppToast {

    static Toast mToast;

    public static void showToast(Context context, String statusMsg){

        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context,statusMsg, Toast.LENGTH_SHORT);
        mToast.show();

    }

}