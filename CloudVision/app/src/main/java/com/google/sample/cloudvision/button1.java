package com.google.sample.cloudvision;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class button1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botton1);

        Button endButton = findViewById(R.id.button4);
        endButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }

}
