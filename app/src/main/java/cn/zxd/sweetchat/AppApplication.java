package cn.zxd.sweetchat;

import android.app.Application;

import cn.zxd.sweetchat.common.EaseMobCommon;

/**
 * Created by danielzhang on 16/7/13.
 */

public class AppApplication extends Application {

    private static AppApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        EaseMobCommon.getInstance().init(this);
    }

    public static AppApplication getInstance() {
        return instance;
    }
}
