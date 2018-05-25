package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDisplayWeatherForecast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDisplayWeatherForecast = (TextView)findViewById(R.id.display_text);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intent  = getIntent();
        if (intent.resolveActivity(getPackageManager()) != null) {
            if(intent.hasExtra(intent.EXTRA_TEXT)) {
             String extraString = intent.getStringExtra(intent.EXTRA_TEXT);
                mDisplayWeatherForecast.setText(extraString);

            }
        }
    }
}