package com.example.raymour.toolbarslab;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        Toolbar toolbar = (Toolbar) findViewById(R.id.ted_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
        upArrow.setColorFilter(getResources().getColor(android.R.color.darker_gray), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ted_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ted_share:
                Toast.makeText(TedActivity.this, "Don't pretend you have anyone to share this with", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ted_bookmark:
                Toast.makeText(TedActivity.this, "I'm honored you'd want to book mark this", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ted_download:
                Toast.makeText(TedActivity.this, "This cost $100 cash to download", Toast.LENGTH_SHORT).show();
                return true;
            case android.R.id.home:
                onNavigateUp();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
