package com.example.curriculumvitae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Toast;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem
                ("About Me", ContextCompat.getColor(this, R.color.backgroundnavyNavbar), R.drawable.man);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("Product", ContextCompat.getColor(this, R.color.backgroundnavyNavbar), R.drawable.officedesk);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("Education", ContextCompat.getColor(this, R.color.backgroundnavyNavbar), R.drawable.ic_school_black_24dp);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("Social Media", ContextCompat.getColor(this, R.color.backgroundnavyNavbar), R.drawable.conversation);
        bottomNavigationView.addTab(bottomNavigationItem);
        bottomNavigationView.addTab(bottomNavigationItem1);
        bottomNavigationView.addTab(bottomNavigationItem2);
        bottomNavigationView.addTab(bottomNavigationItem3);

        bottomNavigationView.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                Toast.makeText(BerandaActivity.this, "Item " +index +" clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
