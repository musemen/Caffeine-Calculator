package com.musamohannad.ablm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   // User test = new User("musa",19,180,67,null);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Profiles dropdown
        Spinner profiles= findViewById(R.id.profiles);
        String [] profilearrays = new String[]{"a"};
        ArrayAdapter<String> adapterprofile= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,profilearrays);
        profiles.setAdapter(adapterprofile);

        //coffee dropdown
        Spinner coffees= findViewById(R.id.coffees);
        String [] coffeesarrays = new String[]{"test","test2"};
        // here get the string array of the users drinks
        ArrayAdapter<String> adaptercoffee = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,coffeesarrays);
        coffees.setAdapter(adaptercoffee);



    }

    public void gotoprofile(View v){
        Intent intent = new Intent(this, makeprofile.class);
        startActivity(intent);
    }
    public void calculate(View v){
    //    Intent intent = new Intent(this, UserProfile.class);
     //   startActivity(intent);
    }

}
