package com.example.project1.fmDay;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project1.R;
import com.example.project1.adapterDay.adt_rv_dayfri;
import com.example.project1.adapterDay.adt_rv_daymon;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fmDayFri.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fmDayFri#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fmDayFri extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public fmDayFri() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmDayFri.
     */
    // TODO: Rename and change types and number of parameters
    public static fmDayFri newInstance(String param1, String param2) {
        fmDayFri fragment = new fmDayFri();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
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
        //return inflater.inflate(R.layout.fragment_fm_day_fri, container, false);

        View view = inflater.inflate(R.layout.fragment_fm_monday, container, false);


        if(getArguments() != null){

            Bundle bundle2 = getArguments();


            CourseNoList = bundle2.getStringArrayList("key_courseno");
            CourseTitleList = bundle2.getStringArrayList("key_coursetitle");
            FTLEC_1 = bundle2.getStringArrayList("key_FTLEC_1");
            BTLEC_1 = bundle2.getStringArrayList("key_BTLEC_1");
            DAYLEC_1 = bundle2.getStringArrayList("key_DAYLEC_1");

            ROOM = bundle2.getStringArrayList("key_ROOM");

            DAYLEC_2 = bundle2.getStringArrayList("key_DAYLEC_2");
            BTLEC_2 = bundle2.getStringArrayList("key_BTLEC_2");
            DAYLEC_2 = bundle2.getStringArrayList("key_DAYLEC_2");







        }
        else {


            Toast.makeText(getContext(),"Fail to send info monday",Toast.LENGTH_LONG).show();
        }

        final RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        final RecyclerView.Adapter adapter = new adt_rv_dayfri();

        //define list string
        ArrayList<String> CourseTitleListNew = new ArrayList<String>();
        ArrayList<String> CourseNoListNew = new ArrayList<String>();
        ArrayList<String> BTLEC_1New = new ArrayList<String>();
        ArrayList<String> FTLEC_1New = new ArrayList<String>();
        ArrayList<String> ROOMNew = new ArrayList<String>();

        for(int i=0; i <DAYLEC_1.size(); i++){

            if(DAYLEC_1.get(i).equals("07")  || DAYLEC_1.get(i).equals("11") || DAYLEC_1.get(i).equals("30") ){
                CourseTitleListNew.add(CourseTitleList.get(i));
                CourseNoListNew.add(CourseNoList.get(i));
                BTLEC_1New.add(BTLEC_1.get(i));
                FTLEC_1New.add(FTLEC_1.get(i));
                ROOMNew.add(ROOM.get(i).trim());

            }
            if(DAYLEC_2.get(i) != null) {


                if (DAYLEC_2.get(i).equals("07") || DAYLEC_2.get(i).equals("11") || DAYLEC_2.get(i).equals("30") ) {
                    CourseTitleListNew.add(CourseTitleList.get(i));
                    CourseNoListNew.add(CourseNoList.get(i));
                    BTLEC_1New.add(BTLEC_1.get(i));
                    FTLEC_1New.add(FTLEC_1.get(i));
                    ROOMNew.add(ROOM.get(i).trim());
                }

            }


        }

        if(CourseTitleListNew.isEmpty()){
            CourseTitleListNew.add("No course");
            CourseNoListNew.add("No course");
            BTLEC_1New.add("-");
            FTLEC_1New.add("-");
            ROOMNew.add("-");

        }


        ((adt_rv_dayfri) adapter).set_adt_rv_cir(CourseTitleListNew,CourseNoListNew,BTLEC_1New,FTLEC_1New,ROOMNew);




        //define set adapter

        rv.setAdapter(adapter);











        return view;



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
