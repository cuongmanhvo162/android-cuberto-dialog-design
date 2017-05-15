package com.cuongmv162.cubertodialog.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


/**
 * Created by cuongvo on 8/2/16.
 */
public class RecycleViewOnItemTouchListener implements RecyclerView.OnItemTouchListener {
    private int mChildViewId = 0;
    private Context mContext;

    private OnItemClickListener mListener;
    private GestureDetector mGestureDetector;

    public interface OnItemClickListener {
        void onItemClick(View view, int position, boolean pressReleased);

    }

    public RecycleViewOnItemTouchListener(Context context, OnItemClickListener listener) {
        this.mContext = context;

        mListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    public RecycleViewOnItemTouchListener(Context context, OnItemClickListener listener, int childViewId) {
        this.mContext = context;
        this.mChildViewId = childViewId;

        mListener = listener;
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(final RecyclerView view, MotionEvent e) {
        final View childView = view.findChildViewUnder(e.getX(), e.getY());

        if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
            childView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            mListener.onItemClick(childView, view.getChildAdapterPosition(childView), false);
                            break;

                        case MotionEvent.ACTION_UP:
                            mListener.onItemClick(childView, view.getChildAdapterPosition(childView), true);

                        case MotionEvent.ACTION_CANCEL:
                            mListener.onItemClick(childView, view.getChildAdapterPosition(childView), false);
                            break;

                        case MotionEvent.ACTION_BUTTON_RELEASE:

                            break;
                    }
                    return true;
                }
            });
        }

        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
