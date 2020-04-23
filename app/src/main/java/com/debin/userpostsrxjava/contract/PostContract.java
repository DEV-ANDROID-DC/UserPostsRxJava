package com.debin.userpostsrxjava.contract;

import com.debin.userpostsrxjava.model.UserPost;

import java.util.List;

public interface PostContract {

    interface PostView{
        void showPost(List<UserPost> posts);
        void showProgress();
        void hideProgress();
        void showError(Throwable throwable);
    }

    interface PostPresenter{
        void getPost();
        void detachView();
    }
}
