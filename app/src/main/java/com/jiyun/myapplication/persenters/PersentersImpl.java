package com.jiyun.myapplication.persenters;

import com.jiyun.myapplication.models.CallBackers;
import com.jiyun.myapplication.models.ModelsImpl;
import com.jiyun.myapplication.models.ModelsInf;
import com.jiyun.myapplication.views.ViewInf;

/**
 * Created by Brother Chen on 2017/12/18.
 */

public class PersentersImpl implements PersnetersInf ,CallBackers{
    private ModelsInf modelsInf;
    private ViewInf viewInf;

    public PersentersImpl (ViewInf viewInf){
        this.modelsInf=new ModelsImpl();
        this.viewInf=viewInf;
    }
    @Override
    public void ModelsToPersenters() {
        modelsInf.sendCallbackers(this);
    }

    @Override
    public void sendData(String string) {
        viewInf.showData(string);
    }
}
