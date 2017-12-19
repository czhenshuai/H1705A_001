package com.jiyun.myapplication.models;

import com.jiyun.myapplication.Utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Brother Chen on 2017/12/18.
 */

public class ModelsImpl implements ModelsInf {

    private String string;

    @Override
    public void sendCallbackers(final CallBackers callBackers) {
        Utils.getInstance().sendGet("", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                string = response.body().string();
                callBackers.sendData(string);
            }
        });
    }
}
