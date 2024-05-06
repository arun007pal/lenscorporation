package com.example.lenscorporation.senior;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.lenscorporation.R;
import com.example.lenscorporation.senior.FragmentA;
import com.example.lenscorporation.senior.FragmentB;

public class Seniority extends Fragment {
    FragmentContainerView fragment_container_view_senior;
    Button group_a,group_b;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.seniority,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragment_container_view_senior=view.findViewById(R.id.fragment_container_view_senior);
        group_a=view.findViewById(R.id.group_a);
        loadFragment(new FragmentA());
        group_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentA());
            }
        });
        view.findViewById(R.id.group_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentB());
            }
        });

    }
    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        //   FragmentManager fm = getFragmentManager();
       FragmentManager fm=getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fragment_container_view_senior, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
