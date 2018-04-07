package com.example.android_user.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstnumber;
    private EditText secondnumber;
    private Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
    }

    private void InitView() {


        firstnumber = findViewById(R.id.firstnumber);
        secondnumber = findViewById(R.id.secondnumber);
        sum = findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a=0,b=0,c;

                a = Integer.parseInt(firstnumber.getText().toString());
                b = Integer.parseInt(secondnumber.getText().toString());
                c = a + b;

                Toast.makeText(MainActivity.this, "the answer is fuckin " + c , Toast.LENGTH_LONG).show();
            }
        });






    }
}
