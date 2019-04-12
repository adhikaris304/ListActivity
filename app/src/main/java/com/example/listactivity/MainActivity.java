package com.example.listactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

public static final String countries[]={
        "Nepal","Kathmandu",
    "India","Delhi",
    "China","Beijing",
    "bhutan","thimpu",
    "amrica","Washignton"
};

private Map<String,String> dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        ListView lstcountries=findViewById(R.id.countries);


        dictionary =new HashMap<>();
        for(int i=0;i<countries.length;i+=2){
            dictionary.put(countries[i],countries[i+1]);
        }
        ArrayAdapter <String>countryAdapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(dictionary.keySet()));


        lstcountries.setAdapter(countryAdapter);

        lstcountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    String countries
                                                }
                                            }
        );
    }
}
