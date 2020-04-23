package com.debin.userpostsrxjava.network;

import com.debin.userpostsrxjava.common.Constant;
import com.debin.userpostsrxjava.model.UserPost;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PostClient {


    @GET(Constant.END_POINT)
    Observable<List<UserPost>> getUserPost(@Path("version") String version);
}
