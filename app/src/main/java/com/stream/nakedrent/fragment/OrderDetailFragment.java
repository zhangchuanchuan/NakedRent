package com.stream.nakedrent.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.activity.OrderDetailActivity;
import com.stream.nakedrent.vo.OrderDetailVo;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/13 3:43
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class OrderDetailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_goods_detail, container, false);

        return view;
    }

    public static void jumpToOrderDetailFragment(Context context, OrderDetailVo vo){
        Intent intent = new Intent();
        intent.putExtra("order_detail", vo);
        intent.setClass(context, OrderDetailActivity.class);
        context.startActivity(intent);
    }


}
