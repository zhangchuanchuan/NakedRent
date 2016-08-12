package com.stream.nakedrent.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.stream.nakedrent.fragment.OrderDetailFragment;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:39
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class OrderDetailActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new OrderDetailFragment()).commit();
    }
}
