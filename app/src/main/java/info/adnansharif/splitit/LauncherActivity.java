package info.adnansharif.splitit;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import info.adnansharif.splitit.LoginSignup.LoginSignupDialog;

public class LauncherActivity extends AppCompatActivity {

    Button mLoginButton;
    Button mGuestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        initView();

    }

    private void initView(){
        mLoginButton = findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new LoginSignupDialog();
                dialogFragment.show(getFragmentManager(),"Dialog");
            }
        });

        mGuestButton = findViewById(R.id.use_as_guest_button);
        mGuestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
