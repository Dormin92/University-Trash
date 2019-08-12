package com.example.sh18670.lightsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LightsActivity extends AppCompatActivity
{
    static int n = 7;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(new LightsView(this, new LightsModel(n)));
    }
}
