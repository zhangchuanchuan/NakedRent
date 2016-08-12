package com.stream.nakedrent.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stream.nakedrent.R;
import com.stream.nakedrent.event.SelectTabEvent;
import com.stream.nakedrent.utils.AppUtils;

import de.greenrobot.event.EventBus;

/**
 * description：
 * ===============================
 * creator：58
 * create time：2016/8/11 23:35
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class MainTabFragment extends Fragment implements View.OnClickListener{

    private TextView homeTab;
    private TextView orderTab;
    private TextView myselfTab;

    private int currentIndex;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_tab, container, false);
        homeTab = (TextView) view.findViewById(R.id.icon_home);
        orderTab = (TextView) view.findViewById(R.id.icon_order);
        myselfTab = (TextView) view.findViewById(R.id.icon_my);
        homeTab.setBackgroundColor(AppUtils.getColor(R.color.colorPrimary));
        homeTab.setOnClickListener(this);
        orderTab.setOnClickListener(this);
        myselfTab.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.icon_home:
                if(currentIndex == SelectTabEvent.TAB_MAIN_INDEX){
                    return;
                }
                resetColor(currentIndex);
                currentIndex = SelectTabEvent.TAB_MAIN_INDEX;
                homeTab.setBackgroundColor(AppUtils.getColor(R.color.colorPrimary));
                SelectTabEvent event = new SelectTabEvent(SelectTabEvent.TAB_MAIN_INDEX);
                EventBus.getDefault().post(event);
                break;
            case R.id.icon_order:
                if(currentIndex == SelectTabEvent.TAB_ORDER_INDEX){
                    return;
                }
                resetColor(currentIndex);
                currentIndex = SelectTabEvent.TAB_ORDER_INDEX;
                orderTab.setBackgroundColor(AppUtils.getColor(R.color.colorPrimary));

                SelectTabEvent orderEvent = new SelectTabEvent(SelectTabEvent.TAB_ORDER_INDEX);
                EventBus.getDefault().post(orderEvent);
                break;
            case R.id.icon_my:
                if(currentIndex == SelectTabEvent.TAB_MY_INDEX){
                    return;
                }
                resetColor(currentIndex);
                currentIndex = SelectTabEvent.TAB_MY_INDEX;
                myselfTab.setBackgroundColor(AppUtils.getColor(R.color.colorPrimary));

                SelectTabEvent myEvent = new SelectTabEvent(SelectTabEvent.TAB_MY_INDEX);
                EventBus.getDefault().post(myEvent);
                break;
        }
    }

    private void resetColor(int currentIndex) {
        switch (currentIndex){
            case SelectTabEvent.TAB_MAIN_INDEX:
                homeTab.setBackgroundColor(AppUtils.getColor(R.color.theme_color));
                break;
            case SelectTabEvent.TAB_ORDER_INDEX:
                orderTab.setBackgroundColor(AppUtils.getColor(R.color.theme_color));
                break;
            case SelectTabEvent.TAB_MY_INDEX:
                myselfTab.setBackgroundColor(AppUtils.getColor(R.color.theme_color));
                break;
        }
    }

}
