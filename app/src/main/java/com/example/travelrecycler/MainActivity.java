package com.example.travelrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.travelrecycler.adapter.TripsAdapter;
import com.example.travelrecycler.models.Ads;
import com.example.travelrecycler.models.Item;
import com.example.travelrecycler.models.News;
import com.example.travelrecycler.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TripsAdapter.OnItemClickListener {

    private List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        items = new ArrayList<>();

        TripsAdapter adapter = new TripsAdapter(items);

        Trip trip1 = new Trip(R.drawable.croatia, "Хорватія", "fdgkjdвапвапвапвапfhkghdk");
        items.add(new Item(0, trip1));

        Ads ads1 = new Ads("dfsf", "sdfвапвапвапвапвапвапвапавпвапвапвавапавпвsf");
        items.add(new Item(1, ads1));

        News news1 = new News("dfgdf", "sdfвапвапвапвапвdfdsffdsfjkhsdkfdsfksdkjfkdsjkfkjsdfjksdkfkjsdkjfksdkfjksdjfkjsdkjfhапвапвапвапвапвапвпs");
        items.add(new Item(3, news1));

        Trip trip2 = new Trip(R.drawable.bali, "Балі", "fdgkjdfпвпвапвапвапвапвапвпhkghdk");
        items.add(new Item(0, trip2));

        Ads ads2 = new Ads("dfsf", "sdfвапвапвапвапвапвапвапвапвапвапвапвапвапвапавпвапsf");
        items.add(new Item(1, ads2));

        Trip trip3 = new Trip(R.drawable.bora, "Бора-бора", "fdgkjdвапвапвапвапвапвfhkghdk");
        items.add(new Item(0, trip3));

        News news2 = new News("dfgdf", "sdвапвпвапвапвапвапвапвfdskfjksdljkfjklsdfjlsdkfjlksdjflksdjflksdjlfjsdklfjlsdsdfdsfапвпвапвапвапвапвапвапвапавпвапвапвапвапfs");
        items.add(new Item(3, news2));

        Trip trip4 = new Trip(R.drawable.croatia, "Хорватія", "fdgkjdвапвапвапвапfhkghdk");
        items.add(new Item(0, trip4));

        Ads ads3 = new Ads("dfsf", "sdfвапвапвапвапвапвапвапавпвапвапвавапавпвsf");
        items.add(new Item(1, ads3));

        News news3 = new News("dfgdf", "sdfвапвапвапвапвапвапsdfsdfsdfksld;kfsdkl;fs;dkf;dslfkl;sdklfksd;lfk;lsd;lfksd;fl;sd;fk;lsdkfвапвапвапвапвпs");
        items.add(new Item(3, news3));

        Trip trip5 = new Trip(R.drawable.bali, "Балі", "fdgkjdfпвпвапвапвапвапвапвпhkghdk");
        items.add(new Item(0, trip5));

        Ads ads4 = new Ads("dfsf", "sdfвапвапвапвапвапвапвапвапвапвапвапвапвапвапавпвапsf");
        items.add(new Item(1, ads4));

        Trip trip6 = new Trip(R.drawable.bora, "Бора-бора", "fdgkjdвапвапвапвапвапвfhkghdk");
        items.add(new Item(0, trip6));

        News news4 = new News("dfgdf", "sdвапвпвапвапвапваdsfsdfsdl;fklsdl;f;sd;lfsd;lf;lsdkf;lsd;lfkl;dsksdkпвапвапвпвапвапвапвапвапвапвапавпвапвапвапвапfs");
        items.add(new Item(3, news4));

        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(this);
    }

    @Override
    public void onItemClick(int position) {
        if (position == 0){
            Item item = items.get(position);
            Trip trip = (Trip) item.getObject();
            Intent intent = new Intent(this, ItemDetail.class);
            intent.putExtra("name", trip.getTripTitle());
            intent.putExtra("image", trip.getTripImage());
            startActivity(intent);
        } else if (position == 3){
            Item item = items.get(position);
            Trip trip = (Trip) item.getObject();
            Intent intent = new Intent(this, ItemDetail.class);
            intent.putExtra("name", trip.getTripTitle());
            intent.putExtra("image", trip.getTripImage());
            startActivity(intent);
        }
    }
}
