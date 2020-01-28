package com.example.ex003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        count =0;
    }


    public void counter(View view) {
        count++;
        btn.setText("This is a click number:"+count);
        if(count==6) {
            count=0;
            btn.setText("Enough to click.Go to new start!"+count);
        }
    }
}
