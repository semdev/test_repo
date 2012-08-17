package com.example.calcval;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StringBuffer buf = new StringBuffer();
        TextView tv = new TextView(this);

        int a = 10;
        int b = 2;

        int val = addVals(a,b);
        buf.append("a+b=" + String.valueOf(val));


        tv.setText( buf.toString());
        setContentView(tv);
    }

    public native int addVals(int a, int b);

    static {
    	System.loadLibrary("calcvals");
    }

}

