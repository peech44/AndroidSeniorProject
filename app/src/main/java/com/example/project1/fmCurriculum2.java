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
import android.widget.Button;
import android.widget.Toast;

import com.example.project1.adapter.adt_rv_cirmap1_2_text;
import com.example.project1.adapter.adt_rv_cirmap_text;
import com.example.project1.adapter.adt_rv_cur2;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.project1.curr2_class;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fmCurriculum2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fmCurriculum2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fmCurriculum2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // รับค่าจาก main
    private String Major_id = "";
    private String Curriculum_id = "";

    private ArrayList<String> CollectCourse = new ArrayList<String>();
    private ArrayList<String> CollectCourseNotPass = new ArrayList<String>();


    private ArrayList<String> CourseCcode = new ArrayList<String>();
    private ArrayList<String> CourseCname = new ArrayList<String>();
    private ArrayList<String> Cyear = new ArrayList<String>();
    private ArrayList<String> Csemester = new ArrayList<String>();

    private ArrayList<String> MajorCourseCcode = new ArrayList<String>();
    private ArrayList<String> MajorCourseCname = new ArrayList<String>();
    private ArrayList<String> MCyear = new ArrayList<String>();
    private ArrayList<String> MCsemester = new ArrayList<String>();

    //end main


    private ArrayList<String> y1s1No = new ArrayList<String>();
    private ArrayList<String> y1s1Title = new ArrayList<String>();
    private ArrayList<String> y1s2No = new ArrayList<String>();
    private ArrayList<String> y1s2Title = new ArrayList<String>();
    private ArrayList<String> y2s1No = new ArrayList<String>();
    private ArrayList<String> y2s1Title = new ArrayList<String>();
    private ArrayList<String> y2s2No = new ArrayList<String>();
    private ArrayList<String> y2s2Title = new ArrayList<String>();
    private ArrayList<String> y3s1No = new ArrayList<String>();
    private ArrayList<String> y3s1Title = new ArrayList<String>();
    private ArrayList<String> y3s2No = new ArrayList<String>();
    private ArrayList<String> y3s2Title = new ArrayList<String>();
    private ArrayList<String> y4s1No = new ArrayList<String>();
    private ArrayList<String> y4s1Title = new ArrayList<String>();
    private ArrayList<String> y4s2No = new ArrayList<String>();
    private ArrayList<String> y4s2Title = new ArrayList<String>();

    //collect prerequsitenotpass
    private ArrayList<String> PreNotPass = new ArrayList<String>();

    private ArrayList<String>  PrerequisiteCourse = new ArrayList<String>();
    private ArrayList<String>  PrerequisiteMajorCourse = new ArrayList<String>();

    //collect prerequsitepass
    private ArrayList<String> PrePass = new ArrayList<String>();

    //current
    private ArrayList<String> courseno_list = new ArrayList<String>();

    //temp reset whenclick

    private ArrayList<String> tempPreNotPass = new ArrayList<String>();
    private ArrayList<String> tempCollectCourse = new ArrayList<String>();
    private ArrayList<String> tempCollectCourseNotPass = new ArrayList<String>();

    private ArrayList<String> tempcourseno_list = new ArrayList<String>();
    private ArrayList<String> tempPrePass = new ArrayList<String>();




    //
    private curr2_class Curr2_class = new curr2_class();

    private int dataLv=0;
    private MainActivity mainActivity;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }





    private OnFragmentInteractionListener mListener;

    public fmCurriculum2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmCurriculum2.
     */
    // TODO: Rename and change types and number of parameters
    public static fmCurriculum2 newInstance(String param1, String param2) {
        fmCurriculum2 fragment = new fmCurriculum2();
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
            //mParam1 = getArguments().getString(ARG_PARAM1);
            //mParam2 = getArguments().getString(ARG_PARAM2);
            Bundle bundle3 = getArguments();

            courseno_list = bundle3.getStringArrayList("key_coursenotemp");
            Major_id = bundle3.getString("key_Major_id");
            Curriculum_id = bundle3.getString("key_Curriculum_id");

            CollectCourse = bundle3.getStringArrayList("key_collect_course");
            CollectCourseNotPass = bundle3.getStringArrayList("key_CollectCourseNotPass");


            CourseCcode = bundle3.getStringArrayList("key_CourseCcode");
            CourseCname = bundle3.getStringArrayList("key_CourseCname");
            Cyear = bundle3.getStringArrayList("key_Cyear");
            Csemester = bundle3.getStringArrayList("key_Csemester");

            MajorCourseCcode = bundle3.getStringArrayList("key_MajorCourseCcode");
            MajorCourseCname = bundle3.getStringArrayList("key_MajorCourseCname");
            MCyear = bundle3.getStringArrayList("key_MCyear");
            MCsemester = bundle3.getStringArrayList("key_MCsemester");

            PrerequisiteCourse = bundle3.getStringArrayList("key_PrerequisiteCourse");
            PrerequisiteMajorCourse = bundle3.getStringArrayList("key_PrerequisiteMajorCourse");

            dataLv = bundle3.getInt("key_dataChecklv");

            Log.d("fmCurargudataLv", ""+dataLv);

            if(dataLv == 1){
                tempCollectCourse = bundle3.getStringArrayList("key_collect_course_temp");
                tempCollectCourseNotPass = bundle3.getStringArrayList("key_CollectCourseNotPass_temp");
                tempPreNotPass = findPrenotPass(tempCollectCourseNotPass);


                mainActivity.doByFragment(0);
                mainActivity.doByFragment2(CollectCourse, CollectCourseNotPass);
            }
            else{

                //tempCollectCourse = bundle3.getStringArrayList("key_temp1");
                //tempCollectCourseNotPass = bundle3.getStringArrayList("key_temp2");
                //tempPreNotPass = findPrenotPass(tempCollectCourseNotPass);

            }

            //set temp
            tempCollectCourse = bundle3.getStringArrayList("key_collect_course_temp");
            tempCollectCourseNotPass = bundle3.getStringArrayList("key_CollectCourseNotPass_temp");
            tempPreNotPass = findPrenotPass(tempCollectCourseNotPass);
            tempPrePass = findPrenotPass(tempCollectCourse);
            tempcourseno_list = bundle3.getStringArrayList("key_courseno");






            //

            Log.d("fmCurargu", ""+CourseCcode.size());
            Log.d("fmCurargu2", ""+Cyear.size());

            Log.d("fmCurargu3", ""+MajorCourseCname.size());
            Log.d("fmCurargu4", ""+MCyear.size());
            Log.d("fmCurargu4_1", ""+PrerequisiteCourse.size());
            Log.d("fmCurargu4_2", ""+PrerequisiteMajorCourse.size());
            Log.d("fmCurargu4_3", ""+tempCollectCourse.size());
            Log.d("fmCurargu4_4", ""+tempCollectCourseNotPass.size());
            Log.d("fmCurargu4_5", ""+CollectCourse.size());
            Log.d("fmCurargu4_6", ""+CollectCourseNotPass.size());



        }
        else {


            Log.d("fmcurrmap2","not getbundle");
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_curriculum2, container, false);
        View view = inflater.inflate(R.layout.fragment_fm_curriculum2, container, false);



        //firebase
        // add Course to y1s1

        for(int i=0;i<Cyear.size();i++){
            if(Cyear.get(i).equals("1") && Csemester.get(i).equals("1")){
                y1s1No.add(CourseCcode.get(i));
                y1s1Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("1") && Csemester.get(i).equals("2")){
                y1s2No.add(CourseCcode.get(i));
                y1s2Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("2") && Csemester.get(i).equals("1")){
                y2s1No.add(CourseCcode.get(i));
                y2s1Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("2") && Csemester.get(i).equals("2")){
                y2s2No.add(CourseCcode.get(i));
                y2s2Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("3") && Csemester.get(i).equals("1")){
                y3s1No.add(CourseCcode.get(i));
                y3s1Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("3") && Csemester.get(i).equals("2")){
                y3s2No.add(CourseCcode.get(i));
                y3s2Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("4") && Csemester.get(i).equals("1")){
                y4s1No.add(CourseCcode.get(i));
                y4s1Title.add(CourseCname.get(i));
            }
            else if(Cyear.get(i).equals("4") && Csemester.get(i).equals("2")){
                y4s2No.add(CourseCcode.get(i));
                y4s2Title.add(CourseCname.get(i));
            }
        }

        //add major to y1s1

        for(int i=0; i<MCyear.size(); i++){

            if(MCyear.get(i).equals("1") && MCsemester.get(i).equals("1")){
                y1s1No.add(MajorCourseCcode.get(i));
                y1s1Title.add(MajorCourseCname.get(i));
            }

            else if(MCyear.get(i).equals("1") && MCsemester.get(i).equals("2")){
                y1s2No.add(MajorCourseCcode.get(i));
                y1s2Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("2") && MCsemester.get(i).equals("1")){
                y2s1No.add(MajorCourseCcode.get(i));
                y2s1Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("2") && MCsemester.get(i).equals("2")){
                y2s2No.add(MajorCourseCcode.get(i));
                y2s2Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("3") && MCsemester.get(i).equals("1")){
                y3s1No.add(MajorCourseCcode.get(i));
                y3s1Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("3") && MCsemester.get(i).equals("2")){
                y3s2No.add(MajorCourseCcode.get(i));
                y3s2Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("4") && MCsemester.get(i).equals("1")){
                y4s1No.add(MajorCourseCcode.get(i));
                y4s1Title.add(MajorCourseCname.get(i));

            }
            else if(MCyear.get(i).equals("4") && MCsemester.get(i).equals("2")){
                y4s2No.add(MajorCourseCcode.get(i));
                y4s2Title.add(MajorCourseCname.get(i));

            }
        }

        //define head text year, semester

        final ArrayList<String> lstyear = new ArrayList<String>();
        ArrayList<String> lstsemester = new ArrayList<String>();

        lstyear.add("Year 1");
        lstyear.add("Year 1");
        lstyear.add("Year 2");
        lstyear.add("Year 2");
        lstyear.add("Year 3");
        lstyear.add("Year 3");
        lstyear.add("Year 4");
        lstyear.add("Year 4");

        //lstyear.add("Major");
        //lstyear.add("Major");

        lstsemester.add("semester 1");
        lstsemester.add("semester 2");
        lstsemester.add("semester 1");
        lstsemester.add("semester 2");
        lstsemester.add("semester 1");
        lstsemester.add("semester 2");
        lstsemester.add("semester 1");
        lstsemester.add("semester 2");

        //lstsemester.add("Elective");
        //lstsemester.add("Elective");

        //end of define year semester

        //define PrenotPast

        PreNotPass = findPrenotPass(CollectCourseNotPass);

        PrePass = findPrenotPass(CollectCourse);

        //end of define PrenotPast

        //

        //

        final RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        //very important prevent duplicate every 5 view
        rv.setItemViewCacheSize(10);



        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(lm);
        final RecyclerView.Adapter adapter = new adt_rv_cur2();

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2head(lstyear,lstsemester);
        ((adt_rv_cur2) adapter).set_adt_rv_cur_2y1s1(y1s1No,y1s1Title);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2y1s2(y1s2No, y1s2Title);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2y2(y2s1No, y2s1Title, y2s2No, y2s2Title);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2y3(y3s1No,y3s1Title,y3s2No,y3s2Title);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2y4(y4s1No,y4s1Title,y4s2No,y4s2Title);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);

        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



        rv.setAdapter(adapter);
        //

        //button click to default
        Button btn1 = (Button)view.findViewById(R.id.button9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /*Log.d("fmcur2btn1", "clicked");
                for(int i=0;i<tempCollectCourse.size();i++){
                    Log.d("fmcur2btn1_1", " "+tempCollectCourse.get(i));
                }
                ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(tempCollectCourse);

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(tempCollectCourseNotPass);

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(tempPreNotPass);*/

                CollectCourse.clear();
                CollectCourseNotPass.clear();
                PreNotPass.clear();
                courseno_list.clear();
                PrePass.clear();

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);

                ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);





               rv.setAdapter(adapter);
            }
        });


        //end of button click to default


        //start onclick listener

        ((adt_rv_cur2) adapter).setonItemClickListener(new adt_rv_cur2.onItemClickListener() {
            @Override
            public void onItemClick(int position) {

            }

            @Override
            public void onText3ColorChange(int position) {

                whenOnTextClick3(position, rv, adapter, 0);


            }

            @Override
            public void onText4ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 1);

            }

            @Override
            public void onText5ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 2);


            }

            @Override
            public void onText6ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 3);


            }

            @Override
            public void onText7ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 4);


            }

            @Override
            public void onText8ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 5);


            }

            @Override
            public void onText9ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 6);


            }

            @Override
            public void onText10ColorChange(int position) {
                whenOnTextClick3(position, rv, adapter, 7);


            }
        });



        //end of onclick listener






        return view;





    }
    //function find PrenotPass
    public ArrayList<String> findPrenotPass(ArrayList<String> collectcoursenotpass){

        ArrayList<String> tempPrenotPast = new ArrayList<String>();

        for(int i=0; i< collectcoursenotpass.size(); i++){
            Log.d("fmcur2_preProcess_2", "get In for i= " + i);

            for(int k=0; k< PrerequisiteCourse.size(); k++ ){
                Log.d("fmcur2_preProcess_3", "get In for k= " + k);
                String pre1 = "";
                String pre2 = "";
                String pre3 = "";
                String pre4 = "";

                Log.d("fmcur2_preProcess_4", " length " + PrerequisiteCourse.get(k).length());

                switch (PrerequisiteCourse.get(k).length()) {


                    case 1:
                        pre1 = PrerequisiteCourse.get(k);
                        break;


                    case 6:
                        pre1 = PrerequisiteCourse.get(k).substring(0, 6);
                        break;


                    case 13:
                        pre1 = PrerequisiteCourse.get(k).substring(0, 6);
                        pre2 = PrerequisiteCourse.get(k).substring(7, 13);
                        break;


                    case 20:
                        pre1 = PrerequisiteCourse.get(k).substring(0, 6);
                        pre2 = PrerequisiteCourse.get(k).substring(7, 13);
                        pre3 = PrerequisiteCourse.get(k).substring(14, 20);
                        break;


                    case 27:
                        pre1 = PrerequisiteCourse.get(k).substring(0, 6);
                        pre2 = PrerequisiteCourse.get(k).substring(7, 13);
                        pre3 = PrerequisiteCourse.get(k).substring(14, 20);
                        pre4 = PrerequisiteCourse.get(k).substring(21, 27);
                        break;


                    default:
                        pre1 = PrerequisiteCourse.get(k);
                        break;

                }

                if (collectcoursenotpass.get(i).equals(pre1) || collectcoursenotpass.get(i).equals(pre2) || collectcoursenotpass.get(i).equals(pre3) || collectcoursenotpass.get(i).equals(pre4)) {


                    tempPrenotPast.add(CourseCcode.get(k));

                }


            }


            for(int j=0; j<PrerequisiteMajorCourse.size(); j++){

                Log.d("fmcur2_preProcess_5", "get In for j= " + j);

                String Mpre1 = "";
                String Mpre2 = "";
                String Mpre3 = "";
                String Mpre4 = "";


                Log.d("fmcur2_preProcess_6", " length " + PrerequisiteMajorCourse.get(j).length());


                switch (PrerequisiteMajorCourse.get(j).length()) {


                    case 1:
                        Mpre1 = PrerequisiteMajorCourse.get(j);
                        break;

                    case 6:

                        Mpre1 = PrerequisiteMajorCourse.get(j).substring(0, 6);
                        break;

                    case 13:
                        Mpre1 = PrerequisiteMajorCourse.get(j).substring(0, 6);
                        Mpre2 = PrerequisiteMajorCourse.get(j).substring(7, 13);
                        break;

                    case 20:
                        Mpre1 = PrerequisiteMajorCourse.get(j).substring(0, 6);
                        Mpre2 = PrerequisiteMajorCourse.get(j).substring(7, 13);
                        Mpre3 = PrerequisiteMajorCourse.get(j).substring(14, 20);
                        break;


                    case 27:

                        Mpre1 = PrerequisiteMajorCourse.get(j).substring(0, 6);
                        Mpre2 = PrerequisiteMajorCourse.get(j).substring(7, 13);
                        Mpre3 = PrerequisiteMajorCourse.get(j).substring(14, 20);
                        Mpre4 = PrerequisiteMajorCourse.get(j).substring(21, 27);
                        break;


                    default:
                        Mpre1 = PrerequisiteMajorCourse.get(j);
                        break;

                }

                if (collectcoursenotpass.get(i).equals(Mpre1) || collectcoursenotpass.get(i).equals(Mpre2) || collectcoursenotpass.get(i).equals(Mpre3) || collectcoursenotpass.get(i).equals(Mpre4)) {

                    tempPrenotPast.add(MajorCourseCcode.get(j));

                }

            }


        }

        Log.d("fmcur2PreCode", " " + tempPrenotPast.size());
        for(int i=0;i<tempPrenotPast.size();i++){
            Log.d("fmcur2PreCode", " " + tempPrenotPast.get(i));
        }




        return tempPrenotPast;

    }



    //function switch color onclick
    public void whenOnTextClick3(int position, RecyclerView rv, RecyclerView.Adapter adapter, int textid){


        Log.d("fmCurr2onTextchangeid", "in"+textid);


        if(position == 0){
            if(y1s1No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y1s1No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y1s1No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y1s1No.get(textid));
                        if(y1s1No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y1s1No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y1s1No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }



        }

        else if(position == 1){

            if(y1s2No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y1s2No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass.clear();
                        PreNotPass.clear();
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y1s2No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);

                            PreNotPass.clear();
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y1s2No.get(textid));
                        if(y1s2No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y1s2No.get(textid));
                            PrePass.clear();
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y1s2No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }

        else if(position == 2){

            if(y2s1No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y2s1No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y2s1No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y2s1No.get(textid));
                        if(y2s1No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y2s1No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y2s1No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }

        else if(position == 3){

            if(y2s2No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y2s2No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y2s2No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y2s2No.get(textid));
                        if(y2s2No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y2s2No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y2s2No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }

        else if(position == 4){

            if(y3s1No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y3s1No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y3s1No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y3s1No.get(textid));
                        if(y3s1No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y3s1No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y3s1No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }

        else if(position == 5){

            if(y3s2No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y3s2No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y3s2No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y3s2No.get(textid));
                        if(y3s2No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y3s2No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y3s2No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }

        else if(position == 6){

            if(y4s1No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y4s1No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y4s1No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y4s1No.get(textid));
                        if(y4s1No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y4s1No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y4s1No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }
        }
        else if(position == 7){

            if(y4s2No.size() >= (textid+1) ){
                Log.d("fmCurr2onTextchange", "in");

                int colorCheck=0;

                //for green to red
                for(int i=0;i<CollectCourse.size();i++){

                    if(y4s2No.get(textid).equals(CollectCourse.get(i))){

                        colorCheck = 1;
                        CollectCourseNotPass.add(CollectCourse.get(i));
                        CollectCourse.remove(i);
                        PrePass = findPrenotPass(CollectCourse);
                        PreNotPass = findPrenotPass(CollectCourseNotPass);

                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                        ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);



                        //rv.setAdapter(adapter);


                    }

                }
                //for red to white

                if(colorCheck == 0){
                    for(int i=0;i<CollectCourseNotPass.size();i++){
                        if(y4s2No.get(textid).equals(CollectCourseNotPass.get(i))){
                            CollectCourseNotPass.remove(i);
                            PreNotPass = findPrenotPass(CollectCourseNotPass);

                            colorCheck = 1;
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                            //rv.setAdapter(adapter);

                        }
                    }

                }





                //for blue to green
                if(colorCheck == 0){

                    for(int i=0;i<courseno_list.size(); i++){


                        Log.d("fmCurr2onTextchx_get", "in"+y4s2No.get(textid));
                        if(y4s2No.get(textid).equals(courseno_list.get(i))){
                            Log.d("fmCurr2onTextchx_getin", "in"+courseno_list.get(i));
                            colorCheck = 1;
                            CollectCourse.add(y4s2No.get(textid));
                            PrePass = findPrenotPass(CollectCourse);
                            courseno_list.remove(i);

                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                            ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);

                        }
                    }


                }

                //for white to blue
                if(colorCheck == 0){

                    courseno_list.add(y4s2No.get(textid));


                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collect(CollectCourse);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2collectNotpass(CollectCourseNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2preNotPass(PreNotPass);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2cuurent(courseno_list);
                    ((adt_rv_cur2) adapter).set_adt_rv_cur_2prePass(PrePass);


                }


                rv.setAdapter(adapter);
                adapter.notifyItemChanged(position);
                rv.scrollToPosition(position);






            }


        }



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
        Log.d("fmcur_onDetach", "in");
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
