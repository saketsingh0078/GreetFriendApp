package com.example.greetfriendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    int time ;
    Calendar calendar=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editView);
        button=findViewById(R.id.button);
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String test = sdf.format(calendar.getTime());
         time = Integer.parseInt(test);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name= editText.getText().toString();
                if(time>6 && time<12){
                    textView.setText("GOOD MORNING " + name);
                }
                else if(time>12 && time < 17){
                    textView.setText("GOOD AFTERNOON " + name);
                }
                else if(time>17 && time < 21){
                    textView.setText("GOOD EVENING " + name);
                }
                else{
                    textView.setText("GOOD NIGHT " + name);
                }
            }
        });

    }
}
