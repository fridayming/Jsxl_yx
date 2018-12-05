package com.jsxlmed.ui.tab1.fragment;

import android.os.Bundle;
import android.view.View;

import com.jsxlmed.R;
import com.jsxlmed.framework.base.MvpFragment;
import com.jsxlmed.mvp.presenter.HomePresenter;
import com.jsxlmed.mvp.view.HomeView;

public class HomeFragment extends MvpFragment<HomePresenter> implements HomeView {


    @Override
    public void setContentLayout(Bundle savedInstanceState) {
        setContentView(R.layout.home_fragment);
        mvpPresenter.getHomeData();
    }

    @Override
    public void initView(View v) {

    }
    @Override
    public void setHomeData() {

    }
    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter(this);
    }


}
