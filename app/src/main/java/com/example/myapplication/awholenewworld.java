package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class awholenewworld extends AppCompatActivity {

    private ImageButton C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awholenewworld);

        C1 = (ImageButton) findViewById(R.id.imageButton29);
        C1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(awholenewworld.this,activity_introduce_store.class);
                startActivity(intent);

            }
        });
    }
}
