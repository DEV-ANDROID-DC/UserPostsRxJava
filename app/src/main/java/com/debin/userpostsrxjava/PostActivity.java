package com.debin.userpostsrxjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.debin.userpostsrxjava.adapter.PostAdapter;
import com.debin.userpostsrxjava.contract.PostContract;
import com.debin.userpostsrxjava.model.UserPost;
import com.debin.userpostsrxjava.presenter.PostPresenterImpl;
import com.debin.userpostsrxjava.repository.RepositoryImpl;

import java.util.List;

public class PostActivity extends AppCompatActivity implements PostContract.PostView {

    private PostContract.PostPresenter postPresenter;
    private RecyclerView rvPost;
    private ProgressBar progressBar;
    private PostAdapter postAdapter;
    private static final String TAG = "PostActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        initRecycleView();
        progressBar = findViewById(R.id.progressBar);
        postPresenter = new PostPresenterImpl(this,new RepositoryImpl());
        postPresenter.getPost();
    }

    @Override
    public void showPost(List<UserPost> posts) {
    postAdapter = new PostAdapter(posts);
    rvPost.setAdapter(postAdapter);
    postAdapter.notifyDataSetChanged();
    }

    @Override
    public void showProgress() {
     progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
     progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showError(Throwable throwable) {
        Log.i(TAG,"Error is ::" +throwable.getMessage());
        Toast.makeText(this, getString(R.string.error)+throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

    private void initRecycleView(){
        rvPost = findViewById(R.id.rv_post);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvPost.setLayoutManager(linearLayoutManager);
        rvPost.setItemAnimator(new DefaultItemAnimator());
    }
}
