package com.example.appfootballclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private RecyclerView rvCategory;
    private ArrayList<Player> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(LOG_TAG,"Button Clicked");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlayerAdapter cardViewPlayerAdapter = new CardViewPlayerAdapter(this);
        cardViewPlayerAdapter.setListPlayer(list);
        rvCategory.setAdapter(cardViewPlayerAdapter);
    }
}
