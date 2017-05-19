package com.cuongmv162.cubertodialog.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cuongmv162.cubertodialog.R;

/**
 * Created by cuongvo on 5/16/17.
 */

public class TVSeriesListViewHolder extends RecyclerView.ViewHolder {
    public ImageView mImage;
    public TextView mTitle;
    public TextView mDescription;

    public TVSeriesListViewHolder(View itemView) {
        super(itemView);

        mImage = (ImageView) itemView.findViewById(R.id.adapter_tvseries_image);
        mTitle = (TextView)itemView.findViewById(R.id.adapter_tvseries_title);
        mDescription = (TextView)itemView.findViewById(R.id.adapter_tvseries_description);

    }
}
