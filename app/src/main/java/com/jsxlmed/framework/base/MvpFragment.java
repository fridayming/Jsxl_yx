package com.jsxlmed.framework.base;

import android.os.Bundle;


public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment {
    public P mvpPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
        mvpPresenter.attachView(this);
    }

    protected abstract P createPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

}

