package ru.savchenko.andrey.test999.activities.posts.interactor;


import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ru.savchenko.andrey.test999.network.RequestManager;


/**
 * Created by Andrey on 14.09.2017.
 */

public class PostsInteractorImpl implements PostsInteractor {

    @Override
    public Observable<List<String>> loadPosts() {
        return RequestManager.getRetrofitService()
                .getImages()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
