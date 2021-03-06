package com.kufed.id.customadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kufed.id.activity.R;
import com.kufed.id.rowdata.Rowdata_Detail_Likes;
import com.kufed.id.rowdata.Rowdata_Detail_SolybyStore;
import com.pkmmte.view.CircularImageView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by macbook on 6/28/16.
 */
public class RVAdapter_Detail_SoldByStore extends RecyclerView.Adapter<RVAdapter_Detail_SoldByStore.Viewholder>{
    private Context context;
    private List<Rowdata_Detail_SolybyStore> data;

    public RVAdapter_Detail_SoldByStore(Context context, List<Rowdata_Detail_SolybyStore> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_detail_solyby_store, null);
        Viewholder viewholder =new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        final Rowdata_Detail_SolybyStore item = data.get(position);
        Glide.with(context).load(item.getUrl_photo()).asBitmap().into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        @Bind(R.id.img)ImageView img;

        public Viewholder(View itemView) {
            super(itemView);
            try {
                ButterKnife.bind(this, itemView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
