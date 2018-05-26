package com.iamlj.android.android_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        final TextView textView = findViewById(R.id.text1);
        textView.setText("Hello World");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("我被点击了")) {
                    textView.setText("Hello World");
                } else {
                    textView.setText("我被点击了");
                }
            }
        });
    }
}
