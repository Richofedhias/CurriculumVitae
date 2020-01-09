package com.example.curriculumvitae;


import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {
    private  BerandaFragment berandaFragment;
    private EducationFragment educationFragment;
    private ProductFragment productFragment;
    private SocialMediaFragment socialMediaFragment;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        berandaFragment = new BerandaFragment();
        educationFragment = new EducationFragment();
        productFragment = new ProductFragment();
        socialMediaFragment = new SocialMediaFragment();


        View view = inflater.inflate(R.layout.fragment_beranda, container, false);




        return view;
    }


}
