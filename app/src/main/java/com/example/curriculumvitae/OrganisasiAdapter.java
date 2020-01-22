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

public class OrganisasiAdapter extends RecyclerView.Adapter<OrganisasiAdapter.myViewHolder> {
    Context context;
    ArrayList<OrganisasiList> isiOrganisasiList;

    public OrganisasiAdapter(Context context, ArrayList<OrganisasiList> isiOrganisasiList) {
        this.context = context;
        this.isiOrganisasiList = isiOrganisasiList;
    }

    @NonNull
    @Override
    public OrganisasiAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_organisasi,parent,false);
        myViewHolder viewHolder = new myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrganisasiAdapter.myViewHolder holder, int position) {
        holder.namaOrganisasi.setText(isiOrganisasiList.get(position).getNamaOrganisasi());
        holder.tahunOrganisasi.setText(isiOrganisasiList.get(position).getTahunOrganisasi());
        holder.logo.setImageResource(isiOrganisasiList.get(position).getGambar());
        holder.jenisOrganisasi.setText(isiOrganisasiList.get(position).getJenisOrganisasi());
    }

    @Override
    public int getItemCount() {
        return isiOrganisasiList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView namaOrganisasi,tahunOrganisasi,jenisOrganisasi;
        ImageView logo;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            namaOrganisasi = itemView.findViewById(R.id.namaOrganisasi);
            tahunOrganisasi = itemView.findViewById(R.id.tahunOrganisasi);
            jenisOrganisasi = itemView.findViewById(R.id.jenisOrganisasi);
            logo = itemView.findViewById(R.id.gambarOrganisasi);

        }
    }
}
