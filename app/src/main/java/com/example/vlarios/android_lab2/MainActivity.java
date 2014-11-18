package com.example.vlarios.android_lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends Activity {

    public static ArrayList <ListItem> mArraylist = null;
    public static int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArraylist = new ArrayList<ListItem>();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addSelect(View view) {
        Intent intent = new Intent(this, AddElementsWindow.class);
        startActivity(intent);
    }

    public void viewSelect(View view) {
        Intent intent = new Intent(this, ElementListWindow.class);
        startActivity(intent);
    }
}
