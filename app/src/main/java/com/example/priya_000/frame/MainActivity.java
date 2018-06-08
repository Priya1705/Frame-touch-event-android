package com.example.priya_000.frame;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    ImageView img1;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.img1)
        {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }
        else
        {
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }
    }
}
