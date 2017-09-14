package ru.savchenko.andrey.test999.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

/**
 * Created by Andrey on 13.09.2017.
 */

public class Prefs {
    public static boolean isTablet;

    public static void init(Context context){
        isTablet = isTablet(context);
    }

    private static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
