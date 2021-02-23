package ru.demesmemes.zinasimuliator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static ru.demesmemes.zinasimuliator.R.id.home_button;
import static ru.demesmemes.zinasimuliator.R.id.shop_Button;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextSwap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    public void onMyOnClick(View view) {
        Intent school_button = new Intent(MainActivity.this, School.class);
        startActivity(school_button);

    }

    public void onMyOnMyClick(View view) {
        Intent shop_button = new Intent(MainActivity.this, Shop.class);
        startActivity(shop_button);
    }

    public void onMyClicks(View view) {

        Intent Home_button = new Intent(MainActivity.this, Home.class);
        startActivity(Home_button);
    }


}


