package com.example.curriculumvitae;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.myViewHolder> {
Context context;
ArrayList<ProductList> isiProductList;

    public ProductAdapter(Context context, ArrayList<ProductList> isiProductList) {
        this.context = context;
        this.isiProductList = isiProductList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        myViewHolder viewHolder = new myViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.namaProduct.setText(isiProductList.get(position).getNamaProduct());
        holder.tahunProduct.setText(isiProductList.get(position).getTahunProduct());
        holder.logo.setImageResource(isiProductList.get(position).gambarProduct);
    }

    @Override
    public int getItemCount() {
        return isiProductList.size();
    }

     class myViewHolder extends RecyclerView.ViewHolder {
        TextView namaProduct,tahunProduct;
        ImageView logo;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            namaProduct = itemView.findViewById(R.id.namaProduct);
            tahunProduct = itemView.findViewById(R.id.tahunProduct);
            logo = itemView.findViewById(R.id.gambarProduct);
        }
    }
}
