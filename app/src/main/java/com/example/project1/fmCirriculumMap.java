package com.example.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.example.project1.adapter.adt_rv_cirmap1_2_text;
import com.example.project1.adapter.adt_rv_cirmap2_text;
import com.example.project1.adapter.adt_rv_cirmap_text;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fmCirriculumMap.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fmCirriculumMap#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fmCirriculumMap extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    //firebase

    //

    public fmCirriculumMap() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmCirriculumMap.
     */
    // TODO: Rename and change types and number of parameters
    public static fmCirriculumMap newInstance(String param1, String param2) {
        fmCirriculumMap fragment = new fmCirriculumMap();
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
        //return inflater.inflate(R.layout.fragment_fm_cirriculum_map, container, false);

        View view = inflater.inflate(R.layout.fragment_fm_cirriculum_map, container, false);






        //general, core
        final RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        final RecyclerView.Adapter adapter = new adt_rv_cirmap_text();
        //general, core red course

        final RecyclerView rv1_2 = (RecyclerView)view.findViewById(R.id.recycler_2);
        rv1_2.setHasFixedSize(true);
        final RecyclerView.LayoutManager lm1_2 = new LinearLayoutManager(getActivity());
        rv1_2.setLayoutManager(lm1_2);
        final RecyclerView.Adapter adapter1_2 = new adt_rv_cirmap1_2_text();

        final List<String> Firebase_Ccourse = new ArrayList<String>();

        //



        //firebase 1
        final List<String> gg = new ArrayList<String>();
        final List<String> gg2 = new ArrayList<String>();
        final List<String> gg3 = new ArrayList<String>();



        //major
        final RecyclerView rv2 = (RecyclerView)view.findViewById(R.id.recycler2);
        rv2.setHasFixedSize(true);
        final RecyclerView.LayoutManager lm2 = new LinearLayoutManager(getActivity());
        rv2.setLayoutManager(lm2);

        final RecyclerView.Adapter adapter2 = new adt_rv_cirmap2_text();

        //firebase2
        final List<String> gg4 = new ArrayList<String>();
        final List<String> gg5 = new ArrayList<String>();
        final List<String> gg6 = new ArrayList<String>();



        //get data collect course
        List<String> collect_course = new ArrayList<String>();

        List<String> collect_courseNotPass = new ArrayList<String>();

        String Major_id = "";
        String Curriculum_id = "";
        //get agrument
        if(getArguments() != null){

            Bundle bundle3 = getArguments();

            collect_course = bundle3.getStringArrayList("key_collect_course");

            collect_courseNotPass = bundle3.getStringArrayList("key_CollectCourseNotPass");

            Major_id = bundle3.getString("key_Major_id");
            Curriculum_id = bundle3.getString("key_Curriculum_id");

            Log.d("fmcirrmap collectcS", " "+ collect_course.size());
            Log.d("fmcirrmap collectcNPS", " "+collect_courseNotPass.size());
            Log.d("fmcirrmap_Mid", " "+Major_id);
            Log.d("fmcirrmap_Curid", " "+Curriculum_id);

            for(int i=0; i<collect_course.size();i++) {
                Log.d("fmcirrmap collect c", collect_course.get(i));
            }
            for(int i=0; i<collect_courseNotPass.size();i++) {
                Log.d("fmcirrmap collect_cNP", collect_courseNotPass.get(i));
            }
            ((adt_rv_cirmap1_2_text) adapter1_2).set_adt_rv_cirmap1_2_text2(collect_course);


        }
        else {


            Log.d("fmcirrmap","not getbundle");
        }

        ((adt_rv_cirmap_text) adapter).set_collect_course(collect_course, collect_courseNotPass);
        ((adt_rv_cirmap2_text) adapter2).set_collect_course2(collect_course, collect_courseNotPass);



        //firebase
        final String Major;
        final String MajorYear;

        if(Major_id.equals("10") && Curriculum_id.equals("0001")){
            Major = "ISNE";
            MajorYear = "ISNE55";



        }
        else if(Major_id.equals("10") && Curriculum_id.equals("0002")){
            Major = "ISNE";
            MajorYear = "ISNE61";


        }
        else if(Major_id.equals("08") && Curriculum_id.equals("0002")){
            Major = "CPE";
            MajorYear = "CPE58";


        }
        else{
            Major = "ISNE";
            MajorYear = "ISNE55";
        }


        final DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        final DatabaseReference mUsersRef = mRootRef.child(Major+"/"+MajorYear);
        final DatabaseReference mCourseRef = mUsersRef.child("Course");
        final DatabaseReference mMajorCourseRef = mUsersRef.child("MajorCourse");

        mCourseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                //child = course child
                int i=1;
                for(DataSnapshot child : dataSnapshot.getChildren()){

                    Log.d("getcount",  ""+child.getChildrenCount());
                    Log.d("getkey",  ""+child.getKey());

                    Map map3 = (Map) child.getValue();

                    String code3 = String.valueOf(map3.get("Ccode"));

                    //define Collect_Ccourse
                    Firebase_Ccourse.add(code3);


                    Log.d("getcode3",  code3);

                    //
                    if(i%3==1){
                        gg.add(code3);
                    }
                    else if(i%3==2){
                        gg2.add(code3);
                    }
                    else if(i%3==0){
                        gg3.add(code3);
                    }
                    //double check
                    else {
                        gg.add(code3);
                    }


                    i++;


                }





                ((adt_rv_cirmap1_2_text) adapter1_2).set_adt_rv_cirmap1_2_text1(Firebase_Ccourse);
                ((adt_rv_cirmap_text) adapter).set_adt_rv_cirmap_text(gg,gg2,gg3 );
                rv.setAdapter(adapter);


                //rv1_2.setAdapter(adapter1_2);




            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(getContext(), "Can't connect to database \nplease open app again", Toast.LENGTH_LONG).show();

            }
        });
        //check red course
        /*result_Ccourse = Firebase_Ccourse;
        int count;
        if(collect_course.size() > Firebase_Ccourse.size()){
            count = collect_course.size();
            int j=0;
            for(int i=0;i<count;i++){
                if(Firebase_Ccourse.get(j).equals(collect_course.get(i))){
                    result_Ccourse.remove(j);

                }
                else {

                }
                j++;
            }
        }
        else {
            count = Firebase_Ccourse.size();
            int j=0;
            for(int i=0;i<count;i++){
                if(collect_course.get(j).equals(Firebase_Ccourse.get(i))){

                    result_Ccourse.remove(i);
                }
                else {

                }
                j++;
            }
        }*/
        //((adt_rv_cirmap1_2_text) adapter1_2).set_adt_rv_cirmap1_2_text(result_Ccourse);


        //
        //

        mMajorCourseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                int i=1;
                for(DataSnapshot child2: dataSnapshot.getChildren()){
                    Map map4 = (Map) child2.getValue();

                    String code4 = String.valueOf(map4.get("Ccode"));

                    if(i%3==1){
                        gg4.add(code4);
                    }
                    else if(i%3==2){
                        gg5.add(code4);
                    }
                    else if(i%3==0){
                        gg6.add(code4);
                    }
                    //double check
                    else {
                        gg4.add(code4);
                    }


                    i++;

                }
                ((adt_rv_cirmap2_text) adapter2).set_adt_rv_cirmap2_text(gg4,gg5,gg6);
                rv2.setAdapter(adapter2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        //firebase




        //((adt_rv_cirmap_text) adapter).set_adt_rv_cirmap_text(gg, gg2);
        //set adapter to display
        //rv.setAdapter(adapter);


        return view;
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
