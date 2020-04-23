package com.debin.userpostsrxjava.presenter;

import com.debin.userpostsrxjava.contract.PostContract;
import com.debin.userpostsrxjava.model.UserPost;
import com.debin.userpostsrxjava.repository.Repository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class PostPresenterImpl implements PostContract.PostPresenter {

    private PostContract.PostView postView;
    private Repository repository;
    private List<String> stringList = new ArrayList<>();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();


    public PostPresenterImpl(PostContract.PostView postView, Repository repository) {
        this.postView = postView;
        this.repository = repository;
    }

    @Override
    public void getPost() {
        postView.showProgress();
         compositeDisposable.add(
             repository.getUserPost()
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                     .subscribe(userPostList -> {
                         postView.hideProgress();
                         postView.showPost(userPostList);
                     }, throwable -> {
                         postView.hideProgress();
                         postView.showError(throwable);
                     })
         );
    }

    @Override
    public void detachView() {
     postView = null;
     compositeDisposable.clear();
    }

    private void handleSuccess(List<UserPost> userPostList) {
        postView.hideProgress();
     postView.showPost(userPostList);
    }

    private void handleError(Throwable t) {
        postView.hideProgress();
      postView.showError(t);
    }
}
