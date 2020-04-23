package com.debin.userpostsrxjava.repository;

import com.debin.userpostsrxjava.model.UserPost;

import java.util.List;

import io.reactivex.Observable;

public interface Repository {

    Observable<List<UserPost>> getUserPost();
}
