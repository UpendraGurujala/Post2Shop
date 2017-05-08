package com.post2shop.post2shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.setImageResource(R.drawable.logo);

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

        //buttons code starts here
        final Button buttonSignup = (Button) findViewById(R.id.btnsignup);

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launchactivity= new Intent(MainActivity.this,signup.class);
                startActivity(launchactivity);
            }
        });

        final Button buttonPost = (Button) findViewById(R.id.btnpost);
        buttonPost.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent launchactivity= new Intent(MainActivity.this,buyerhome.class);
                startActivity(launchactivity);
            }
        });
//buttons code ends here

    }
}
