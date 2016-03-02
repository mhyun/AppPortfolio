package com.example.android.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyStreamerToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Spotify Steamer is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void scoresToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Scores App is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void libraryToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Library App is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void buildItBiggerToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Build It Bigger is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void xyzToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "XYZ Reader is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void capstoneToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Capstone: My Own App is currently under construction.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
