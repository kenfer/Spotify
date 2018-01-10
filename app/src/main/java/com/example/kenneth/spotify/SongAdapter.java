package com.example.kenneth.spotify;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by khent on 12/18/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.MyHolder> {

    private Context context;
    private List<Songs> items;

    public SongAdapter(Context context, List<Songs> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.title.setText(items.get(position).getTitle());
        holder.desc.setText(items.get(position).getShortdesc());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        TextView title, desc;

        public MyHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textViewTitle);
            desc = itemView.findViewById(R.id.item_descrip);

        }

    }

    {
    }
}
