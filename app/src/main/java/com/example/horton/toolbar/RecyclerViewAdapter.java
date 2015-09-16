package com.example.horton.toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;

    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (L) Log.i(CLASSNAME, "onCreateViewHolder");
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card_main, parent, false);
        return new ViewHolder(view);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.ViewHolder holder, int position) {
        final View view = holder.mView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationZ", 20, 0);
                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
//                        mContext.startActivity(new Intent(mContext, DetailActivity.class));
                    }
                });
                animator.start();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
        }
    }
}
