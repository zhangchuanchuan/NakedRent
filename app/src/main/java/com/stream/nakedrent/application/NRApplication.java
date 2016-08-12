package com.stream.nakedrent.application;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.stream.nakedrent.utils.AppUtils;
import com.yolanda.nohttp.NoHttp;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/12 22:18
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class NRApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        AppUtils.setContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initPlat();
    }

    private void initPlat() {
        NoHttp.init(this);
        Fresco.initialize(getApplicationContext());
    }
}
