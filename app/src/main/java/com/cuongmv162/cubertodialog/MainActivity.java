package com.cuongmv162.cubertodialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.cuongmv162.cubertodialog.adapter.TVSeriesListAdapter;
import com.cuongmv162.cubertodialog.data.TVSeriesData;
import com.cuongmv162.cubertodialog.dialog.CubertoDialog;
import com.cuongmv162.cubertodialog.util.DataUtil;
import com.cuongmv162.cubertodialog.util.RecycleViewOnItemTouchListener;
import com.cuongmv162.cubertodialog.util.RecycleViewUtil;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mList;
    private TVSeriesListAdapter mTvSeriesListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = (RecyclerView) findViewById(R.id.activity_main_list);
        mList.setLayoutManager(RecycleViewUtil.createVerticalLayoutManager(this));
        mList.addOnItemTouchListener(new RecycleViewOnItemTouchListener(this, new RecycleViewOnItemTouchListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, boolean pressReleased) {
                if (pressReleased) {
                    TVSeriesData tvSeriesData = mTvSeriesListAdapter.getItemAtPosition(position);

                    CubertoDialog cubertoDialog = new CubertoDialog();
                    cubertoDialog.show(getFragmentManager(), tvSeriesData.getTitle());
                }
            }
        }));
    }

    @Override
    protected void onStart() {
        super.onStart();

        displayTVSeriesList();
    }

    private void displayTVSeriesList() {
        mTvSeriesListAdapter = new TVSeriesListAdapter(this, DataUtil.getTVSeriesList(this));
        mList.setAdapter(mTvSeriesListAdapter);
        mTvSeriesListAdapter.notifyDataSetChanged();
    }

}
