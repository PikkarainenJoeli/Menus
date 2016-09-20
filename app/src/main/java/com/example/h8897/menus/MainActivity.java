package com.example.h8897.menus;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



/**
 *
 * @author PTM
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_video:
                Toast.makeText(getBaseContext(), "Video", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_music:
                Toast.makeText(getBaseContext(), "Music", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_quit:
                Toast.makeText(getBaseContext(), "Quit", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}


