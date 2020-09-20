package com.example.leer_lecturas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sms extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        listView = findViewById(R.id.lv_sms);
        List<String> smsContent = new ArrayList<String>(){{
            add("mensaje uno");
            add("mensaje dos");
            add("mensaje tres");
            add("mensaje uno");
            add("mensaje dos");
            add("mensaje tres");
            add("mensaje uno");
            add("mensaje dos");
            add("mensaje tres");
        }};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, smsContent);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(sms.this , smsContent.get(i), Toast.LENGTH_SHORT).show();
        });
    }
}