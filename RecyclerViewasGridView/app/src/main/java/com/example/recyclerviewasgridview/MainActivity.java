package com.example.recyclerviewasgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public Adapter adapter;
    List<String> title;
    List<Integer> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        title = new ArrayList<>();
        images = new ArrayList<>();

        title.add("Android");
        title.add("Assignment");
        title.add("Child Care");
        title.add("Flight");
        title.add("Hotel");
        title.add("Wifi");
        title.add("Child Care");
        title.add("Flight");
        title.add("Hotel");
        title.add("Android");
        title.add("Assignment");
        title.add("Child Care");


        images.add(R.drawable.ic_android_black_24dp);
        images.add(R.drawable.ic_assignment_black_24dp);
        images.add(R.drawable.ic_child_care_black_24dp);
        images.add(R.drawable.ic_flight_black_24dp);
        images.add(R.drawable.ic_hotel_black_24dp);
        images.add(R.drawable.ic_wifi_black_24dp);
        images.add(R.drawable.ic_child_care_black_24dp);
        images.add(R.drawable.ic_flight_black_24dp);
        images.add(R.drawable.ic_hotel_black_24dp);
        images.add(R.drawable.ic_android_black_24dp);
        images.add(R.drawable.ic_assignment_black_24dp);
        images.add(R.drawable.ic_child_care_black_24dp);

        adapter = new Adapter(title,images,this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
