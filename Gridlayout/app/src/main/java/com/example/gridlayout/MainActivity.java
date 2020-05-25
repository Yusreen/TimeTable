package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {
        int id= view.getId();
        String ourId ="";
        //get Id of object
       ourId= view.getResources().getResourceEntryName(id);
        //Log.i("button tapped",ourId);
        //play sound
        int resourceId = getResources().getIdentifier(ourId,"raw","com.example.gridlayout");
        MediaPlayer mplayer= MediaPlayer.create(this,resourceId);
        mplayer.start();

    }
}
