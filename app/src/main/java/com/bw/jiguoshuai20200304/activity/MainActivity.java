package com.bw.jiguoshuai20200304.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bw.jiguoshuai20200304.R;
import com.bw.jiguoshuai20200304.utiuls.VolleyUtiuls;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        String url="http://mobile.bwstudent.com/small/commodity/v1/findCommodityByKeyword";
        VolleyUtiuls.getInstance().doGet(url, new VolleyUtiuls.ICallBack() {
            @Override
            public void onSuccess(String json) {
                RecyclerView.LayoutManager layoutManager=new GridLayoutManager(MainActivity.this,2);
                rv.setLayoutManager(layoutManager);
            }

            @Override
            public void onError(String json) {

            }
        });
    }
}
