package com.example.curriculumvitae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class BerandaActivity extends AppCompatActivity {

    private BerandaFragment berandaFragment;
    private EducationFragment educationFragment;
    private ProductFragment productFragment;
    private SocialMediaFragment socialMediaFragment;
    private FrameLayout mMainFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        berandaFragment = new BerandaFragment();
        educationFragment = new EducationFragment();
        productFragment = new ProductFragment();
        socialMediaFragment = new SocialMediaFragment();
        mMainFrame = findViewById(R.id.fragment_container);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        setFragment(berandaFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_beranda:
                        setFragment(berandaFragment);
                        break;
                    case R.id.nav_product:
                        setFragment(productFragment);
                        break;
                    case R.id.nav_education:
                        setFragment(educationFragment);
                        break;
                    case R.id.nav_sosmed:
                        setFragment(socialMediaFragment);
                        break;
                }

                return true;
            }

        });

    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}
