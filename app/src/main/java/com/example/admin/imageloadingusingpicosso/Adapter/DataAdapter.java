package com.example.admin.imageloadingusingpicosso.Adapter;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.imageloadingusingpicosso.POJO.Androidversion;
import com.example.admin.imageloadingusingpicosso.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.data;

/**
 * Created by Admin on 9/22/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.viewholder> {
    Context context;
    ArrayList<Androidversion> data;
    View row;

    public DataAdapter (Context context, ArrayList<Androidversion> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public  DataAdapter.viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        row = LayoutInflater.from(context).inflate(R.layout.dataadapteritemlist, parent, false);
        return new viewholder(row);
    }

    @Override
    public void onBindViewHolder(DataAdapter.viewholder holder, int position) {
        holder.t1.setText(data.get(position).getA_vname());
        Picasso.with(context).load(data.get(position).getA_iv()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView t1;

        public viewholder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.android_tv);
            imageView = (ImageView) itemView.findViewById(R.id.android_iv);

        }
    }
}