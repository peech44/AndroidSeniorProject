package com.example.project1.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.project1.fmDocument;
import com.example.project1.fmProfile;
import com.example.project1.fmSholarship;

public class adt_fmCirMap_Tap extends FragmentPagerAdapter {

    public String TBD;
    public Bundle bd;

    public adt_fmCirMap_Tap(FragmentManager fm){
        super(fm);

    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0 :

                bd.putString("Tbd", TBD);
                new fmProfile().setArguments(bd);
                return new fmProfile();



            case 1 :
                return new fmDocument();
        }

        return new fmProfile();
    }

    @Override
    public int getCount(){
        return 2;
    }



    public void setTbd(String tbd){
        this.TBD = tbd;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0 :
                return "profile";

            case 1 :
                return "document";
        }
        return null;
    }


}
