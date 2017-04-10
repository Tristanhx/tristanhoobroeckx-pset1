package com.example.tristan.tristanhoobroeckx_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View mImageViewArms = (View) findViewById(R.id.arms);
    private View mImageViewBody = (View) findViewById(R.id.body);
    private View mImageViewEars = (View) findViewById(R.id.ears);
    private View mImageViewEyebrows = (View) findViewById(R.id.eyebrows);
    private View mImageViewEyes = (View) findViewById(R.id.eyes);
    private View mImageViewGlasses = (View) findViewById(R.id.glasses);
    private View mImageViewHat = (View) findViewById(R.id.hat);
    private View mImageViewMouth = (View) findViewById(R.id.mouth);
    private View mImageViewMustache = (View) findViewById(R.id.mustache);
    private View mImageViewNose = (View) findViewById(R.id.nose);
    private View mImageViewShoes = (View) findViewById(R.id.shoes);

    private String STATE_KEY_Arms = "arms";
    private String STATE_KEY_Ears = "ears";
    private String STATE_KEY_Eyeb = "eyeb";
    private String STATE_KEY_Eyes = "eyes";
    private String STATE_KEY_Glas = "glas";
    private String STATE_KEY_Hat = "hat";
    private String STATE_KEY_Mouth = "mouth";
    private String STATE_KEY_Musta = "musta";
    private String STATE_KEY_Nose = "nose";
    private String STATE_KEY_Shoes = "shoes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Get our saved instance
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // If it isn't nothing, recreate the saved state
        if(savedInstanceState != null){
            if (savedInstanceState.getInt(STATE_KEY_Arms) == 0){
                mImageViewArms.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Ears) == 0){
                mImageViewEars.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Eyeb) == 0){
                mImageViewEyebrows.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Eyes) == 0){
                mImageViewEyes.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Glas) == 0){
                mImageViewGlasses.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Hat) == 0){
                mImageViewHat.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Mouth) == 0){
                mImageViewMouth.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Musta) == 0){
                mImageViewMustache.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Nose) == 0){
                mImageViewNose.setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt(STATE_KEY_Shoes) == 0){
                mImageViewShoes.setVisibility(View.VISIBLE);
            }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
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
/* Method to make visible or invisible some imageviews by checking which corresponding button was
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
