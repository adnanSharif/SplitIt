package info.adnansharif.splitit.LoginSignup;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import info.adnansharif.splitit.R;

public class LoginSignupDialog extends DialogFragment {
    private TabLayout mTabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.login_signup, container);

        mTabLayout = view.findViewById(R.id.tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("Login"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Sign Up"));
//        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                String tabName = tab.getText().toString();
//                final View tabView = tab.getCustomView();
//                if( tabName.equalsIgnoreCase("login")){
//                    Button loginButton = tabView.findViewById(R.id.fragment_login_button);
//                    loginButton.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            EditText username = tabView.findViewById(R.id.fragment_login_username);
//                            EditText password = tabView.findViewById(R.id.fragment_login_password);
//                            TextView warning = tabView.findViewById(R.id.fragment_login_warning);
//
//                            warning.setVisibility(View.VISIBLE);
//                            String usernameString = username.getText().toString();
//                            String userPasswordString = password.getText().toString();
//                            warning.setText(usernameString+userPasswordString);
//                        }
//                    });
//                }
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

        return view;
    }

}
