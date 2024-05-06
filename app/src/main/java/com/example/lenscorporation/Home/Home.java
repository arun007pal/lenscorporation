package com.example.lenscorporation.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
//import com.example.lenscorporation.Organization.Executive_Body;
import com.example.lenscorporation.R;

import java.util.ArrayList;

public class Home extends Fragment {
    ImageSlider imgslider;
    TextView tv_irpof,textview, imp_link_tv,contact_us_tv,home_tv1,railway_tv,lane,seniority_tv,number_tv,rly_tv,IRPOBF_tv,email1_tv,email2_tv;

ImageView logo_img_view;
    Button btn1,vision,events,Images,Videos;
    FragmentContainerView fragment_container_Home;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.home,container,false);


        imp_link_tv=view.findViewById(R.id.imp_link_tv);
        contact_us_tv=view.findViewById(R.id.contact_us_tv);
        home_tv1=view.findViewById(R.id.home_tv1);
        railway_tv=view.findViewById(R.id.railway_tv);
        lane=view.findViewById(R.id.lane);
        seniority_tv=view.findViewById(R.id.seniority_tv);
        number_tv=view.findViewById(R.id.number_tv);
        rly_tv=view.findViewById(R.id.rly_tv);
        IRPOBF_tv=view.findViewById(R.id.IRPOBF_tv);
        email1_tv=view.findViewById(R.id.email1_tv);
        email2_tv=view.findViewById(R.id.email2_tv);


        logo_img_view=view.findViewById(R.id.logo_img_view);




        tv_irpof=view.findViewById(R.id.tv_irpof);
        textview=view.findViewById(R.id.textview);
        textview.setSelected(true);


        ArrayList<SlideModel> imageList = new ArrayList<>();

// Add images to the list
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage1.jpeg", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage2.jpeg",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage2.jpeg",ScaleTypes.CENTER_CROP));

// Assuming R and findViewById are available in your Java code
        ImageSlider imageSlider = view.findViewById(R.id.imgslider);
        imageSlider.setImageList(imageList);



        loadFragment(new Irpof1());
        fragment_container_Home=view.findViewById(R.id.fragment_container_Home);

        btn1=view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Irpof1());


            }
        });


        vision=view.findViewById(R.id.vision);
        vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Vision());
                //tv_irpof.setText(str2);
            }
        });



        events=view.findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new RecentEvents());

               // tv_irpof.setText(str3);
            }
        });
        Images=view.findViewById(R.id.Images);
        Images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Images());
            }
        });
        Videos=view.findViewById(R.id.Videos);
        Videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Videos());
            }
        });

      return view;
    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        //   FragmentManager fm = getFragmentManager();
        FragmentManager fm=getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fragment_container_Home, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
