package cn.zxd.sweetchat.common;

import android.content.Context;

/**
 * Created by danielzhang on 16/7/13.
 */
public class EaseMobCommon {
    private static EaseMobCommon ourInstance = new EaseMobCommon();

    public static EaseMobCommon getInstance() {
        return ourInstance;
    }

    private EaseMobCommon() {
    }

    /**
     * 初始化
     * @param context ApplicationContext
     */
    public void init(Context context) {

    }
}
