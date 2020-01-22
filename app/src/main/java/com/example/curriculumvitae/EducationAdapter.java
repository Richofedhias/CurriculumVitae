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

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.myViewHolder> {
    Context context;
    ArrayList<EducationList> isiEducationlist;

    @NonNull
    @Override
    public EducationAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_education,parent,false);
        myViewHolder viewHolder = new myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EducationAdapter.myViewHolder holder, int position) {
        holder.namaEducation.setText(isiEducationlist.get(position).getNamaEduction());
        holder.tahunEducation.setText(isiEducationlist.get(position).getTahunEducation());
        holder.logo.setImageResource(isiEducationlist.get(position).getGambar());
        holder.jenisEducation.setText(isiEducationlist.get(position).getJenisEducation());
    }

    @Override
    public int getItemCount() {
        return isiEducationlist.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView namaEducation,tahunEducation,jenisEducation;
        ImageView logo;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            namaEducation = itemView.findViewById(R.id.namaEducation);
            tahunEducation = itemView.findViewById(R.id.tahunEducation);
            jenisEducation = itemView.findViewById(R.id.jenisEducation);
            logo = itemView.findViewById(R.id.gambarEducation);
        }
    }
}
