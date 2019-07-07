package com.example.appfootballclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name, club, desc, date, place, height, pos;
    String playerName, playerClub, playerDesc, playerDate, playerPlace, playerHeight, playerPos;
    String image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        club = findViewById(R.id.tv_item_remarks);
        desc = findViewById(R.id.tv_item_desc);
        date = findViewById(R.id.tv_item_tglLahir);
        place = findViewById(R.id.tv_item_tempatLahir);
        height = findViewById(R.id.tv_item_tinggi);
        pos = findViewById(R.id.tv_item_posisi);

        playerName = getIntent().getStringExtra("tvName");
        playerClub = getIntent().getStringExtra("tvRemarks");
        playerDesc = getIntent().getStringExtra("tvDesc");
        image = getIntent().getStringExtra("imgPhoto");
        playerDate = getIntent().getStringExtra("tvDate");
        playerPlace = getIntent().getStringExtra("tvPlace");
        playerHeight = getIntent().getStringExtra("tvHeight");
        playerPos = getIntent().getStringExtra("tvPosition");

        name.setText(playerName);
        club.setText(playerClub);
        desc.setText(playerDesc);
        date.setText(playerDate);
        place.setText(playerPlace);
        height.setText(playerHeight);
        pos.setText(playerPos);
        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(350, 550))
                .into(imageView);
    }
}
