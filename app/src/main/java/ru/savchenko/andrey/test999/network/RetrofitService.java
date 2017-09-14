package ru.savchenko.andrey.test999.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Andrey on 12.09.2017.
 */

public interface RetrofitService {

    @GET("/list.php")
    Observable<List<String>>getImages();

}
