package com.example.mysdk;


import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class FetchData{

    public static void s(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        Object id = getContentReseiver();
        Log.i("obj",id.toString());
        Toast.makeText(c, id.toString(), Toast.LENGTH_SHORT).show();
    }

    public static Object getContentReseiver() {
        @SuppressLint("HardwareIds") String id = Settings.Secure.getString((ContentResolver) getContentReseiver(), Settings.Secure.ANDROID_ID);
        return id;
    }
}
