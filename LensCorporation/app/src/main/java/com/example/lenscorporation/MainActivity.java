package com.example.lenscorporation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



  //  RecyclerView    recyclerview=findViewById(R.id.recyclerview);
//        recyclerview.setLayoutManager(new LinearLayoutManager(this));



        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Lenscarporation");

        setSupportActionBar(toolbar);


        tabLayout=findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Organization"));
        tabLayout.addTab(tabLayout.newTab().setText("DITS/Panel"));
        tabLayout.addTab(tabLayout.newTab().setText("IRMS"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.addTab(tabLayout.newTab().setText("Seniority"));
        tabLayout.addTab(tabLayout.newTab().setText("Circulars"));
        tabLayout.addTab(tabLayout.newTab().setText("News/Article"));
        tabLayout.addTab(tabLayout.newTab().setText("IRPOBF"));
        tabLayout.addTab(tabLayout.newTab().setText("Links"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        viewPager=findViewById(R.id.viewpager);
        PagerAdapter adapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);



// Assuming SlideModel and ImageSlider are equivalent classes in Java


//        btn1=findViewById(R.id.btn1);
//        btn2=findViewById(R.id.btn2);
//        btn3=findViewById(R.id.btn3);
//        btn4=findViewById(R.id.btn4);
//        btn5=findViewById(R.id.btn5);
//
//       // recyclerview=findViewById(R.id.recyclerview);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                irpof_tv=findViewById(R.id.irpof_tv);
//                Intent intent=new Intent(MainActivity.this,Button1.class);
//                startActivity(intent);
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(MainActivity.this,Mission.class);
//                startActivity(i);
//            }
//        });



    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}