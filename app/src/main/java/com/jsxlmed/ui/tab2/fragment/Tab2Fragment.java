package com.jsxlmed.ui.tab2.fragment;

import android.os.Bundle;
import android.view.View;

import com.jsxlmed.R;
import com.jsxlmed.framework.base.MvpFragment;
import com.jsxlmed.mvp.presenter.HomePresenter;
import com.jsxlmed.mvp.view.HomeView;

public class Tab2Fragment extends MvpFragment<HomePresenter> implements HomeView {


    @Override
    public void setContentLayout(Bundle savedInstanceState) {
        setContentView(R.layout.tab2_fragment);



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
