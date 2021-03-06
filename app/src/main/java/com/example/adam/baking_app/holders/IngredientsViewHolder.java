package com.example.adam.baking_app.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.adam.baking_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Adam on 4/27/2018.
 */

public class IngredientsViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.ingredients_text)
    public TextView mTvIngredients;

    public IngredientsViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);

    }

}