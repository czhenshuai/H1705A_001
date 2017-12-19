package com.jiyun.myapplication;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Brother Chen on 2017/12/18.
 */

public class Utils {
            private static Utils utils;
            private OkHttpClient okHttpClient;

            private Utils(){
                okHttpClient=new OkHttpClient();

            }
            public static synchronized Utils getInstance(){
                if (utils==null)utils=new Utils();
                return utils;
            }
            public void sendGet(String url, Callback callback){
                Request build = new Request.Builder().url(url).build();
                okHttpClient.newCall(build).enqueue(callback);
            }

}
