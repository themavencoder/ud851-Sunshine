/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        weatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = {"Monday May 21, 2018 -20°C Foggy ",
                 "Tuesday May 22, 2018 -15°C Sunny ",
                "Wednesday May 23, 2018 -12°C Cool",
                "Thursday May 24, 2018 -5°C Lightning",
                "Friday May 25,2018 -16°C Sunny ",
                "Saturday May 26, 2018 -11°C Cool",
                "Sunday May 27, 2018 -12°C Sunny",
                "Monday May 28, 2018 -13°C Rainy",
                "Tuesday May 29, 2018 -14°C Snowy",
                "Wednesday May 30, 2018 -15°C Dry",
                "Thursday May 31, 2018 -16°C Foggy",
                "Friday June 1, 2018 -17°C Smoky",
                "Saturday June 2, 2018 -18°C Dusty",
                "Sunday June 3, 2018 -19°C Cool",
                "Monday June 4, 2018 -20°C Cool"
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for(String fakeweatherdata : fakeWeatherData) {
            weatherTextView.append(fakeweatherdata + "\n\n\n\n");
        }
    }
}