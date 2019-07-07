package com.example.appfootballclub;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPlayerAdapter extends RecyclerView.Adapter<CardViewPlayerAdapter.CardViewHolder> {

    private Context context;
    private ArrayList<Player> listPlayer;
    private ArrayList<Player> getListPlayer() {
        return listPlayer;
    }
    public void setListPlayer(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }
    public CardViewPlayerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewPlayerAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_view, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewPlayerAdapter.CardViewHolder cardViewHolder, int i) {
        final Player p = getListPlayer().get(i);
        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewHolder.imgPhoto);
        cardViewHolder.tvName.setText(p.getName());
        cardViewHolder.tvRemarks.setText(p.getRemarks());
        cardViewHolder.btnFavorite.setOnClickListener((View.OnClickListener) new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListPlayer().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewHolder.btnShare.setOnClickListener((View.OnClickListener) new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListPlayer().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("imgPhoto", p.getPhoto());
                intent.putExtra("tvName", p.getName());
                intent.putExtra("tvRemarks", p.getRemarks());
                intent.putExtra("tvDesc", p.getDescription());
                intent.putExtra("tvDate", p.getDateofbirth());
                intent.putExtra("tvPlace", p.getPlaceofbirth());
                intent.putExtra("tvHeight", p.getHeight());
                intent.putExtra("tvPosition", p.getPosition());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPlayer().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks, tvDesc, tvDate, tvPlace, tvHeight, tvPosition;
        Button btnFavorite, btnShare;
        RelativeLayout relativeLayout;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            tvDate = itemView.findViewById(R.id.tv_item_tglLahir);
            tvPlace = itemView.findViewById(R.id.tv_item_tempatLahir);
            tvHeight = itemView.findViewById(R.id.tv_item_tinggi);
            tvPosition = itemView.findViewById(R.id.tv_item_posisi);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            relativeLayout = itemView.findViewById(R.id.relative);
        }
    }
}
