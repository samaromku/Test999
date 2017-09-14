package ru.savchenko.andrey.test999.activities.posts.interactor;


import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Andrey on 14.09.2017.
 */

public interface PostsInteractor {
    Observable<List<String>> loadPosts();
}
