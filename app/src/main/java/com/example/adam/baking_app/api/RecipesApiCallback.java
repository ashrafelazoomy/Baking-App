package com.example.adam.baking_app.api;

/**
 * Created by Adam on 4/27/2018.
 */

public interface RecipesApiCallback<T> {
    void onResponse(T result);

    void onCancel();
}
