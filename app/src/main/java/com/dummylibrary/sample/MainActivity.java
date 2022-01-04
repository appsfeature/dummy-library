package com.dummylibrary.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dummylibrary.DummyLib;
//import com.helper.util.SocialUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View view) {
        DummyLib.getInstance().showToast(this, "Happy To Help You!");
//        SocialUtil.openLinkInAppBrowser(this,"Browser","https://facebook.com");
    }
}