package com.example.onclicklistener;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one, two, three;
        one = findViewById(R.id.first);
        two = findViewById(R.id.second);
        three = findViewById(R.id.third);

        //First way
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "First", Toast.LENGTH_SHORT).show();
            }
        });
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);


    }

    //Second way: android:onClick="function_name". Do this in XML. Then implement the function in here.
    public void thirdFun(View view) {
        Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show();
    }
    public void secondFun(View view){
        Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
    }

    //Third way
    //implement/ override the onClick method the following way.
    @Override
    public void onClick(View view) {
        int v = view.getId();
        if(v==R.id.first) Toast.makeText(this, "First", Toast.LENGTH_SHORT).show();
        else if(v==R.id.second) Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();
        else if(v==R.id.third) Toast.makeText(this, "Third", Toast.LENGTH_SHORT).show();

    }
}
