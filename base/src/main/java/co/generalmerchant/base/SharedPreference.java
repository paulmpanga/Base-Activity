package co.generalmerchant.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by paulmpanga on 9/3/17.
 */

public class SharedPreference {

    public static String getValue(String key, String defaultStr, Context activity) {

        return PreferenceManager.getDefaultSharedPreferences(activity).getString(key, defaultStr);

    }

    public static void setValue(String key, String value, Context activity) {

        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(activity).edit();

        editor.putString(key, value);

        //editor.commit();
        editor.apply();

    }

    public static void clearSharedPreference(Context activity) {

        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(activity).edit();

        editor.clear();

        //editor.commit();
        editor.apply();
    }

}
