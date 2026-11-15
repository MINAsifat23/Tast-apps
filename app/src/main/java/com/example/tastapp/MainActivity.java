package com.example.tastapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        final TextView text = new TextView(this);
        text.setText("Hello! App is working");
        text.setTextSize(22);

        Button button = new Button(this);
        button.setText("Tap me");
        button.setOnClickListener(v -> text.setText("Button works!"));

        layout.addView(text);
        layout.addView(button);
        setContentView(layout);
    }
}
