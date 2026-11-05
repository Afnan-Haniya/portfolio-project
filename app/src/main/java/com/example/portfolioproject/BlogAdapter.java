package com.example.portfolioproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.ViewHolder> {
    private final List<String> blogTitles;
    public BlogAdapter(List<String> blogTitles) {
        this.blogTitles = blogTitles;     }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blog, parent, false);
        return new ViewHolder(view);     }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvBlogTitle.setText(blogTitles.get(position));
    }
    @Override
    public int getItemCount() {
        return blogTitles.size();     }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvBlogTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBlogTitle = itemView.findViewById(R.id.tvBlogTitle);
        }
    } }