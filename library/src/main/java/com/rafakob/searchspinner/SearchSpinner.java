package com.rafakob.searchspinner;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class SearchSpinner extends AppCompatSpinner {
    private static final String TAG = "SearchSpinner";
    private SearchSpinnerDialog searchSpinnerDialog;

    public SearchSpinner(Context context) {
        super(context);
        init(context, null, 0);
    }

    public SearchSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public SearchSpinner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            Log.d(TAG, "onTouch");
            showDialog();
        }
        return true;
    }


    private void showDialog() {
        if (searchSpinnerDialog == null) {
            searchSpinnerDialog = SearchSpinnerDialog.newInstance();
        }
        searchSpinnerDialog.show(getFragmentManager(), TAG);
    }

    private FragmentManager getFragmentManager() {
        return ((FragmentActivity) getContext()).getSupportFragmentManager();
    }
}
