package com.stream.nakedrent.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stream.nakedrent.R;
import com.stream.nakedrent.activity.GoodsDetailActivity;
import com.stream.nakedrent.vo.GoodsDetailVo;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/13 1:40
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class GoodsDetailFragment extends Fragment {
    private TextView buttonRent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_goods_detail, container, false);
        GoodsDetailVo vo = ((GoodsDetailVo) getActivity().getIntent().getSerializableExtra("goods_vo"));
        buttonRent = ((TextView) view.findViewById(R.id.button_rent));
        buttonRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderDetailFragment.jumpToOrderDetailFragment(getContext(), null);
                getActivity().finish();
            }
        });


        return view;
    }

    public static void jumpToGoodsDetailActivity(Context context, GoodsDetailVo vo){
        Intent intent = new Intent();
        intent.putExtra("goods_vo", vo);
        intent.setClass(context, GoodsDetailActivity.class);
        context.startActivity(intent);
    }
}
