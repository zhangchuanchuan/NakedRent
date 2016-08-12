package com.stream.nakedrent.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.databinding.ItemGoodsBinding;
import com.stream.nakedrent.databinding.ItemOrderBinding;
import com.stream.nakedrent.fragment.GoodsDetailFragment;
import com.stream.nakedrent.fragment.OrderDetailFragment;
import com.stream.nakedrent.vo.GoodsDetailVo;
import com.stream.nakedrent.vo.OrderDetailVo;

import java.util.List;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:48
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class OrderItemAdapter extends RecyclerView.Adapter<OrderItemAdapter.OrderItemViewHolder>{

    List<OrderDetailVo> mDataList;

    Context mContext;

    public OrderItemAdapter(Context context, List<OrderDetailVo> orderDetailVoList){
        mContext = context;
        mDataList = orderDetailVoList;
    }

    @Override
    public OrderItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new OrderItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_order, parent, false));

    }

    @Override
    public void onBindViewHolder(OrderItemViewHolder holder, final int position) {
        ItemOrderBinding itemOrderBinding = DataBindingUtil.bind(holder.view);
        itemOrderBinding.setOrderItem(mDataList.get(position));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OrderDetailFragment.jumpToOrderDetailFragment(mContext, mDataList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class OrderItemViewHolder extends RecyclerView.ViewHolder{

        private View view;

        public OrderItemViewHolder(View itemView) {
            super(itemView);
            view = itemView;
        }

    }

}
