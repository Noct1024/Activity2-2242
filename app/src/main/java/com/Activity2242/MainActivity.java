package com.Activity2242;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView name;
    TextView address;
    TextView age;
    TextView cont_num;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Address = "adressKey";
    public static final String Age = "ageKey";
    public static final String Contac = "ContKey";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.etName);
        address = (TextView) findViewById(R.id.etAdd);
        age = (TextView) findViewById(R.id.etAge);
        cont_num = (EditText) findViewById(R.id.etCont);
        sharedPreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        if (sharedPreferences.contains(Name)) {
            name.setText(sharedPreferences.getString(Name, ""));
        }
        if (sharedPreferences.contains(Address)) {
            address.setText(sharedPreferences.getString(Address, ""));
        }
        if (sharedPreferences.contains(Contac)) {
            cont_num.setText(sharedPreferences.getString(Contac, ""));
        }
    }
    public void Save(View view) {
    String n= name.getText().toString();
    String a= address.getText().toString();
    String cn= address.getText().toString();
    String ag= address.getText().toString();
    SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(Name,n);
    editor.putString(Address,a);
    editor.putString(Contac,cn);
    editor.putString(Age,ag);
    editor.commit();
    }

    public void Get(View view) {
        name = (TextView) findViewById(R.id.etName);
        address = (TextView) findViewById(R.id.etAdd);
        age = (TextView) findViewById(R.id.etAge);
        cont_num = (TextView) findViewById(R.id.etCont);

        sharedPreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        if (sharedPreferences.contains(Name)) {
            name.setText(sharedPreferences.getString(Name, ""));
        }
        if (sharedPreferences.contains(Address)) {
            address.setText(sharedPreferences.getString(Address, ""));
        }
        if (sharedPreferences.contains(Age)) {
            age.setText(sharedPreferences.getString(Age, ""));
        }
        if (sharedPreferences.contains(Contac)) {
            cont_num.setText(sharedPreferences.getString(Contac, ""));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}