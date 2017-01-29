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
package com.example.android.miwok.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.miwok.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView forroTextView = (TextView) findViewById(R.id.forroTextView);
        forroTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forroIntent = new Intent(v.getContext(), ForroActivity.class);
                startActivity(forroIntent);
            }
        });

        TextView bluesTextView = (TextView) findViewById(R.id.bluesTextView);
        bluesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bluesIntent = new Intent(v.getContext(), BluesActivity.class);
                startActivity(bluesIntent);
            }
        });

        TextView bossaNovaTextView = (TextView) findViewById(R.id.bossaNovaTextView);
        bossaNovaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bossaNovaIntent = new Intent(v.getContext(), BossaNovaActivity.class);
                startActivity(bossaNovaIntent);
            }
        });

        TextView jazzTextView = (TextView) findViewById(R.id.jazzTextView);
        jazzTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jazzIntent = new Intent(v.getContext(), JazzActivity.class);
                startActivity(jazzIntent);
            }
        });
    }
}
