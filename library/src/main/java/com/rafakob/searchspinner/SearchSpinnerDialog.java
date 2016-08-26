package com.rafakob.searchspinner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SearchSpinnerDialog extends DialogFragment {

    public SearchSpinnerDialog() {
    }

    public static SearchSpinnerDialog newInstance() {
        Bundle args = new Bundle();
        SearchSpinnerDialog fragment = new SearchSpinnerDialog();
        fragment.setArguments(args);
        fragment.setStyle(DialogFragment.STYLE_NO_TITLE, fragment.getTheme());
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_search_spinner, container);
        return view;
    }


}
