package ru.savchenko.andrey.test999.activities.posts.presenter;

import ru.savchenko.andrey.test999.activities.posts.interactor.PostsInteractor;
import ru.savchenko.andrey.test999.activities.posts.interactor.PostsInteractorImpl;
import ru.savchenko.andrey.test999.activities.posts.view.PostsView;


/**
 * Created by Andrey on 14.09.2017.
 */

public class PostsPresenterImpl implements PostsPresenter {
    private PostsInteractor interactor;
    private PostsView view;

    public PostsPresenterImpl(PostsView view) {
        this.interactor = new PostsInteractorImpl();
        this.view = view;
    }

    @Override
    public void loadPosts() {
        interactor.loadPosts()
                .subscribe(recentContainer -> {
                    view.setAdapterData(recentContainer);
                });
    }
}
