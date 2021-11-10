package com.dummylibrary.libhelper;

import android.content.Context;
import android.widget.Toast;

public class LibHelper {

    private static volatile LibHelper sSoleInstance;

    private LibHelper() {
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static LibHelper getInstance() {
        if (sSoleInstance == null) {
            synchronized (LibHelper.class) {
                if (sSoleInstance == null) sSoleInstance = new LibHelper();
            }
        }
        return sSoleInstance;
    }

    public void toast(Context context, String message) {
        Toast.makeText(context, "LibHelper:" + message, Toast.LENGTH_SHORT).show();
    }
}