package com.example.joy.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool msoundpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        msoundpool=new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds

        mCSoundId=msoundpool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId=msoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId=msoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId=msoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId=msoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId=msoundpool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundId=msoundpool.load(getApplicationContext(),R.raw.note7_b,1);

    }

    // TODO: Add the play methods triggered by the buttons
    public void playc(View v){
        Log.d("Xylophone","Red button pressed");
        msoundpool.play(mCSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playd(View v){
        Log.d("Xylophone","Blue button");
        msoundpool.play(mDSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playe(View v){
        msoundpool.play(mESoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playf(View v){
        msoundpool.play(mFSoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playg(View v){
        msoundpool.play(mGSoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playa(View v){
        msoundpool.play(mASoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playb(View v){
        msoundpool.play(mBSoundId,1.0f,1.0f,0,0,1.0f);
    }






}

