package com.example.ques_solve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    String st1, st2;
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.tv);

        Intent i = getIntent();
        st1 = i.getExtras().getString("name");
        st2 = i.getExtras().getString("sid");
        l = i.getIntExtra(MainActivity.l, 0);
        tv.setText(st1 + "  " + st2 + "  "+ l + " ");
    }

    public void info(View view) {
        Toast.makeText(getApplicationContext(),"name : "+st1+", id : "+st2+", "+l,Toast.LENGTH_SHORT).show();
    }
}