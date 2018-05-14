package com.example.adam.baking_app.holders;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.adam.baking_app.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Adam on 4/27/2018.
 */

public class RecipeViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.recipe_name_tv)
    public TextView mTvRecipeName;

    @BindView(R.id.servings_tv)
    public TextView mTvServings;

    @BindView(R.id.recipe_image)
    public AppCompatImageView mIvRecipe;

    public RecipeViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

}
