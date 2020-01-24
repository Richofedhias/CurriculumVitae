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
        listProduct.add(new ProductList("TRASHCODE","2017","Website Application",R.drawable.logo));
        listProduct.add(new ProductList("I-KAMPUS","2019","Android Application",R.drawable.ikampus));
        listProduct.add(new ProductList("SICODING","2019","Android Application",R.drawable.sicoding));


        listSkill.add(new SkillList("HTML",R.drawable.html));
        listSkill.add(new SkillList("CSS",R.drawable.css));
        listSkill.add(new SkillList("BOOSTRAP",R.drawable.boostrap));
        listSkill.add(new SkillList("MYSQL",R.drawable.mysql));
        listSkill.add(new SkillList("JSON",R.drawable.json));
        listSkill.add(new SkillList("FIREBASE",R.drawable.firebase));
        listSkill.add(new SkillList("C",R.drawable.c));
        listSkill.add(new SkillList("FLUTTER",R.drawable.flutter));
        listSkill.add(new SkillList("JAVA",R.drawable.java));
        listSkill.add(new SkillList("KOTLIN",R.drawable.kotlin));
        listSkill.add(new SkillList("ADOBE XD",R.drawable.xd));
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
