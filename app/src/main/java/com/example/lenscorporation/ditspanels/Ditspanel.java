package com.example.lenscorporation.ditspanels;

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

public class Ditspanel extends Fragment {
    Button dits,panel_group,panel_jag;
    FragmentContainerView fragment_container_dits;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dits_panel,container,false);
        fragment_container_dits=view.findViewById(R.id.fragment_container_dits);
        dits=view.findViewById(R.id.dits);
        loadFragment(new DITS());
        dits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new DITS());
            }
        });
        panel_group=view.findViewById(R.id.panel_group);
        panel_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new PanelGroupA());
            }
        });
        panel_jag=view.findViewById(R.id.panel_jag);
        panel_jag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new PanelJAG());
            }
        });

        return  view;
    }
    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        //   FragmentManager fm = getFragmentManager();
        FragmentManager fm=getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fragment_container_dits, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}
