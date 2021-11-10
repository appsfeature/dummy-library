package com.dummylibrary;

import android.content.Context;
import android.widget.Toast;

import com.dummylibrary.libhelper.LibHelper;

public class DummyLib {

    private static volatile DummyLib sSoleInstance;

    private DummyLib() {
        if (sSoleInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static DummyLib getInstance() {
        if (sSoleInstance == null) {
            synchronized (DummyLib.class) {
                if (sSoleInstance == null) sSoleInstance = new DummyLib();
            }
        }
        return sSoleInstance;
    }

    public void showToast(Context context, String message) {
        LibHelper.getInstance().toast(context, message);
    }
}
