package ru.savchenko.andrey.test999;

import android.app.Application;

import ru.savchenko.andrey.test999.network.RequestManager;
import ru.savchenko.andrey.test999.storage.Prefs;


/**
 * Created by Andrey on 13.09.2017.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RequestManager.init();
        Prefs.init(this);
    }
}
