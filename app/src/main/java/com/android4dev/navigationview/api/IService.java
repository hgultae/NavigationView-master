package com.android4dev.navigationview.api;

import com.android4dev.navigationview.constants.Constants;
import com.android4dev.navigationview.model.ApiData;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Tae-3 on 08/01/2016.
 */
public interface IService {

    @GET(Constants.RESTUARANTS)
    public void getRestuarants(Callback<ApiData> response);
}
