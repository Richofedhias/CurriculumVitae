package com.example.curriculumvitae;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {
RecyclerView rV_skill,rV_product;
ProductAdapter adapter;
SkillAdapter skillAdapter;
ArrayList<SkillList> listSkill = new ArrayList<>();
ArrayList<ProductList> listProduct = new ArrayList<>();
View view;

    public ProductFragment() {
        listProduct.add(new ProductList("I-Kampus","2019","Android Application",R.drawable.officedesk));
        listProduct.add(new ProductList("Sicoding","2019","Android Application",R.drawable.penghargaan));

        listSkill.add(new SkillList("Java",R.drawable.officedesk));
        listSkill.add(new SkillList("Java",R.drawable.penghargaan));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product,container,false);
        rV_product = view.findViewById(R.id.rV_product);
        rV_skill = view.findViewById(R.id.rV_skill);

        rV_skill.setHasFixedSize(true);
        rV_product.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager lm2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        rV_skill.setLayoutManager(lm);
        rV_product.setLayoutManager(lm2);
        skillAdapter = new SkillAdapter(getContext(),listSkill);
        adapter = new ProductAdapter(getContext(),listProduct);
        rV_skill.setAdapter(skillAdapter);
        rV_product.setAdapter(adapter);
        return view;
    }

}
