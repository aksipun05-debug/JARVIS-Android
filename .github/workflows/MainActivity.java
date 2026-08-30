package com.jarvis.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("JARVIS");
        title.setTextColor(Color.WHITE);
        title.setTextSize(42);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("AI Assistant Online\n\nTap to start");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(status);

        setContentView(layout);
    }
}
