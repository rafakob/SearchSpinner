package com.rafakob.searchspinner.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rafakob.searchspinner.SearchSpinner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleActivity extends AppCompatActivity {
    private SearchSpinner searchSpinner;

    private List<Person> items = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        loadItems();

        List<String> suggestions = new ArrayList<>();
        for (Person item : items) {
            suggestions.add(item.lastName + " " + item.firstName);
        }


        searchSpinner = (SearchSpinner) findViewById(R.id.search_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, suggestions);
        searchSpinner.setAdapter(adapter);
    }


    private void loadItems() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("items.json")));
            items = new Gson().fromJson(reader, new TypeToken<LinkedList<Person>>() {
            }.getType());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
