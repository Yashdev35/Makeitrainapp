package com.example.makeitrainapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import com.google.android.material.snackbar.Snackbar;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;

public class MainActivity extends AppCompatActivity {
    private Button makeItRain;
    private Button showInfo;
    private TextView moneyValue;
    private TextView theInfo;
    private ConstraintLayout background;
    private Switch themeSwitch;
    private int moneymaker = 0;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeItRain = findViewById(R.id.Makeitrain);
        showInfo = findViewById(R.id.Showinfo);
        moneyValue = findViewById(R.id.moneyValue);
//        makeItRain.setOnClickListener(view -> Log.d(getString(R.string.main_activity), "onClick: Make It rain my boy"));
//        showInfo.setOnClickListener(view -> Log.d("i show info ", "onClick: i am showing info"));
    }

    public void rainingmethod(View view) {
        NumberFormat noformat = NumberFormat.getCurrencyInstance();

        moneymaker += 10000;
        moneyValue.setText(String.valueOf(noformat.format(moneymaker)));
        switch(moneymaker){
            case 100000 :
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mycolor1));
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            case 200000 :
                moneyValue.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            case 300000 :
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mycolor4));
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            case 400000 :
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mycolor5));
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            case 450000 :
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mycolor2));
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            case 500000 :
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mycolor6));
                Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
                break;
            default:
                moneyValue.setTextColor(Color.WHITE);
        }
        if(moneymaker > 1000000){
            moneyValue.setTextColor(Color.RED);
            Toast.makeText(MainActivity.this, R.string.encouraging_message, Toast.LENGTH_SHORT).show();
        }

        //Log.d("rainingh method tag", "rainingmethod: making it rain boy");
    }
    public void showinginfo(View view){

        Snackbar.make(moneyValue,R.string.imp_message,Snackbar.LENGTH_LONG)
                .setAction("More knowledge", view1 -> {
                    Toast.makeText(MainActivity.this, R.string.imp_message2, Toast.LENGTH_LONG).show();
                })
                .show();
    }


}