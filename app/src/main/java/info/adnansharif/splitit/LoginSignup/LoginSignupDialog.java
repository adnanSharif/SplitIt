package info.adnansharif.splitit.LoginSignup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.adnansharif.splitit.R;

public class LoginSignupDialog extends android.support.v4.app.DialogFragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    public LoginSignupDialog(){

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.login_signup, container);

        mViewPager = view.findViewById(R.id.pager);
        mTabLayout = view.findViewById(R.id.tabLayout);
        LoginSignupPagerAdapter adapter = new LoginSignupPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }

}
