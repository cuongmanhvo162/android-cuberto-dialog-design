package com.cuongmv162.cubertodialog.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cuongmv162.cubertodialog.R;
import com.cuongmv162.cubertodialog.adapter.holder.TVSeriesListViewHolder;
import com.cuongmv162.cubertodialog.data.TVSeriesData;

import java.util.List;

/**
 * Created by cuongvo on 5/16/17.
 */

public class TVSeriesListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<TVSeriesData> mList;

    public TVSeriesListAdapter(Context context, List<TVSeriesData> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        LayoutInflater inflaterMainCategory = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflaterMainCategory.inflate(R.layout.adapter_tvseries_list, parent, false);
        TVSeriesListViewHolder holder = new TVSeriesListViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TVSeriesData data = mList.get(position);

        TVSeriesListViewHolder viewHolder = (TVSeriesListViewHolder)holder;

        viewHolder.mTitle.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public TVSeriesData getItemAtPosition(int position){
        return mList.get(position);
    }
}
