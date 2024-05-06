package com.example.lenscorporation;

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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ImageSlider imgslider;
    TextView textView;
    RecyclerView recyclerView;
    Button btn1,btn2,btn3,btn4,btn5;

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

//        textView=findViewById(R.id.textview);
//        textView.setSelected(true);

      //  recyclerView=findViewById(R.id.recyclerview);



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
//        tabLayout.addTab(tabLayout.newTab().setText("News/Article"));
//        tabLayout.addTab(tabLayout.newTab().setText("IRPOBF"));
        tabLayout.addTab(tabLayout.newTab().setText("Links"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        //tabLayout.setupWithViewPager(viewPager);

        viewPager=findViewById(R.id.viewpager);
        PagerAdapter adapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 ||
                        tab.getPosition()==4 || tab.getPosition()==5 ||tab.getPosition()==6 || tab.getPosition()==7 ||
                        tab.getPosition()==8)
                    adapter.notifyDataSetChanged();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }


}