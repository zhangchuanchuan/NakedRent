package com.stream.nakedrent.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.stream.nakedrent.fragment.MainFragment;
import com.stream.nakedrent.fragment.MainTabFragment;

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
public class MainActivity extends BaseActivity {
    private long pressTime = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            MainFragment mainFragment = new MainFragment();
            MainTabFragment mainTabFragment = new MainTabFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, mainFragment).commit();
            getFragmentManager().beginTransaction().add(android.R.id.content, mainTabFragment).commit();
        }
    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        if(currentTime - pressTime < 2000){
            super.finish(false);
        }else{
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
            pressTime = currentTime;
        }
    }

}
