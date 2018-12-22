package com.mobiletrader.util;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.widget.Toast;


public class AppUtil {

    static Toast mToast;

    public static void showToast(Context context, String statusMsg) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, statusMsg, Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void showAlertDialog(Context context, String title, String msg, String buttons) {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle(title)
                .setMessage(msg)
                .setNegativeButton(buttons, (paramDialogInterface, paramInt) -> {
                });
        dialog.show();
    }

}