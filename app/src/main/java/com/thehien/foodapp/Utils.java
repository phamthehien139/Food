
package com.thehien.foodapp;

import android.app.AlertDialog;
import android.content.Context;

import com.thehien.foodapp.api.FoodApi;
import com.thehien.foodapp.api.FoodClient;


public class Utils {

    public static FoodApi getApi() {
        return FoodClient.getFoodClient().create(FoodApi.class);
    }

    public static AlertDialog showDialogMessage(Context context, String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title).setMessage(message).show();
        if (alertDialog.isShowing()) {
            alertDialog.cancel();
        }
        return alertDialog;
    }
}
