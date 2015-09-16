package com.horton.www.toolbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Horton on 2015/9/15.
 */
public class ListFragment extends Fragment {
    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    private RecyclerView mRecyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (L) Log.i(CLASSNAME, "onCreateView");
        mRecyclerView = (RecyclerView)inflater.inflate(R.layout.list_fragment, container, false);

        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Notification that the containing activiy and its View hierarchy exist
        Log.i(CLASSNAME, "onActivityCreated");

        // 设置RecyclerView的展示方式为LinearLayout，还可以选GridLayoutManager，StaggeredGridLayoutManager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
    }
}
