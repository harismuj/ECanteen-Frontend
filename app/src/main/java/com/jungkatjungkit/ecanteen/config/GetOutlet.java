package com.jungkatjungkit.ecanteen.config;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetOutlet {
    @GET("all")
    Call<List<OutletData>> getData();
}
