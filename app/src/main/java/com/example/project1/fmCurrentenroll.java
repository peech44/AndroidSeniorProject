package com.example.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project1.adapter.adt_rv_cir;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fmCurrentenroll.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fmCurrentenroll#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fmCurrentenroll extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ArrayList<String> courseno_list = new ArrayList<String>();
    private ArrayList<String>  coursetitle_list = new ArrayList<String>();
    private ArrayList<String>  crelec_list = new ArrayList<String>();
    private ArrayList<String>  crelab_list = new ArrayList<String>();
    private ArrayList<String> PrerequisiteCode = new ArrayList<String>();
    private ArrayList<String> PrerequisiteName = new ArrayList<String>();

    private OnFragmentInteractionListener mListener;

    public fmCurrentenroll() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmCurrentenroll.
     */
    // TODO: Rename and change types and number of parameters
    public static fmCurrentenroll newInstance(String param1, String param2) {
        fmCurrentenroll fragment = new fmCurrentenroll();
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
            Bundle bundle4 = getArguments();
            //mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
            courseno_list = bundle4.getStringArrayList("key_courseno");
            coursetitle_list = bundle4.getStringArrayList("key_coursetitle");
            crelec_list = bundle4.getStringArrayList("key_crelec_list");
            crelab_list = bundle4.getStringArrayList("key_crelab_list");
            PrerequisiteCode = bundle4.getStringArrayList("key_PrerequisiteCode");
            PrerequisiteName = bundle4.getStringArrayList("key_PrerequisiteName");


        }

        else{
            Log.d("fmcurenroll","not getbundle");
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_currentenroll, container, false);

        View view = inflater.inflate(R.layout.fragment_fm_currentenroll, container, false);

        RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        rv.setItemViewCacheSize(10);

        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());

        rv.setLayoutManager(lm);

        final RecyclerView.Adapter adapter = new adt_rv_cir();

        ((adt_rv_cir) adapter).set_adt_rv_cir(coursetitle_list,courseno_list,crelec_list,crelab_list);
        ((adt_rv_cir) adapter).set_adt_rv_cir_2(PrerequisiteCode, PrerequisiteName);

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
