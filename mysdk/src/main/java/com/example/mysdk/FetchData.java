package com.example.mysdk;


import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.provider.Settings;
import android.util.Log;

public class FetchData{

    public static void main(){

        Object id = getContentReseiver();
        Log.i("obj",id.toString());

    }

    public static Object getContentReseiver() {
        @SuppressLint("HardwareIds") String id = Settings.Secure.getString((ContentResolver) getContentReseiver(), Settings.Secure.ANDROID_ID);
        return id;
    }
}
