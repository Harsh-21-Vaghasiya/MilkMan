package com.example.milkman.GLOBAL;


import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

import java.util.Locale;

public class Gloabal_details {
//    public static String IP = "192.168.62.67";
    public static String IP = "192.168.1.13";
    public static String PORT = "80";
//    public static String PORT = "8080";

    public void change_language(String language, Context context){
        try {
            Locale l = new Locale(language);
            Locale.setDefault(l);
            Configuration config = new Configuration();
            config.locale = l;
            context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());
//        context.finish();
//        context.startActivity(context.getIntent());
        }catch (Exception e){
            Log.e("errorr","error in changing lang in global class as "+e.getMessage() );
        }
    }
}
