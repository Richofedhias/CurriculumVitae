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
public class SocialMediaFragment extends Fragment {
    RecyclerView rV_sosmed;
    SosmedAdapter adapter;
    ArrayList<SosmedList> listSosmed = new ArrayList<>();

    public SocialMediaFragment() {
        // Required empty public constructor
        listSosmed.add(new SosmedList("Richofedhias", R.drawable.github));
        listSosmed.add(new SosmedList("fedhia64@gmail.com", R.drawable.gmail));
        listSosmed.add(new SosmedList("richofedhia", R.drawable.instagram));
        listSosmed.add(new SosmedList("082332817200", R.drawable.wa));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social_media, container, false);
        rV_sosmed = view.findViewById(R.id.rV_sosmed);


        rV_sosmed.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rV_sosmed.setLayoutManager(lm);
        adapter = new SosmedAdapter(getContext(), listSosmed);
        rV_sosmed.setAdapter(adapter);
        return view;
    }

}
