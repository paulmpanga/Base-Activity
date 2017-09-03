package co.generalmerchant.base;

import android.app.ProgressDialog;
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

}
