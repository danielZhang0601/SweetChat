package cn.zxd.sweetchat.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.widget.Toast;

import com.hyphenate.EMCallBack;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.zxd.sweetchat.R;
import cn.zxd.sweetchat.common.EaseMobCommon;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.tie_login_account)
    TextInputEditText tie_login_account;
    @BindView(R.id.tie_login_password)
    TextInputEditText tie_login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login_submit)
    void submit() {
        EaseMobCommon.getInstance().login(tie_login_account.getText().toString(), tie_login_password.getText().toString(), new EMCallBack() {
            @Override
            public void onSuccess() {
                LoginActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                        launch(LoginActivity.this, MainActivity.class, null);
                        finish();
                    }
                });
            }

            @Override
            public void onError(int i, final String s) {
                LoginActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onProgress(int i, String s) {

            }
        });
    }

}
