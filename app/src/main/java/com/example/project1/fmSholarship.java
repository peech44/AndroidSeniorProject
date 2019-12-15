package com.example.project1;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import com.example.project1.adapter.adt_rv_ttday;
import com.example.project1.fmDay.fmDayFri;
import com.example.project1.fmDay.fmDaySat;
import com.example.project1.fmDay.fmDaySun;
import com.example.project1.fmDay.fmDayThu;
import com.example.project1.fmDay.fmDayWed;
import com.example.project1.fmDay.fmMonday;
import com.example.project1.fmDay.fmTuesday;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmSholarship extends Fragment {


    public fmSholarship() {
        // Required empty public constructor
    }



    public void whenClick(int position){

        //Toast.makeText(getContext(),"Monday", Toast.LENGTH_SHORT).show();

        if(position == 0){

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

            FragmentTransaction ft = getChildFragmentManager().beginTransaction();

            //Fragment fm = null;
            //fm = new fmMonday();

            fmMonday myfmMonday = new fmMonday();
            myfmMonday.setArguments(bundle);



            ft.replace(R.id.child_fragment_container, myfmMonday).commit();

        }

        else if(position == 1){


            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();

            //Fragment fm = null;
            //fm = new fmMonday();

            fmTuesday myfmTuesday = new fmTuesday();
            myfmTuesday.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfmTuesday).commit();

        }
        else if(position == 2){

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();

            //Fragment fm = null;
            //fm = new fmMonday();

            fmDayWed myfmDayWed = new fmDayWed();
            myfmDayWed.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfmDayWed).commit();


        }
        else if(position == 3){

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();


            fmDayThu myfm = new fmDayThu();
            myfm.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfm).commit();

        }
        else if(position == 4){

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();

            fmDayFri myfm = new fmDayFri();
            myfm.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfm).commit();
        }
        else if(position == 5){

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();


            fmDaySat myfm = new fmDaySat();
            myfm.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfm).commit();

        }

        else if(position == 6){


            Bundle bundle = new Bundle();
            bundle.putStringArrayList("key_courseno", CourseNoList);
            bundle.putStringArrayList("key_coursetitle", CourseTitleList);

            bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
            bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
            bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
            bundle.putStringArrayList("key_ROOM", ROOM);

            bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
            bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
            bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


            FragmentTransaction ft = getChildFragmentManager().beginTransaction();

            fmDaySun myfm = new fmDaySun();
            myfm.setArguments(bundle);


            ft.replace(R.id.child_fragment_container, myfm).commit();
        }

    }

    private ArrayList<String> CourseNoList = new ArrayList<String>();
    private ArrayList<String> CourseTitleList = new ArrayList<String>();
    private ArrayList<String> DAYLEC_1 = new ArrayList<String>();
    private ArrayList<String> BTLEC_1 = new ArrayList<String>();
    private ArrayList<String> FTLEC_1 = new ArrayList<String>();
    private ArrayList<String> ROOM = new ArrayList<String>();

    private ArrayList<String> DAYLEC_2 = new ArrayList<String>();
    private ArrayList<String> BTLEC_2 = new ArrayList<String>();
    private ArrayList<String> FTLEC_2 = new ArrayList<String>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_sholarship, container, false);

        View view = inflater.inflate(R.layout.fragment_fm_sholarship, container, false);
        //
        if(getArguments() != null){

            Bundle bundle2 = getArguments();


            CourseNoList = bundle2.getStringArrayList("key_courseno");
            CourseTitleList = bundle2.getStringArrayList("key_coursetitle");
            DAYLEC_1 = bundle2.getStringArrayList("key_DAYLEC_1");
            BTLEC_1 = bundle2.getStringArrayList("key_BTLEC_1");

            FTLEC_1 = bundle2.getStringArrayList("key_FTLEC_1");
            ROOM = bundle2.getStringArrayList("key_ROOM");

            DAYLEC_2 = bundle2.getStringArrayList("key_DAYLEC_2");
            BTLEC_2 = bundle2.getStringArrayList("key_BTLEC_2");
            FTLEC_2 = bundle2.getStringArrayList("key_BTLEC_2");







        }
        else {


            Toast.makeText(getContext(),"Fail to send info fm sholar",Toast.LENGTH_LONG).show();
        }

        //
        for(int i=0;i<CourseNoList.size();i++){
            Log.d("fmsch1"," "+CourseNoList.get(i));
            //Log.d("fmsch1Room"," "+ROOM.get(i));
            //Log.d("fmsch1DAYLEC_1"," "+DAYLEC_1.get(i));
            //Log.d("fmsch1BTLEC_1"," "+BTLEC_1.get(i));
            //Log.d("fmsch1FTLEC_1"," "+FTLEC_1.get(i));
        }




        List<String> lst1 = new ArrayList<String>();
        lst1.add("    Monday    ");
        lst1.add("    Tuesday    ");
        lst1.add("    Wednesday    ");
        lst1.add("    Thursday    ");
        lst1.add("    Friday    ");
        lst1.add("    Saturday    ");
        lst1.add("    Sunday    ");

        Log.d("fmschol"," "+lst1.size());



        //

        final RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler1);
        rv.setHasFixedSize(true);

        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(lm);

        final RecyclerView.Adapter adapter = new adt_rv_ttday();

        ((adt_rv_ttday) adapter).set_adt_rv_ttday(lst1);





        rv.setAdapter(adapter);


        ((adt_rv_ttday) adapter).setonItemClickListener(new adt_rv_ttday.onItemClickListener() {
            @Override
            public void onItemClick(int position) {

                whenClick(position);



            }
        });




        //end of set day horizontal






        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        //define fm here


        Bundle bundle = new Bundle();
        bundle.putStringArrayList("key_courseno", CourseNoList);
        bundle.putStringArrayList("key_coursetitle", CourseTitleList);

        bundle.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
        bundle.putStringArrayList("key_BTLEC_1", BTLEC_1);
        bundle.putStringArrayList("key_FTLEC_1", FTLEC_1);
        bundle.putStringArrayList("key_ROOM", ROOM);

        bundle.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
        bundle.putStringArrayList("key_BTLEC_2", BTLEC_2);
        bundle.putStringArrayList("key_FTLEC_2", FTLEC_2);


        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        FragmentTransaction ft = getChildFragmentManager().beginTransaction();

        fmMonday myfmMonday = new fmMonday();
        myfmMonday.setArguments(bundle);



        ft.replace(R.id.child_fragment_container, myfmMonday).commit();

    }

}
