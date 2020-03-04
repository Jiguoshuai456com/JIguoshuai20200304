package com.bw.jiguoshuai20200304.myVvew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

@SuppressLint("AppCompatCustomView")
public class CoustmView extends EditText {
    public CoustmView(Context context) {
        super(context);
    }

    public CoustmView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CoustmView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("NewApi")
    public CoustmView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
