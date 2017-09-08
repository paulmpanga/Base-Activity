package co.generalmerchant.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by paulmpanga on 9/8/17.
 */

public class ActivitySignUp extends LinearLayout {

    public ActivitySignUp(Context context) {
        super(context);
        initialize(context);
    }

    public ActivitySignUp(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context) {
        inflate(context, R.layout.activity_sign_up, this);
    }
}
