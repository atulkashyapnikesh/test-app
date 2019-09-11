package com.example.currencyconvetor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Atul" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        EditText dollarAmount = (EditText)findViewById(R.id.textView);
        String dollars = dollarAmount.getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 71.72*doubleDollars;
        String toastText="="+doubleInr.toString()+"Rupee";

        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
    }
}
