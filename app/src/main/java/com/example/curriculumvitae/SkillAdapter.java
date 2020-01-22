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

public class SkillAdapter extends RecyclerView.Adapter<SkillAdapter.myViewHolder> {
    Context context;
    ArrayList<SkillList> isiSkillList;

    public SkillAdapter(Context context, ArrayList<SkillList> isiSkillList) {
        this.context = context;
        this.isiSkillList = isiSkillList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_skill,parent,false);
        SkillAdapter.myViewHolder viewHolder = new SkillAdapter.myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SkillAdapter.myViewHolder holder, int position) {
        holder.nama.setText(isiSkillList.get(position).getNamaSkill());
        holder.logo.setImageResource(isiSkillList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return isiSkillList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView logo;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tV_namaSkill);
            logo = itemView.findViewById(R.id.iV_logoSkill);
        }
    }
}
