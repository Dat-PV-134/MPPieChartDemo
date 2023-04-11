package com.rekoj134.countworkingtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dk.fjinc.flipperclocklibrary.CountDownClock;

public class TimeCountingActivity extends AppCompatActivity {
    CountDownClock clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_counting);

        clock = findViewById(R.id.countDownClock);

        clock.resetCountdownTimer();
    }
}