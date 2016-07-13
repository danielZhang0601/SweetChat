package cn.zxd.sweetchat.ui.activity;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.View;

/**
 * Created by danielzhang on 16/7/13.
 */

public abstract class FullScreenActivity extends BaseActivity {

    static final int UI_ANIMATION_DELAY = 100;

    final Handler mHideHandler = new Handler();

    View mContentView;

    final Runnable fullScreenRunnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };

    void fullScreen() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(fullScreenRunnable);
        mHideHandler.postDelayed(fullScreenRunnable, UI_ANIMATION_DELAY);
    }
}
