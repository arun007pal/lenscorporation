package com.example.lenscorporation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    int numCount;

    public PageAdapter(@NonNull FragmentManager fm, int numCount) {
        super(fm);
        this.numCount = numCount;
    }

    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Home home=new Home();
                return home;
            case 1:
                Organization organization=new Organization();
                return organization;

            case 2:
                Ditspanel ditspanel=new Ditspanel();
                return ditspanel;

            case 3:
                IRMS irms=new IRMS();
                return irms;

            case 4:
                EVENTS events=new EVENTS();
                return events;

            case 5:
                Seniority seniority=new Seniority();
                return seniority;

            case 6:
                Circulars circulars=new Circulars();
                return  circulars;

            case 7:
                NewsArticle newsArticle=new NewsArticle();
                return newsArticle;

            case 8:
                IRPOBF irpobf=new IRPOBF();
                return irpobf;

            case 9:
                Links links=new Links();
                return links;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numCount;
    }
}
