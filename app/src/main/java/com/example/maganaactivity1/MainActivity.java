package com.example.maganaactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red, button_blue, button_green, button_yellow, button_orange, button_reset;
    View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_blue = (Button)findViewById(R.id.btn_blue);
        button_green = (Button)findViewById(R.id.btn_green);
        button_yellow = (Button)findViewById(R.id.btn_yellow);
        button_orange = (Button)findViewById(R.id.btn_orange);
        button_reset = (Button)findViewById(R.id.btn_reset);
        button_red = (Button)findViewById(R.id.btn_red);
        background_view = this.getWindow().getDecorView();

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_red.getText().equals("Red"))
                {
                    background_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this,"You have successfully changed the color to red",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_blue.getText().equals("Blue")) {
                    background_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to blue", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_green.getText().equals("Green")) {
                    background_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to green", Toast.LENGTH_LONG).show();
                }
            }
        });
        
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_yellow.getText().equals("Yellow"))
                {
                    background_view.setBackgroundResource(R.color.yellow);
                    Toast.makeText(MainActivity.this,"You have successfully changed the color to yellow",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_orange.getText().equals("Orange")) {
                    background_view.setBackgroundResource(R.color.orange);
                    Toast.makeText(MainActivity.this, "You have successfully changed the color to orange", Toast.LENGTH_LONG).show();
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_reset.getText().equals("Reset"))
                {
                    background_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this,"You have successfully changed the color to default",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

