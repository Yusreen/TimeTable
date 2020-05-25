package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView =(ListView) findViewById(R.id.myListView);
        final ArrayList<String> friends =new ArrayList<String>();

        friends.add("Raphael");
        friends.add("Yusreen");
        friends.add("Owen");
        friends.add("Leopold");

        //Array adapter converts an array in a different format
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,friends);
        myListView.setAdapter(arrayAdapter);

       //Make listview interactive
       myListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
                                         {
                                             @Override
                                             public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                                             {
                                                 Log.i("Person tapped: ",friends.get(position));
                                                 Context context = getApplicationContext();
                                                 CharSequence text = "Hello toast!";
                                                 int duration = Toast.LENGTH_SHORT;

                                                 Toast toast = Toast.makeText(context, "Hello "+friends.get(position), duration);
                                                 toast.show();
                                             }
                                         }

       );





    }
}
