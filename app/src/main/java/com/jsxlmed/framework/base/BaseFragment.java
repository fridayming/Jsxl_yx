package com.jsxlmed.framework.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsxlmed.utils.LogUtils;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    private View inflate;
    private int contentViewRes = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (inflate == null) {
            LogUtils.d(getClass().getName() + "初始化");
            setContentLayout(savedInstanceState);
            if (contentViewRes == -1) {
                LogUtils.d("未设置布局");
                return null;
            }
            inflate = inflater.inflate(contentViewRes, null);
            ButterKnife.bind(this, inflate);
            if (inflate != null)
                initView(inflate);
        } else {
            LogUtils.d(getClass().getName() + "再次加载,无需初始化");
        }

        return inflate;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.d(getClass().getName() + "[onDestroy]");
//        NetChangeManager.newInstance(softApplication).removeMinitor(this);
    }

    public abstract void setContentLayout(Bundle savedInstanceState);

    public abstract void initView(View v);

    public void setContentView(int resId) {
        this.contentViewRes = resId;
    }



}

