package com.example.dating_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText in1=(EditText) findViewById(R.id.editText1);


                Intent myIntent = new Intent(MainActivity.this,Main2Activity.class);
                myIntent.putExtra("NAME",Integer.parseInt(in1.getText().toString()));

                startActivity(myIntent);

            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText in1=(EditText) findViewById(R.id.editText2);

                Intent myIntent = new Intent(MainActivity.this,Main3Activity.class);
                myIntent.putExtra("NAME",in1.getText().toString());

                startActivity(myIntent);

            }
        });





    }

}
