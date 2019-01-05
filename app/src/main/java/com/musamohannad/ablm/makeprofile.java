package com.musamohannad.ablm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

import java.util.ArrayList;


public class makeprofile extends AppCompatActivity {
    ArrayList<User> users= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeprofile);
    }

//    public void saveuser(){
//    User user = null;
//    EditText editText = findViewById(R.id.editText5);
//    String name= editText.getText().toString();
//    user.name=name;
//    EditText editText1 = findViewById(R.id.editText3);
//    Editable weight = editText.getText();
//    user.weight=weight;
//    EditText editText2 = findViewById(R.id.editText4);
//    Editable height = editText.getText();
//    user.height=height;
//    users.add(user);


}
