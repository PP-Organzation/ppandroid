package com.ppandroid.whitefm;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.antonioleiva.mvpexample.app.R;
import com.ppandroid.whitefm.base.AC_Base;

import butterknife.Bind;

/**
 * Created by yeqinfu on 16-4-2.
 */
public class AC_Main extends AC_Base{
    @Bind(R.id.tv_show)
    TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
        tv_show.setText("afteroncreate");
        Toast.makeText(AC_Main.this,"dasfa",Toast.LENGTH_LONG).show();
    }

}
