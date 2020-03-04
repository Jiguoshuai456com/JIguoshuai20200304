package com.bw.jiguoshuai20200304.utiuls;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bw.jiguoshuai20200304.activity.App;

public class VolleyUtiuls {

    RequestQueue queue;

    private VolleyUtiuls() {
        this.queue = Volley.newRequestQueue(App.getApp());
        RequestQueue queue = this.queue;
    }
    private static class SingInstance{
        private static final VolleyUtiuls INBER=new VolleyUtiuls();
    }
    public static VolleyUtiuls getInstance(){
        return SingInstance.INBER;
    }
    public void doGet(String url, final ICallBack iCallBack){
        new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                iCallBack.onError(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }
    public interface ICallBack{
        void onSuccess(String json);
        void onError(String json);
    }
}
