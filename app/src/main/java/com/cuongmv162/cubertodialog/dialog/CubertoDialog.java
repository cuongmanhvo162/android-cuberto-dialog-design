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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.cuongmv162.cubertodialog.R;

/**
 * Created by cuongmv162 on 2/1/2017.
 */

public class CubertoDialog extends DialogFragment {
    private int mCoverImageId;

    private ImageView mCover;
    private View mView;

    Animation animScaleOut;
    private Animation fadeIn;

    public CubertoDialog() {
    }

    public void create(int cover) {
        this.mCoverImageId = cover;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        mView = inflater.inflate(R.layout.dialog_cuberto_layout, null);

        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mCover = (ImageView) mView.findViewById(R.id.dialog_cuberto_cover);
        mCover.setClipToOutline(true);
        mCover.setImageResource(mCoverImageId);

        animScaleOut = AnimationUtils.loadAnimation(getActivity(), R.anim.scale_out);
        fadeIn = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        mView.startAnimation(animScaleOut);

        animScaleOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                mCover.startAnimation(fadeIn);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        return mView;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
