package info.adnansharif.splitit.utils;

import android.content.Context;
import android.content.SharedPreferences;

import info.adnansharif.splitit.extras.AppKeys;

public class UserPreferences {

    public static SharedPreferences getUserPreference(Context context){
        return context.getSharedPreferences(
                AppKeys.SHARED_PREF_KEY, Context.MODE_PRIVATE);
    }

}
