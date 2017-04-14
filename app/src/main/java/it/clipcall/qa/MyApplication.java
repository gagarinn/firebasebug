package it.clipcall.qa;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by Android on 14.04.2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        FirebaseApp.initializeApp(this);
    }
}
