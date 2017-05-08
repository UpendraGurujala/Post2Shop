package com.post2shop.post2shop;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Upendra G on 5/1/2017.
 */
public class  buyerhome extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyerhome);

//Spinner code begins
        Spinner spinner = (Spinner) findViewById(R.id.category_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Spinner spinnerSub = (Spinner) findViewById(R.id.subcategory_spinner);
        ArrayAdapter<CharSequence> adaptersub = ArrayAdapter.createFromResource(this,
                R.array.subcategory_array, android.R.layout.simple_spinner_item);
        adaptersub.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSub.setAdapter(adaptersub);

        //Spinner code ends
    }
}

