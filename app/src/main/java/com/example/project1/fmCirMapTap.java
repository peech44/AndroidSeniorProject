package com.example.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project1.adapter.adt_fmCirMap_Tap;

import static android.support.constraint.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fmCirMapTap.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fmCirMapTap#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fmCirMapTap extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private String testBdStr;

    private OnFragmentInteractionListener mListener;

    public fmCirMapTap() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmCirMapTap.
     */
    // TODO: Rename and change types and number of parameters
    public static fmCirMapTap newInstance(String param1, String param2) {
        fmCirMapTap fragment = new fmCirMapTap();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_cir_map_tap, container, false);

        View v =inflater.inflate(R.layout.fragment_fm_cir_map_tap, container, false);

        //get agrument from main
        if(getArguments() != null){

            Bundle bundle = getArguments();
            testBdStr = bundle.getString("Tbd");

        }

        //


        //send agrument to adt
        Bundle sendbundle = new Bundle();
        sendbundle.putString("Tbd", testBdStr);

        //

        final TabLayout tabLayout = (TabLayout)v.findViewById(R.id.tabLayout);

        final ViewPager vpMain = (ViewPager)v.findViewById(R.id.vpMain);
        adt_fmCirMap_Tap adt = new adt_fmCirMap_Tap(getChildFragmentManager());
        adt.setTbd(testBdStr);


        vpMain.setAdapter(adt);
        tabLayout.setupWithViewPager(vpMain);



        return v;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

   /* @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

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
