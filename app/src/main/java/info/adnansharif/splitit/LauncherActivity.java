package info.adnansharif.splitit;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import info.adnansharif.splitit.LoginSignup.LoginSignupDialog;

public class LauncherActivity extends AppCompatActivity {

    private Button mLoginButton;
    private Button mGuestButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        mAuth = FirebaseAuth.getInstance();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);

    }

    private void updateUI(FirebaseUser currentUser) {
        if(currentUser == null){
            initView();
        } else {
            Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }

    private void initView(){
        mLoginButton = findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new LoginSignupDialog();
                dialogFragment.show(getSupportFragmentManager(), " ");
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
