package com.ppandroid.whitefm.base;

import android.support.v4.app.Fragment;

/**
 * Created by yeqinfu on 2016/4/7.
 */
public  class FG_Base extends Fragment {
    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fancy_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }*/
    /**
     * 销毁当前页面
     */
    protected void finishFG(){
        if (null != getActivity()){
            getActivity().finish();
        }
    }
}
