package cn.zxd.sweetchat.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.zxd.sweetchat.R;

public class SplashActivity extends FullScreenActivity {

    @BindView(R.id.fl_splash_root)
    FrameLayout fl_splash_root;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mContentView = fl_splash_root;
    }

    @Override
    protected void onStart() {
        super.onStart();
        fullScreen();
    }
}
