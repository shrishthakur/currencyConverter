package com.example.shrish.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    //EditText ed = (EditText) findViewById(R.id.editText2);


    TextView tv ;


    public void clickFunction(View view){
        Log.i("amount",tv.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text1);
    }
}
