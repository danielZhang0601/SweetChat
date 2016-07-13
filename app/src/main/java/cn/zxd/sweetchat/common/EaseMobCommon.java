package cn.zxd.sweetchat.common;

import android.content.Context;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.hyphenate.exceptions.HyphenateException;

import cn.zxd.sweetchat.BuildConfig;

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
        EMOptions options = new EMOptions();
        //不自动接受好友请求
        options.setAcceptInvitationAlways(false);
        //不自动接受加群邀请
        options.setAutoAcceptGroupInvitation(false);
        //初始化
        EMClient.getInstance().init(context, options);
        EMClient.getInstance().setDebugMode(BuildConfig.DEBUG);
    }

    public boolean isLoggedIn() {
        return EMClient.getInstance().isLoggedInBefore();
    }

    public void regist(String account, String password) throws HyphenateException {
        EMClient.getInstance().createAccount(account, password);
    }

    public void login(String account, String password, EMCallBack loginCallBack) {
        EMClient.getInstance().login(account, password, loginCallBack);
    }

    public void logout() {
        EMClient.getInstance().logout(true);
    }
}
