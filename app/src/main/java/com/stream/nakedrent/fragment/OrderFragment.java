package com.stream.nakedrent.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.adapter.OrderItemAdapter;
import com.stream.nakedrent.databinding.ItemGoodsBinding;
import com.stream.nakedrent.databinding.ItemOrderBinding;
import com.stream.nakedrent.vo.OrderDetailVo;

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
public class OrderFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        List<OrderDetailVo> list = new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add(new OrderDetailVo());
        }
        View view = inflater.inflate(R.layout.fragment_order, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.order_list);
        OrderItemAdapter adapter = new OrderItemAdapter(getContext(), list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
