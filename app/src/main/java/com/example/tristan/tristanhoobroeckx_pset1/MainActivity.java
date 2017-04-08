package com.example.tristan.tristanhoobroeckx_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View mImageViewArms;
    private View mImageViewBody;
    private View mImageViewEars;
    private View mImageViewEyebrows;
    private View mImageViewEyes;
    private View mImageViewGlasses;
    private View mImageViewHat;
    private View mImageViewMouth;
    private View mImageViewMustache;
    private View mImageViewNose;
    private View mImageViewShoes;
    private String State;
    private static final String STATE_KEY = "savestate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            State = savedInstanceState.getString(STATE_KEY);
        }
        setContentView(R.layout.activity_main);

        mImageViewArms = (View) findViewById(R.id.arms);
        mImageViewBody = (View) findViewById(R.id.body);
        mImageViewEars = (View) findViewById(R.id.ears);
        mImageViewEyebrows = (View) findViewById(R.id.eyebrows);
        mImageViewEyes = (View) findViewById(R.id.eyes);
        mImageViewGlasses = (View) findViewById(R.id.glasses);
        mImageViewHat = (View) findViewById(R.id.hat);
        mImageViewMouth = (View) findViewById(R.id.mouth);
        mImageViewMustache = (View) findViewById(R.id.mustache);
        mImageViewNose = (View) findViewById(R.id.nose);
        mImageViewShoes = (View) findViewById(R.id.shoes);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putString(STATE_KEY, State);
        super.onSaveInstanceState(outState);
    }

    public void onClickCheckbox (View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.checkBox_arms:
                View imgview_arms = (View) findViewById(R.id.arms);
                if (checked)
                    imgview_arms.setVisibility(View.VISIBLE);
                else
                    imgview_arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_ears:
                View imgview_ears = (View) findViewById(R.id.ears);
                if (checked)
                    imgview_ears.setVisibility(View.VISIBLE);
                else
                    imgview_ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyebrows:
                View imgview_eyebrows = (View) findViewById(R.id.eyebrows);
                if (checked)
                    imgview_eyebrows.setVisibility(View.VISIBLE);
                else
                    imgview_eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyes:
                View imgview_eyes = (View) findViewById(R.id.eyes);
                if (checked)
                    imgview_eyes.setVisibility(View.VISIBLE);
                else
                    imgview_eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_glasses:
                View imgview_glasses = (View) findViewById(R.id.glasses);
                if (checked)
                    imgview_glasses.setVisibility(View.VISIBLE);
                else
                    imgview_glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_hat:
                View imgview_hat = (View) findViewById(R.id.hat);
                if (checked)
                    imgview_hat.setVisibility(View.VISIBLE);
                else
                    imgview_hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mouth:
                View imgview_mouth = (View) findViewById(R.id.mouth);
                if (checked)
                    imgview_mouth.setVisibility(View.VISIBLE);
                else
                    imgview_mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mustache:
                View imgview_mustache = (View) findViewById(R.id.mustache);
                if (checked)
                    imgview_mustache.setVisibility(View.VISIBLE);
                else
                    imgview_mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_nose:
                View imgview_nose = (View) findViewById(R.id.nose);
                if (checked)
                    imgview_nose.setVisibility(View.VISIBLE);
                else
                    imgview_nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_shoes:
                View imgview_shoes = (View) findViewById(R.id.shoes);
                if (checked)
                    imgview_shoes.setVisibility(View.VISIBLE);
                else
                    imgview_shoes.setVisibility(View.INVISIBLE);
                break;

            }
        }
}
