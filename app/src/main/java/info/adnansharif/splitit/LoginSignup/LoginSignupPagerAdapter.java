package info.adnansharif.splitit.LoginSignup;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class LoginSignupPagerAdapter extends FragmentStatePagerAdapter{

    public LoginSignupPagerAdapter( FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if( position == 0){
            LoginFragment loginFragment = new LoginFragment();
            return loginFragment;
        }
        else if (position == 1){
            return new SignupFragment();
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "Login";
            default:
                return "Signup";
        }
    }
}
