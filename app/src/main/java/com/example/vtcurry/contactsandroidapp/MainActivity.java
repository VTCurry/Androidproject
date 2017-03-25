package com.example.vtcurry.contactsandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;

import static android.R.attr.fromId;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name;
    EditText phoneNumber;
    ListView contactList;
    Button button;

    ArrayAdapter<Contacts> contactPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText);
        phoneNumber = (EditText) findViewById(R.id.editText2);
        contactList = (ListView) findViewById(R.id.listView);
        button = (Button) findViewById(R.id.button);

        contactPeople = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

        contactList.setAdapter(contactPeople);

        button.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Editable Ename = name.getText();
        Editable Ephone = phoneNumber.getText();
        String Sname = Ename.toString();
        String Sphone = Ephone.toString();
        Contacts item = new Contacts(Sname, Sphone);
        contactPeople.add(item);
        name.setText("");
        phoneNumber.setText("");

    }
}
