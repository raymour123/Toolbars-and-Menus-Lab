package com.example.raymour.toolbarslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PodcastActivity extends AppCompatActivity {

    ImageView mPlayButton;
    ImageView mAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        Toolbar topToolbar = (Toolbar) findViewById(R.id.podcast_toolbarTop);
        setSupportActionBar(topToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Podcasts");

        mPlayButton = (ImageView) findViewById(R.id.pod_playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PodcastActivity.this, "I could use a podcast right now, too", Toast.LENGTH_SHORT).show();
            }
        });

        mAlbum = (ImageView) findViewById(R.id.pod_album);
        mAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PodcastActivity.this, "Do podcasts even have albums?", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.podcast_top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(PodcastActivity.this, "This button should open a menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pod_top_cast:
                Toast.makeText(PodcastActivity.this, "Yeah, that's not gonna cast", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pod_top_plus:
                Toast.makeText(PodcastActivity.this, "Adding nothing to nothing gives you nothing!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.pod_top_more:
                startActivity(new Intent(PodcastActivity.this, TedActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

