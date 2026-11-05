package com.example.portfolioproject;

import android.os.Bundle; import androidx.appcompat.app.AppCompatActivity; import androidx.recyclerview.widget.LinearLayoutManager; import androidx.recyclerview.widget.RecyclerView; import java.util.Arrays; import java.util.List;  public class BlogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        RecyclerView rvBlog = findViewById(R.id.rvBlog);
        rvBlog.setLayoutManager(new LinearLayoutManager(this));
        List<String> posts = Arrays.asList(
                "1. Getting Started with Git & GitHub",
                "2. Mastering GitFlow in Android Studio",
                "3. Resolving Merge Conflicts Cleanly"         );
        rvBlog.setAdapter(new BlogAdapter(posts));     } }