package com.example.ques_solve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, sid;
    String st1, st2, last;
    int count = 0, res;
    public static String l = "com.example.ques_solve";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        sid = findViewById(R.id.sid);
    }

    public void handleCount(View view) {
        count = count + 1;
    }

    public void nextHandle(View view) {
        Intent next = new Intent(MainActivity.this, MainActivity2.class);
        st1 = name.getText().toString();
        st2 = sid.getText().toString();
        last = String.valueOf(st2.charAt(st2.length() -1));
        int ld = Integer.parseInt(last);
        res = count % ld;
        next.putExtra(l, res);
        next.putExtra("name", st1);
        next.putExtra("sid", st2);
        startActivity(next);
    }
}