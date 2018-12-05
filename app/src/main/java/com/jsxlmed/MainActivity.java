package com.jsxlmed;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.jsxlmed.framework.base.BaseActivity;
import com.jsxlmed.framework.base.Constants;
import com.jsxlmed.mywidget.TabBar;
import com.jsxlmed.ui.tab1.fragment.HomeFragment;
import com.jsxlmed.ui.tab2.fragment.Tab2Fragment;
import com.jsxlmed.ui.tab3.fragment.Tab3Fragment;
import com.jsxlmed.ui.tab4.fragment.Tab4Fragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.m_bottom)
    TabBar mBottom;
    @BindView(R.id.m_frameLayout)
    FrameLayout mFrameLayout;

    private List<Fragment> fragments = new ArrayList<>();
    private HomeFragment tab1;
    private Tab2Fragment tab2;
    private Tab3Fragment tab3;
    private Tab4Fragment tab4;
    private Fragment mCurrentFragment = null; // 记录当前显示的Fragment
    private FragmentManager fm;

    private FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        fm = getSupportFragmentManager();
        tab1 = new HomeFragment();
        tab2 = new Tab2Fragment();
        tab3 = new Tab3Fragment();
        tab4 = new Tab4Fragment();
        fragments.add(tab1);
        fragments.add(tab2);
        fragments.add(tab3);
        fragments.add(tab4);
        //默认选中的界面
        mBottom.setOnItemChangedListener(onBottomItemClickListener);
        switchFragment(0);
       /* getVersionData();
        getData();*/
    }
    // 转换Fragment
    public void switchFragment(int position) {
        Constants.TabPosition = position;
        Fragment to = fragments.get(position);
        mBottom.checkTab(position);
        if (mCurrentFragment == null) {
            ft = fm.beginTransaction();
            ft.add(R.id.m_frameLayout, to).show(to);
            ft.commitAllowingStateLoss();
            mCurrentFragment = to;
            return;
        }
        if (mCurrentFragment != to) {
            ft = fm.beginTransaction();
            if (!to.isAdded()) {
                // 没有添加过:
                // 隐藏当前的，添加新的，显示新的
                ft.hide(mCurrentFragment).add(R.id.m_frameLayout, to).show(to);
            } else {
                // 隐藏当前的，显示新的
                ft.hide(mCurrentFragment).show(to);
            }
            mCurrentFragment = to;
            ft.commitAllowingStateLoss();
        }
    }

    /**
     * 底部导航栏的点击
     * //未登录状态下
     */
    TabBar.OnItemChangedListener onBottomItemClickListener = new TabBar.OnItemChangedListener() {
        @Override
        public void onItemChecked(int position) {
            switchFragment(position);
        }
    };
}
