package com.cuongmv162.cubertodialog.util;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by cuongvo on 5/14/17.
 */

public class RecycleViewUtil {

    public static RecyclerView.LayoutManager createVerticalLayoutManager(Context context) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(context
                , LinearLayoutManager.VERTICAL
                , false);
        return layoutManager;
    }

    public static RecyclerView.LayoutManager createHorizontalLayoutManager(Context context) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(context
                , LinearLayoutManager.HORIZONTAL
                , false);
        return layoutManager;
    }
}
