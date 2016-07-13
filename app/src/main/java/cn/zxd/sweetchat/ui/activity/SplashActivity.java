package cn.zxd.sweetchat.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.zxd.sweetchat.R;

public class SplashActivity extends FullScreenActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContentView = findViewById(R.id.fl_splash_root);
    }

    @Override
    protected void onStart() {
        super.onStart();
        fullScreen();
    }
}
