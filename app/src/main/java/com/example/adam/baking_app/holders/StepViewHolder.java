package com.example.adam.baking_app.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.adam.baking_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Adam on 4/28/2018.
 */

public class StepViewHolder  extends RecyclerView.ViewHolder {
    @BindView(R.id.step_order_text)
    public TextView mTvStepOrder;

    @BindView(R.id.step_name_tv)
    public TextView mTvStepName;

    public StepViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

}

