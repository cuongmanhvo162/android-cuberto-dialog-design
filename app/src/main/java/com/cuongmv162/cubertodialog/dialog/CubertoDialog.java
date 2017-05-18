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
import android.widget.ImageView;

import com.cuongmv162.cubertodialog.R;
import com.cuongmv162.cubertodialog.util.ImageUtil;

/**
 * Created by cuongmv162 on 2/1/2017.
 */

public class CubertoDialog extends DialogFragment {
    private ImageView mCover;
    private View mView;

    public CubertoDialog() {

    }

    public void create() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.PauseDialog);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        mView = inflater.inflate(R.layout.dialog_cuberto_layout, null);

        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mCover = (ImageView)mView.findViewById(R.id.dialog_cuberto_cover);
        mCover.setImageDrawable(ImageUtil.getRoundedImage(getActivity(), R.drawable.pic));

        return mView;
    }
}
