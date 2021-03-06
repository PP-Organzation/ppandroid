package com.ppandroid.whitefm.base;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import butterknife.ButterKnife;


/**
 * Created by yeqinfu on 2016/4/7.
 */
public abstract   class FG_Base extends Fragment {

    /**
     * 子类必须实现的layout
     * @return
     */
    public abstract  int getFragmentLayout();
    public abstract void afterViews();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentLayout(), container, false);
        ButterKnife.bind(this, view);
        afterViews();
        return view;
    }
    /**
     * 销毁当前页面
     */
    protected void finishFG(){
        if (null != getActivity()){
            getActivity().finish();
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);//解绑
    }
}
