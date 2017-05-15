package com.cuongmv162.cubertodialog.dialog;

import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.cuongmv162.cubertodialog.R;

/**
 * Created by cuongmv162 on 2/1/2017.
 */

public class CubertoDialog extends DialogFragment {
    private View mView;

    public CubertoDialog() {

    }

    public void create() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        mView = inflater.inflate(R.layout.dialog_cuberto_layout, null);

        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        return mView;
    }
}
