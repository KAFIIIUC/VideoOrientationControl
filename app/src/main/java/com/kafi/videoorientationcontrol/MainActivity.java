package com.kafi.videoorientationcontrol;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoViewId);
        mediaController = new MediaController(MainActivity.this);

        videoView.setMediaController(mediaController);

        //videoView.setVideoURI(Uri.parse("android.resource://com.example.user.videoplayerdemo/https://www.youtube.com/watch?v=WgieJLjAkkU"));
        videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        //videoView.requestFocus();
        videoView.start();
    }

}
