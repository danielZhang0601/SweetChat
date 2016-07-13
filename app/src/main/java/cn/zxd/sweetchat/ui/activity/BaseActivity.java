package cn.zxd.sweetchat.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by danielzhang on 16/7/13.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public static void launch(Context context, Class activityClass, Bundle bundle) {
        Intent intent = new Intent(context, activityClass);
        if (null != bundle)
            intent.putExtras(bundle);
        context.startActivity(intent);
    }

}
