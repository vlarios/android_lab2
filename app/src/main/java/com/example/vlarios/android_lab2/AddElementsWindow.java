package com.example.vlarios.android_lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class AddElementsWindow extends Activity {

    //public static ArrayList <ListItem> mArraylist = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_elements_window);

        Intent intent = getIntent();
        //mArraylist = new ArrayList<ListItem>();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_elements_window, menu);
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

    public void addElements(View view) {
        ListItem listItem = new ListItem();
        EditText editText = (EditText) findViewById(R.id.empresaText);
        String message = editText.getText().toString();
        listItem.setHeader(message);
        EditText editText1 = (EditText) findViewById(R.id.giroText);
        message = editText1.getText().toString();
        listItem.setSubHeader(message);
        listItem.setImageUser(getResources().getDrawable(R.drawable.bart));
        //add item to array list
        MainActivity.mArraylist.add(listItem);
        editText.setText("");
        editText1.setText("");

    }


}
