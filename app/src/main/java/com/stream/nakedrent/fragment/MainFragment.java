package com.stream.nakedrent.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stream.nakedrent.R;
import com.stream.nakedrent.event.SelectTabEvent;

import de.greenrobot.event.EventBus;

/**
 * description：管理三个tab的fragment
 * ===============================
 * creator：58
 * create time：2016/8/11 23:29
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */
public class MainFragment extends android.support.v4.app.Fragment {


    private Fragment mCurrentFragment;

    private Fragment mHomeFragment;
    private Fragment mOrderFragment;
    private Fragment mMyselfFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mHomeFragment = new HomeFragment();
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onResume() {
        super.onResume();
        if (mCurrentFragment == null) {
            mCurrentFragment = mHomeFragment;
            getFragmentManager().beginTransaction().add(R.id.main_fragment, mCurrentFragment).commit();
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(SelectTabEvent event) {
        if(event == null){
            return;
        }

        switch (event.getTabIndex()){
            case SelectTabEvent.TAB_MAIN_INDEX:
                goHome();
                break;
            case SelectTabEvent.TAB_ORDER_INDEX:
                goOrder();
                break;
            case SelectTabEvent.TAB_MY_INDEX:
                goMyself();
                break;
            default:
                break;
        }
    }

    private void goMyself() {
        if(mMyselfFragment == null){
            mMyselfFragment = new MyFragment();
        }
        switchFragment(mMyselfFragment);
    }

    private void goOrder() {
        if(mOrderFragment == null){
            mOrderFragment = new OrderFragment();
        }
        switchFragment(mOrderFragment);
    }

    private void goHome() {
        if(mHomeFragment == null){
            mHomeFragment = new HomeFragment();
        }
        switchFragment(mHomeFragment);
    }

    private void switchFragment(Fragment fragment){
        if(mCurrentFragment == fragment){
            return;
        }
        if(fragment.isAdded()){
            getFragmentManager().beginTransaction().show(fragment).hide(mCurrentFragment).commit();
        }else{
            getFragmentManager().beginTransaction().hide(mCurrentFragment).add(R.id.main_fragment, fragment).commit();
        }

        mCurrentFragment = fragment;

    }
}
