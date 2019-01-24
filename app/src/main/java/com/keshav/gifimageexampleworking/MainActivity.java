package com.keshav.gifimageexampleworking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.keshav.gifimageexampleworking.R;

public class MainActivity extends AppCompatActivity
{
    private GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifImageView = (GifImageView) findViewById(R.id.GifImageView);

        gifImageView.setGifImageResource(R.drawable.success1);

        // TODO   android:hardwareAccelerated="false"  in Manifest File

        /*<activity android:name=".MainActivity"
        android:hardwareAccelerated="false">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>*/

    }


}
