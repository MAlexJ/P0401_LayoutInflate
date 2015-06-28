package com.example.alex.p0401_layoutinflate;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    final String LOG_TAG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = getLayoutInflater();
        /* 1 способ */
        // View view = inflater.inflate(R.layout.text, null, true);
        //***************************************************************

        /* 2 способ*/
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
        View view = inflater.inflate(R.layout.text, linearLayout, true);


        LayoutParams layoutParams1 = view.getLayoutParams();

        /* 1 способ */
//        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);
//        linearLayout.addView(view);
        //***************************************************************

        Log.d(LOG_TAG, "Class of view: " + view.getClass());
        Log.d(LOG_TAG, "LayoutParams of view is null: " + layoutParams1.getClass().getSimpleName());


        /* 3й способ */
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);
        View view2 = inflater.inflate(R.layout.text, relativeLayout, true);
        LayoutParams layoutParams2 = view2.getLayoutParams();

        Log.d(LOG_TAG, "Class of view: " + view2.getClass());
        Log.d(LOG_TAG, "LayoutParams of view is null: " + layoutParams2.getClass().getSimpleName());


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
}
