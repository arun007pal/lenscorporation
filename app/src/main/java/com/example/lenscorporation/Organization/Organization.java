package com.example.lenscorporation.Organization;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lenscorporation.R;

public class Organization extends Fragment {
    FragmentContainerView fragment_container_Organization;
    Button Constitution,Executive_Body,Constituent_Units,Incumbency_Board;
    RecyclerView recyclerview2;
    ScrollView scrollview;
 TextView textview11;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.organization,container,false);
        fragment_container_Organization=view.findViewById(R.id.fragment_container_Organization);
        Constitution=view.findViewById(R.id.Constitution);
        loadFragment(new Constitution());
        Constitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Constitution());
            }
        });

        Executive_Body=view.findViewById(R.id.Executive_Body);
        Executive_Body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Executive_Body());
            }
        });
        Constituent_Units=view.findViewById(R.id.Constituent_Units);
        Constituent_Units.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Constituent_Units());
            }
        });
        Incumbency_Board=view.findViewById(R.id.Incumbency_Board);
       Incumbency_Board.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               loadFragment(new Incumbency_Board());
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
        fragmentTransaction.replace(R.id.fragment_container_Organization, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
