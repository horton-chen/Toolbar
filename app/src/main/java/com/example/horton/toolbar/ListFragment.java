package com.example.horton.toolbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (L) Log.i(CLASSNAME, "onCreateView");
        mRecyclerView =
                (RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(CLASSNAME, "onActivityCreated");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        Log.i(CLASSNAME, "onActivityCreated after Manager");
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
        Log.i(CLASSNAME, "onActivityCreated after setAdapter");
    }
}
