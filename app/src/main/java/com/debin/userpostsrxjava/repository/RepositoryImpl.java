package com.debin.userpostsrxjava.repository;

import com.debin.userpostsrxjava.model.UserPost;
import com.debin.userpostsrxjava.network.PostClient;
import com.debin.userpostsrxjava.network.RetrofitInstance;

import java.util.List;

import io.reactivex.Observable;

public class RepositoryImpl implements Repository {

    private PostClient postClient;

    public RepositoryImpl() {
        postClient = RetrofitInstance.getPostClient();
    }


    @Override
    public Observable<List<UserPost>> getUserPost() {
        return postClient.getUserPost("v2");
    }
}
