package com.debin.userpostsrxjava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.debin.userpostsrxjava.R;
import com.debin.userpostsrxjava.model.UserPost;

import java.util.List;
import java.util.Observable;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private List<UserPost> userPosts;

    public PostAdapter(List<UserPost> userPosts) {
        this.userPosts = userPosts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       holder.bind(userPosts.get(position));
    }

    @Override
    public int getItemCount() {
        return userPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvRendered;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvRendered = itemView.findViewById(R.id.tv_body);
        }

        public void bind(UserPost userPost) {
            tvTitle.setText(userPost.getTitle().getRendered());
            tvRendered.setText(userPost.getExcerpt().getRendered());

        }
    }
}
