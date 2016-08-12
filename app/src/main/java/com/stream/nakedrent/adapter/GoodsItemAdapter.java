package com.stream.nakedrent.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.databinding.ItemGoodsBinding;
import com.stream.nakedrent.fragment.GoodsDetailFragment;
import com.stream.nakedrent.vo.GoodsDetailVo;

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
public class GoodsItemAdapter extends RecyclerView.Adapter<GoodsItemAdapter.GoodsItemViewHolder>{

    List<GoodsDetailVo> mDataList;

    Context mContext;

    public GoodsItemAdapter(Context context, List<GoodsDetailVo> goodsDetailVoList){
        mContext = context;
        mDataList = goodsDetailVoList;
    }

    @Override
    public GoodsItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GoodsItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_goods, parent, false));

    }

    @Override
    public void onBindViewHolder(GoodsItemViewHolder holder, final int position) {
        ItemGoodsBinding itemGoodsBinding = DataBindingUtil.bind(holder.view);
        itemGoodsBinding.setGoodsItem(mDataList.get(position));
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GoodsDetailFragment.jumpToGoodsDetailActivity(mContext, mDataList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class GoodsItemViewHolder extends RecyclerView.ViewHolder{

        private View view;

        public GoodsItemViewHolder(View itemView) {
            super(itemView);
            view = itemView;
        }

    }

}
