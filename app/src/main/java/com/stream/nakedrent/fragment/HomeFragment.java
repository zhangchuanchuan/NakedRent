package com.stream.nakedrent.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.adapter.GoodsItemAdapter;
import com.stream.nakedrent.vo.GoodsDetailVo;

import java.util.ArrayList;
import java.util.List;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:30
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class HomeFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<GoodsDetailVo> list = new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add(new GoodsDetailVo());
        }
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView goodsListView = (RecyclerView)view.findViewById(R.id.goods_list);

        GoodsItemAdapter adapter = new GoodsItemAdapter(getContext(), list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        goodsListView.setLayoutManager(layoutManager);
        goodsListView.setAdapter(adapter);
        return view;
    }
}
