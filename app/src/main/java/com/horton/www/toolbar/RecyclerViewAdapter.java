package com.horton.www.toolbar;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Horton on 2015/9/15.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;

    // String for logging the class name
    private final String CLASSNAME = getClass().getSimpleName();

    //Turn logging on or off
    private final boolean L = true;

    public RecyclerViewAdapter(Context mContext){
        this.mContext = mContext;
    }

    // 创建新View，被LayoutManager所调用
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (L) Log.i(CLASSNAME, "onCreateViewHolder");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card_main, parent, false);
        return new ViewHolder(view);
    }

    // 将数据与界面进行绑定的操作
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (L) Log.i(CLASSNAME, "onCreateViewHolder");

        final View view = holder.mView;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * 待补充
                 */
                Toast.makeText(mContext, "点击成功！", Toast.LENGTH_SHORT).show();
            }
        });

    }

    // 获取数据的数量
    @Override
    public int getItemCount() {
        return 10;
    }

    // 自定义的ViewHolder，持有每个Item的的所有界面元素
    public class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

/*
        // String for logging the class name
        private final String CLASSNAME = getClass().getSimpleName();

        //Turn logging on or off
        private final boolean L = true;
*/

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

//            if (L) Log.i(CLASSNAME, "ViewHolder");
        }
    }
}
