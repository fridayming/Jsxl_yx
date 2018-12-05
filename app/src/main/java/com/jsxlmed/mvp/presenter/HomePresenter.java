package com.jsxlmed.mvp.presenter;

import com.jsxlmed.framework.base.BasePresenter;
import com.jsxlmed.mvp.view.HomeView;
import com.jsxlmed.ui.tab1.bean.bean.FreeCourseEntity;
import com.jsxlmed.utils.LogUtils;

import io.reactivex.observers.DisposableObserver;

public class HomePresenter extends BasePresenter<HomeView> {

    private FreeCourseEntity freeCourseEntity;
    public HomePresenter(HomeView iView) {
        super(iView);
    }

    //获取数据
    public void getHomeData() {
        addSubscription(mApiService.getMainData(), new DisposableObserver<FreeCourseEntity>() {
            @Override
            public void onNext(FreeCourseEntity value) {
                freeCourseEntity=value;
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.d(e.getMessage());
            }

            @Override
            public void onComplete() {
                if (mView != null) {
                    LogUtils.d("请求完成");
                }
            }
        });

    }

}
