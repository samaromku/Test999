package ru.savchenko.andrey.test999.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;

import java.util.List;

import ru.savchenko.andrey.test999.R;
import ru.savchenko.andrey.test999.activities.posts.presenter.PostsPresenter;
import ru.savchenko.andrey.test999.activities.posts.presenter.PostsPresenterImpl;
import ru.savchenko.andrey.test999.activities.posts.view.PostsView;
import ru.savchenko.andrey.test999.adapters.ImageAdapter;
import ru.savchenko.andrey.test999.storage.Prefs;

import static android.content.ContentValues.TAG;

/**
 * Created by Andrey on 14.09.2017.
 */

public class AllPostsActivity extends AppCompatActivity implements PostsView {
    private PostsPresenter presenter;
    private ImageAdapter adapter;
    private GridView gridview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = (GridView) findViewById(R.id.gridPosts);
        presenter = new PostsPresenterImpl(this);
        presenter.loadPosts();
        adapter = new ImageAdapter(this);
        if(Prefs.isTablet) {
            gridview.setNumColumns(3);
        }else {
            gridview.setNumColumns(2);
        }

        gridview.setOnItemClickListener((parent, v, position, id) -> {
            Log.i(TAG, "onViewCreated: " + position);
        });
    }

    @Override
    public void setAdapterData(List<String> list) {
        Log.i(TAG, "setAdapterData: " + list.size());
        adapter.setImages(list);
        gridview.setAdapter(adapter);
    }
}
