package com.stream.nakedrent.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.stream.nakedrent.fragment.GoodsDetailFragment;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:38
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class GoodsDetailActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new GoodsDetailFragment()).commit();
    }
}
