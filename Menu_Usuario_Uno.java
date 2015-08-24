package com.example.leonardoperez.v3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;


public class Menu_Usuario_Uno extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__usuario__uno);
        final VideoView videoView =
                (VideoView) findViewById(R.id.webView);
        videoView.setVideoPath(
                "http://www.ebookfrenzy.com/android_book/movie.mp4");
        videoView.start();
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
    public void Descarga_FDA1 (View view) {
        Intent Descarga_FDA1 = new Intent(this, FDA1.class);
        startActivity(Descarga_FDA1); }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu__usuario__uno, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
   if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}