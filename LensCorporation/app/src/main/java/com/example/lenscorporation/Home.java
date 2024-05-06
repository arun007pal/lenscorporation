package com.example.lenscorporation;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Home extends Fragment {
    ImageSlider imgslider;
    TextView tv_irpof;

    Button btn1,btn2,btn3,btn4,btn5;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view= inflater.inflate(R.layout.home,container,false);

        tv_irpof=view.findViewById(R.id.tv_irpof);

        ArrayList<SlideModel> imageList = new ArrayList<>();

// Add images to the list
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage1.jpeg", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage2.jpeg",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://irpof.vercel.app/homeimage2.jpeg",ScaleTypes.CENTER_CROP));

// Assuming R and findViewById are available in your Java code
        ImageSlider imageSlider = view.findViewById(R.id.imgslider);
        imageSlider.setImageList(imageList);


        String str1="Indian Railway Promotee Officers Federation (IRPOF)\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers" +
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways."+
                "The Aim Of The Federation Is To Safeguard Interests Of Promotee Officers And Provide Better Career"+
                "Opportunities And Working Conditions. It Works For Development And Promoting Overall Efficiency In"+
                "The Working Of Railways In The Best Interest Of Common People, The Nation And The Railway Men.\n"+
                "\n"+
                "IRPOF Has Launched This Site To Keep Its Member Informed About The, Latest Activities And Share"+
                "Views On Topics Of Importance. All The Members Are Requested To Kindly Contribute To Make The"+
                "Site Useful And Meaningful.";

        btn1=view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_irpof.setText(str1);
                tv_irpof.setMovementMethod(new ScrollingMovementMethod());

            }
        });

        String str2="Our Mission\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers"+
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways."+
                "\n\n"+
                "Our Vision\n" +
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee Officers"+
                "Having Its Head Quarter At New Delhi. It Functions Through Its Member Associations. Zonal"+
                "Associations Functions Through Divisional Bodies Across All The 69 Divisions Of Indian Railways.";

        btn2=view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_irpof.setText(str2);
            }
        });


        String str3="Recent Events\n"+
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi.\n"+
                "\n"+
                "Published On: 10/02/2024"+
                "\n\n\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi."+
                "\n\n"+
                "Published On: 10/02/2024\n" +
                "\n"+
                "\n"+
                "Indian Railways Promotee Officers Federation (IRPOF) Is An Organization Of Promotee"+
                "Officers Having Its Head Quarter At New Delhi."+
                "\n\n"+
                "Published On: 10/02/2024";
        btn3=view.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_irpof.setText(str3);
            }
        });

      return view;
    }
}
