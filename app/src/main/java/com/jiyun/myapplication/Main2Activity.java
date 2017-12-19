package com.jiyun.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.jiyun.myapplication.persenters.PersentersImpl;
import com.jiyun.myapplication.persenters.PersnetersInf;
import com.jiyun.myapplication.views.ViewInf;

public class Main2Activity extends AppCompatActivity implements ViewInf{

    private RecyclerView rv_RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        PersnetersInf persenters = new PersentersImpl(this);
        persenters.ModelsToPersenters();
    }

    private void initView() {
        rv_RecyclerView = (RecyclerView) findViewById(R.id.rv_RecyclerView);
    }

    @Override
    public void showData(String string) {
        Gson gson = new Gson();
        Beans beans = gson.fromJson(string, Beans.class);
        //beans.123

    }
}
