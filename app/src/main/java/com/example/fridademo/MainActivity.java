package com.example.fridademo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String greeting = TestFunctions.greet("Sky");
        int result = TestFunctions.add(2, 3);
        TextView view = new TextView(this);
        view.setText(greeting + "\n2 + 3 = " + result);
        view.setTextSize(24);
        view.setPadding(32, 32, 32, 32);
        setContentView(view);
    }
}
