package quest.com.quest.activities;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import dialog.QuestDialog;
import quest.com.quest.R;
import quest.com.quest.databinding.ActivitityLoginBinding;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by skumbam on 23-02-2017.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private ActivitityLoginBinding dataBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activitity_login);
        initViews(dataBinding);
    }

    private void initViews(ActivitityLoginBinding dataBinding) {
        dataBinding.btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_login:
                if(isNetworkConnected(LoginActivity.this)){
                 // write the action to be performed whenever network is connected
                    navigatetoNextActivity(LoginActivity.this,new DashBoardActivity());
                }
                else {
                    //show a dialog to connect to a network
                    QuestDialog.showOkDialog(LoginActivity.this,getString(R.string.network_error),getString(R.string.network_error_message));
                }
                break;
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
