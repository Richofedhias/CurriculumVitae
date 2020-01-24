package com.example.curriculumvitae;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SosmedAdapter extends RecyclerView.Adapter<SosmedAdapter.myViewHolder> {
    Context context;
    ArrayList<SosmedList> isiSosmedList;

    public SosmedAdapter(Context context, ArrayList<SosmedList> isiSosmedList) {
        this.context = context;
        this.isiSosmedList = isiSosmedList;
    }

    @NonNull
    @Override
    public SosmedAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_sosialmedia,parent,false);
        SosmedAdapter.myViewHolder viewHolder = new SosmedAdapter.myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SosmedAdapter.myViewHolder holder, int position) {
        holder.nama.setText(isiSosmedList.get(position).getNama());
        holder.logo.setImageResource(isiSosmedList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return isiSosmedList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView logo;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tV_namaSosmed);
            logo = itemView.findViewById(R.id.iV_logoSosmed);
        }
    }
}
