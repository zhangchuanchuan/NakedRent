package com.stream.nakedrent.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:31
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class MyFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_myself, container, false);
    }
}
