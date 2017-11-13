package com.example.umar.listenquran.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Umar on 11/13/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.mViewHolder> {


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //############################################################################################//

    class mViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public mViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }

}
