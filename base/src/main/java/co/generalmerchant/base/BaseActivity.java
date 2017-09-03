package co.generalmerchant.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by paulmpanga on 9/3/17.
 */

public class BaseActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;
    private AlertDialog.Builder mAlertDialog;
    private SharedPreference sharedPreference = new SharedPreference();

    public void showProgressDialog(String message) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            //progredd disloag is not cancelleable on click outside
            mProgressDialog.setCancelable(false);
            mProgressDialog.setMessage(message);
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    public void showAlertDialog(String title, String message) {
        if (mAlertDialog == null) {
            mAlertDialog = new AlertDialog.Builder(this);
            mAlertDialog.setTitle(title);
            mAlertDialog.setMessage(message);
            //this cancels on click outside
            mAlertDialog.setCancelable(true);
        }
        mAlertDialog.show();
    }

    //this is temporary placement
    public class SharedPreference {

        public  String getValue(String key, String defaultStr, Context activity) {

            return PreferenceManager.getDefaultSharedPreferences(activity).getString(key, defaultStr);

        }

        public  void setValue(String key, String value, Context activity) {

            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(activity).edit();

            editor.putString(key, value);

            //editor.commit();
            editor.apply();

        }

        public void clearSharedPreference(Context activity) {

            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(activity).edit();

            editor.clear();

            //editor.commit();
            editor.apply();
        }

    }


}
