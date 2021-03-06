package com.example.tristan.tristanhoobroeckx_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    // Views
    private View mImageViewArms, mImageViewEars, mImageViewEyebrows, mImageViewEyes,
            mImageViewGlasses, mImageViewHat, mImageViewMouth, mImageViewMustache, mImageViewNose,
            mImageViewShoes;

    // Keys
    private String STATE_KEY_Arms = "arms", STATE_KEY_Ears = "ears", STATE_KEY_Eyeb = "eyeb",
            STATE_KEY_Eyes = "eyes", STATE_KEY_Glas = "glas", STATE_KEY_Hat = "hat",
            STATE_KEY_Mouth = "mouth", STATE_KEY_Musta = "musta", STATE_KEY_Nose = "nose",
            STATE_KEY_Shoes = "shoes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Get our saved instance
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.activity_main);

        mImageViewArms = findViewById(R.id.arms);
        mImageViewEars =  findViewById(R.id.ears);
        mImageViewEyebrows = findViewById(R.id.eyebrows);
        mImageViewEyes = findViewById(R.id.eyes);
        mImageViewGlasses = findViewById(R.id.glasses);
        mImageViewHat = findViewById(R.id.hat);
        mImageViewMouth = findViewById(R.id.mouth);
        mImageViewMustache = findViewById(R.id.mustache);
        mImageViewNose = findViewById(R.id.nose);
        mImageViewShoes = findViewById(R.id.shoes);


        // If something is stored in savedInstanceState, recreate the saved state
        if (savedInstanceState != null) {
            if (savedInstanceState.getInt(STATE_KEY_Arms) == 0) {
                mImageViewArms.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Ears) == 0) {
                mImageViewEars.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Eyeb) == 0) {
                mImageViewEyebrows.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Eyes) == 0) {
                mImageViewEyes.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Glas) == 0) {
                mImageViewGlasses.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Hat) == 0) {
                mImageViewHat.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Mouth) == 0) {
                mImageViewMouth.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Musta) == 0) {
                mImageViewMustache.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Nose) == 0) {
                mImageViewNose.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Shoes) == 0) {
                mImageViewShoes.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Calling the super is supposed to save my views
        super.onSaveInstanceState(outState);
        // This is where I save my own state
        outState.putInt(STATE_KEY_Arms, mImageViewArms.getVisibility());
        outState.putInt(STATE_KEY_Ears, mImageViewEars.getVisibility());
        outState.putInt(STATE_KEY_Eyeb, mImageViewEyebrows.getVisibility());
        outState.putInt(STATE_KEY_Eyes, mImageViewEyes.getVisibility());
        outState.putInt(STATE_KEY_Glas, mImageViewGlasses.getVisibility());
        outState.putInt(STATE_KEY_Hat, mImageViewHat.getVisibility());
        outState.putInt(STATE_KEY_Mouth, mImageViewMouth.getVisibility());
        outState.putInt(STATE_KEY_Musta, mImageViewMustache.getVisibility());
        outState.putInt(STATE_KEY_Nose, mImageViewNose.getVisibility());
        outState.putInt(STATE_KEY_Shoes, mImageViewShoes.getVisibility());
    }

/* Method to make visible or invisible some ImageViews by checking which corresponding button was
   checked.
   */
    public void onClickCheckbox (View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.checkBox_arms:
                if (checked)
                    mImageViewArms.setVisibility(View.VISIBLE);
                else
                    mImageViewArms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_ears:
                if (checked)
                    mImageViewEars.setVisibility(View.VISIBLE);
                else
                    mImageViewEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyebrows:
                if (checked)
                    mImageViewEyebrows.setVisibility(View.VISIBLE);
                else
                    mImageViewEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyes:
                if (checked)
                    mImageViewEyes.setVisibility(View.VISIBLE);
                else
                    mImageViewEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_glasses:
                if (checked)
                    mImageViewGlasses.setVisibility(View.VISIBLE);
                else
                    mImageViewGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_hat:
                if (checked)
                    mImageViewHat.setVisibility(View.VISIBLE);
                else
                    mImageViewHat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mouth:
                if (checked)
                    mImageViewMouth.setVisibility(View.VISIBLE);
                else
                    mImageViewMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mustache:
                if (checked)
                    mImageViewMustache.setVisibility(View.VISIBLE);
                else
                    mImageViewMustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_nose:
                if (checked)
                    mImageViewNose.setVisibility(View.VISIBLE);
                else
                    mImageViewNose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_shoes:
                if (checked)
                    mImageViewShoes.setVisibility(View.VISIBLE);
                else
                    mImageViewShoes.setVisibility(View.INVISIBLE);
                break;

            }
        }
}
