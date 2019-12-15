package com.example.project1;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.view.MotionEvent;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.adapter.adt_rv_cir;
import com.example.project1.adapter.adt_rv_cirmap1_2_text;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */


///////////////////////--------------------






///////////////////////-------------------------------------

public class fmCirriculum extends Fragment {
    Toolbar toolbar;
    Button button1;

    //send data btw activity and fmcir
    private int bondMax=0;
    private MainActivity mainActivity;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }

    public void doSomethingByActivity(int data){

        bondMax = data;
        Log.d("doSomeByActivity", ""+bondMax);
        //implement dialogue here



    }

    //
    public fmCirriculum() {
        // Required empty public constructor
    }

    private ArrayList<String> courseno_list = new ArrayList<String>();
    private ArrayList<String>  coursetitle_list = new ArrayList<String>();
    private ArrayList<String>  crelec_list = new ArrayList<String>();
    private ArrayList<String>  crelab_list = new ArrayList<String>();

    //
    private ArrayList<String>  PrerequisiteCourse = new ArrayList<String>();
    private ArrayList<String>  CourseCcode = new ArrayList<String>();
    private ArrayList<String>  CourseCname = new ArrayList<String>();

    private ArrayList<String>  PrerequisiteMajorCourse = new ArrayList<String>();
    private ArrayList<String>  MajorCourseCcode = new ArrayList<String>();
    private ArrayList<String>  MajorCourseCname = new ArrayList<String>();

    private ArrayList<String> PrerequisiteCode = new ArrayList<String>();
    private ArrayList<String> PrerequisiteName = new ArrayList<String>();

    public ArrayList<String> Enrolled = new ArrayList<String>();
    public ArrayList<String> EnrolledGrade = new ArrayList<String>();
    //majorcode เก็บไว้แล้ว
    private ArrayList<String> MajorCode = new ArrayList<String>();
    public ArrayList<String> MajorCredit = new ArrayList<String>();

    private Double RegGpax;
    private Double RegMgpax;
    private Double RegGetcredit;

    private Double Msumgradepoint;
    private Double Msumcredit;

    private Double c_credit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fm_cirriculum, container, false);
        final View view = inflater.inflate(R.layout.fragment_fm_cirriculum, container, false);


        //set bundle from main
       /* List<String> courseno_list = new ArrayList<String>();
        List<String>  coursetitle_list = new ArrayList<String>();
        List<String>  crelec_list = new ArrayList<String>();
        List<String>  crelab_list = new ArrayList<String>();

        //
        List<String>  PrerequisiteCourse = new ArrayList<String>();
        List<String>  CourseCcode = new ArrayList<String>();
        List<String>  CourseCname = new ArrayList<String>();

        List<String>  PrerequisiteMajorCourse = new ArrayList<String>();
        List<String>  MajorCourseCcode = new ArrayList<String>();
        List<String>  MajorCourseCname = new ArrayList<String>();

        List<String> PrerequisiteCode = new ArrayList<String>();
        List<String> PrerequisiteName = new ArrayList<String>();*/

        int bondLv = 0;


        //
        //List<String> prerequisiteCode = new ArrayList<String>();
        //List<String> prerequisiteName = new ArrayList<String>();


        if (getArguments() != null) {

            Bundle bundle4 = getArguments();

            //collect_course = bundle3.getStringArrayList("key_collect_course");
            courseno_list = bundle4.getStringArrayList("key_courseno");
            coursetitle_list = bundle4.getStringArrayList("key_coursetitle");
            crelec_list = bundle4.getStringArrayList("key_crelec");
            crelab_list = bundle4.getStringArrayList("key_crelab");

            //
            PrerequisiteCourse = bundle4.getStringArrayList("key_PrerequisiteCourse");
            CourseCcode = bundle4.getStringArrayList("key_CourseCcode");
            CourseCname = bundle4.getStringArrayList("key_CourseCname");

            PrerequisiteMajorCourse = bundle4.getStringArrayList("key_PrerequisiteMajorCourse");
            MajorCourseCcode = bundle4.getStringArrayList("key_MajorCourseCcode");
            MajorCourseCname = bundle4.getStringArrayList("key_MajorCourseCname");

            Enrolled = bundle4.getStringArrayList("key_Enrolled");
            EnrolledGrade = bundle4.getStringArrayList("key_EnrolledGrade");
            MajorCode = bundle4.getStringArrayList("key_MajorCourseCcode");
            MajorCredit = bundle4.getStringArrayList("key_MajorCredit");
            RegGpax = bundle4.getDouble("key_Gpax");
            RegGetcredit = bundle4.getDouble("key_Getcredit");

            c_credit = bundle4.getDouble("key_c_credit");




            bondLv = bundle4.getInt("key_dataCheckbond");


            //
            //prerequisiteCode = bundle4.getStringArrayList("key_PrerequisiteCode");
            //prerequisiteName = bundle4.getStringArrayList("key_PrerequisiteName");


            Log.d("fmcir list size", "" + courseno_list.size());
            Log.d("fmcir title size", "" + coursetitle_list.size());
            Log.d("fmcir crelec size", "" + crelec_list.size());
            Log.d("fmcir crelab size", "" + crelab_list.size());
            //Log.d("fmcir preCode size", ""+prerequisiteCode.size());
            //Log.d("fmcir prename size", ""+prerequisiteName.size());
            Log.d("fmcir PreCourse", "" + PrerequisiteCourse.size());
            Log.d("fmcir PreCourseCode", "" + CourseCcode.size());
            Log.d("fmcir PreCourseName", "" + CourseCname.size());
            Log.d("fmcir PreMCourse", "" + PrerequisiteMajorCourse.size());
            Log.d("fmcir PreMCourseCode", "" + MajorCourseCcode.size());
            Log.d("fmcir PreMCourseName", "" + MajorCourseCname.size());

            for (int i = 0; i < courseno_list.size(); i++) {
                Log.d("fmcir collect c", "" + courseno_list.get(i));
                //Log.d("fmcir title c", "" + coursetitle_list.get(i));
                //Log.d("fmcir crelec c", "" + crelec_list.get(i));
                //Log.d("fmcir crelab c", "" + crelab_list.get(i));
            }
            //((adt_rv_cirmap1_2_text) adapter1_2).set_adt_rv_cirmap1_2_text2(collect_course);


        } else {


            Log.d("fmcir", "not getbundle");
        }

        //--------
        //start process prerequisite


        int check = 1;

        for (int i = 0; i < courseno_list.size(); i++) {

            Log.d("fmcir preProcess_2", "get In for i= " + i);

            check = 1;


            for (int k = 0; k < PrerequisiteCourse.size(); k++) {
                Log.d("fmcir preProcess_3", "get In for k= " + k);
                String pre1 = "";
                String pre2 = "";
                String pre3 = "";
                String pre4 = "";

                Log.d("fmcir preProcess_4", " length " + PrerequisiteCourse.get(k).length());

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

                if (courseno_list.get(i).equals(pre1) || courseno_list.get(i).equals(pre2) || courseno_list.get(i).equals(pre3) || courseno_list.get(i).equals(pre4)) {

                    if (check == 1) {
                        PrerequisiteCode.add(CourseCcode.get(k));
                        PrerequisiteName.add(CourseCname.get(k));
                        check = 0;


                    } else {

                        String previosCode;
                        String previosName;

                        previosCode = PrerequisiteCode.get(i);
                        previosName = PrerequisiteName.get(i);

                        PrerequisiteCode.set(i, previosCode + ", " + CourseCcode.get(k));

                        PrerequisiteName.set(i, previosName + "\n" + CourseCname.get(k));

                        check = 0;


                    }


                }


            }

            for (int j = 0; j < PrerequisiteMajorCourse.size(); j++) {

                Log.d("fmcir preProcess_5", "get In for j= " + j);

                String Mpre1 = "";
                String Mpre2 = "";
                String Mpre3 = "";
                String Mpre4 = "";


                Log.d("fmcir preProcess_6", " length " + PrerequisiteMajorCourse.get(j).length());

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


                if (courseno_list.get(i).equals(Mpre1) || courseno_list.get(i).equals(Mpre2) || courseno_list.get(i).equals(Mpre3) || courseno_list.get(i).equals(Mpre4)) {

                    if (check == 1) {

                        PrerequisiteCode.add(MajorCourseCcode.get(j));

                        PrerequisiteName.add(MajorCourseCname.get(j));
                        check = 0;

                    } else {

                        String previosCode;
                        String previosName;

                        previosCode = PrerequisiteCode.get(i);
                        previosName = PrerequisiteName.get(i);

                        PrerequisiteCode.set(i, previosCode + ", " + MajorCourseCcode.get(j));

                        PrerequisiteName.set(i, previosName + "\n" + MajorCourseCname.get(j));

                        check = 0;


                    }

                }


            }

            if (check == 1) {

                PrerequisiteCode.add("none");
                PrerequisiteName.add("none");

            }

            Log.d("fmcirPreCode", " " + PrerequisiteCode.get(i));
            Log.d("fmcirPreName", " " + PrerequisiteName.get(i));


        }


        //------------------------
        //End process prerequisite


        //------------------------
        //start process major gpa

        Double gradepoint=0.00;
        Double sumgradepoint=0.00;
        Double credit=0.00;
        Double sumcredit =0.00;

        if (Enrolled != null) {


            for (int i = 0; i < Enrolled.size(); i++) {


                for (int j = 0; j < MajorCode.size(); j++) {


                    if (Enrolled.get(i).equals(MajorCode.get(j))) {

                        Log.d("fmhomeM", "" + Enrolled.get(i));
                        Log.d("fmhomeM2", "" + EnrolledGrade.get(i));


                        if (EnrolledGrade.get(i) != null) {

                            switch (EnrolledGrade.get(i)) {


                                case "A ":
                                    gradepoint = 4.00;

                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditA", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;


                                case "B+":
                                    gradepoint = 3.50;


                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditB+", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;


                                case "B ":
                                    gradepoint = 3.00;

                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditB", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;


                                case "C+":


                                    gradepoint = 2.50;


                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditC+", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;

                                case "C ":
                                    gradepoint = 2.00;

                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditC", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;

                                case "D+":
                                    gradepoint = 1.50;

                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditD+", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;

                                case "D ":
                                    gradepoint = 1.00;

                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditD", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;

                                case "F ":
                                    gradepoint = 0.00;


                                    credit = Double.valueOf(MajorCredit.get(j));
                                    Log.d("fmhomeMcreditF", "" + credit);
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint * credit);


                                    break;
                                case "W ":


                                    break;

                                case "S ":

                                    break;

                                case "U ":


                                    break;

                                case "P ":


                                    break;

                                case "null":


                                    break;


                                default:


                            }

                        }


                    }


                }

                Log.d("fmhomeMsumgp", "" + sumgradepoint);
                Log.d("fmhomeMsumcp", "" + sumcredit);
            }

        }

        Log.d("fmcirMsum",""+sumgradepoint);
        Log.d("fmcirMsum",""+sumcredit);

        RegMgpax = sumgradepoint/sumcredit;

        Msumgradepoint = sumgradepoint;
        Msumcredit = sumcredit;







        //------------------------
        //end process major gpa




        //set test view onclick
        TextView textView12 = (TextView)view.findViewById(R.id.textView12);
        TextView textView35 = (TextView)view.findViewById(R.id.textView35);

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "This is Current enroll", Toast.LENGTH_LONG).show();

                Bundle bundle = new Bundle();
                bundle.putStringArrayList("key_courseno", courseno_list);
                bundle.putStringArrayList("key_coursetitle", coursetitle_list);
                bundle.putStringArrayList("key_crelec_list", crelec_list);
                bundle.putStringArrayList("key_crelab_list", crelab_list);
                bundle.putStringArrayList("key_PrerequisiteCode", PrerequisiteCode);
                bundle.putStringArrayList("key_PrerequisiteName", PrerequisiteName);

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();

                fmCurrentenroll myfm = new fmCurrentenroll();

                myfm.setArguments(bundle);

                ft.replace(R.id.child_fragment_container, myfm).commit();



            }
        });

        textView35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "This is GPA calculator", Toast.LENGTH_LONG).show();

                Bundle bundle = new Bundle();
                bundle.putStringArrayList("key_courseno", courseno_list);
                bundle.putStringArrayList("key_coursetitle", coursetitle_list);
                bundle.putStringArrayList("key_crelec_list", crelec_list);
                bundle.putStringArrayList("key_crelab_list", crelab_list);

                bundle.putDouble("key_RegGpax", RegGpax);
                bundle.putDouble("key_RegMgpax", RegMgpax);
                bundle.putDouble("key_RegGetcredit", RegGetcredit);
                bundle.putDouble("key_Msumgradepoint", Msumgradepoint);
                bundle.putDouble("key_Msumcredit", Msumcredit);

                bundle.putStringArrayList("key_MajorCode", MajorCode);

                bundle.putDouble("key_c_credit", c_credit);





                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                fmCalculateGPA myfm = new fmCalculateGPA();
                myfm.setArguments(bundle);
                ft.replace(R.id.child_fragment_container, myfm).commit();


            }
        });





        //--------


/*

        final RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        final RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);
        final RecyclerView.Adapter adapter = new adt_rv_cir();

        ((adt_rv_cir) adapter).set_adt_rv_cir(coursetitle_list,courseno_list,crelec_list,crelab_list);

        ((adt_rv_cir) adapter).set_adt_rv_cir_2(PrerequisiteCode, PrerequisiteName);

        rv.setAdapter(adapter);
*/


        //end of recycler display

        //set layout for snackbar
        final LinearLayout mRoot = (LinearLayout) view.findViewById(R.id.mainLL);


        //set mp3 file
        //final MediaPlayer jeanne1Greeting = MediaPlayer.create(getContext(), R.raw.j);

        /*final MediaPlayer jeanne2Greeting = MediaPlayer.create(getContext(), R.raw.JeanneAlter11suggestion);
        final MediaPlayer jeanne3Bond3 = MediaPlayer.create(getContext(), R.raw.Jeanne3bond3New);
        final MediaPlayer okita4Bond2 = MediaPlayer.create(getContext(), R.raw.Okita4bound2New);
        final MediaPlayer okita5Greeting = MediaPlayer.create(getContext(), R.raw.Okita5greeting);
        final MediaPlayer okita6Bond1 = MediaPlayer.create(getContext(), R.raw.Okita6bond1);
        final MediaPlayer jeanne7Suggestion = MediaPlayer.create(getContext(), R.raw.Jeane7suggestion);
        final MediaPlayer jeanne8Suggestion = MediaPlayer.create(getContext(), R.raw.Jeanne8suggestion);
        final MediaPlayer jeanne9Suggestion = MediaPlayer.create(getContext(), R.raw.Jeanne9suggestion);

        final MediaPlayer jeannealter10Greeting = MediaPlayer.create(getContext(), R.raw.JeanneAlter10greeting);
        final MediaPlayer jeannealter11Suggestion = MediaPlayer.create(getContext(), R.raw.JeanneAlter11suggestion);

        final MediaPlayer okitaMaster = MediaPlayer.create(getContext(),R.raw.OkitaMaster);

        final MediaPlayer end1 = MediaPlayer.create(getContext(), R.raw.end1);
        final MediaPlayer end2 = MediaPlayer.create(getContext(), R.raw.end2);*/


        //not use

        /*final MediaPlayer jeanne1Greeting = MediaPlayer.create(getContext(),R.raw.jeanne1greeting);
        final MediaPlayer jeanne2Greeting = MediaPlayer.create(getContext(), R.raw.jeanne2greeting);
        final MediaPlayer jeanne3Bond3 = MediaPlayer.create(getContext(), R.raw.jeanne3bond3new);
        final MediaPlayer okita4Bond2 = MediaPlayer.create(getContext(), R.raw.okita4bound2new);
        final MediaPlayer okita5Greeting = MediaPlayer.create(getContext(), R.raw.okita5greeting);
        final MediaPlayer okita6Bond1 = MediaPlayer.create(getContext(), R.raw.okita6bond1);
        final MediaPlayer jeanne7Suggestion = MediaPlayer.create(getContext(), R.raw.jeane7suggestion);
        final MediaPlayer jeanne8Suggestion = MediaPlayer.create(getContext(), R.raw.jeanne8suggestion);
        final MediaPlayer jeanne9Suggestion = MediaPlayer.create(getContext(), R.raw.jeanne9suggestion);

        final MediaPlayer jeannealter10Greeting = MediaPlayer.create(getContext(), R.raw.jeannealter10greeting);
        final MediaPlayer jeannealter11Suggestion = MediaPlayer.create(getContext(), R.raw.jeannealter11suggestion);

        final MediaPlayer okitaMaster = MediaPlayer.create(getContext(), R.raw.okitamaster);


        final MediaPlayer end1 = MediaPlayer.create(getContext(), R.raw.end1);
        final MediaPlayer end2 = MediaPlayer.create(getContext(), R.raw.end2);*/

        //



        //
        //set dialogue
        // greeting -> suggest1 -> suggest2
        final String suggest1 = "ไม่ควรดรอปวิชาที่เป็นตัวprerequisite\nเพราะอาจจะทำให้คุณเรียนเกิน 4 ปีได้";
        final String suggest2 = "วิชาตัว prerequisite หมายถึง\nวิชาที่ต้องผ่านก่อนถึงจะเรียนวิชาถัดไปได้";
        final String suggest3 = "วิชาเมเจอร์เป็นวิชาตัวคณะหลักที่ต้องเรียน\nส่วนมากไม่เปิดให้ลงทะเบียนทุกเทอม";
        final String suggest4 = "เกรดวิชาเมเจอร์ต้องได้ไม่น้อยกว่า 2.00\nไม่งั้นจะไม่จบการศึกษา";
        final String suggest5 = "วิชา core เป็นวิชาแกนที่ต้องเรียน\nเพื่อพัฒนาทักษะของ Master";
        final String suggest6 = "วิชา core ได้แก่ calculus, physics\nMaster จะต้องผ่านไปให้ได้\nพยายามเข้า!!!";

        final String greeting1 = "Hello, My master\nHow are you today.";
        final String greeting2 ="I'm good\nHow about you, My master.";
        final String greeting3 = "I am good master\nAnd you?";

        final String master ="M...master I feel..";
        final String bond1 = "You are so nice Master\nSo friendly.";
        final String bond2 = "Umm... This is hard to say, but...\nWhen I’m with you, Master, I feel...";
        final String bond3 = "Tnank you master, therefore I shall be forever\nAnd ever be under you care,my master.";

        String alter1 = "me..?";
        String alter2 = "Well, that's to be expected.";


        //set condition of text
        //String text1 ="";

        String text2 ="";
        String text3 ="";





        int random=0;
        Random r = new Random();


        //random 0-2
        random = r.nextInt(3);



        if(random == 1){

            Log.d("fmcir_text23 ", "s1,s2 ");

            text2 = suggest1;
            text3 = suggest2;



        }
        else{

            if(PrerequisiteCourse.size() > PrerequisiteMajorCourse.size()){
                Log.d("fmcir_text23 ", "s5,s6 ");
                text2 = suggest5;
                text3 = suggest6;
            }

            else {

                Log.d("fmcir_text23 ", "s3,s4 ");

                text2 = suggest3;
                text3 = suggest4;


            }
        }

        //set sbtext

        //final String sbText1 = text1;
        final String sbText2 = text2;
        final String sbText3 = text3;




        //init fab

        if(bondLv == 1){
            Log.d("bondLv :",""+bondLv);

            final MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton)view.findViewById(R.id.fab);
            final MovableFloatingActionButton movableFloatingActionButton2 = (MovableFloatingActionButton)view.findViewById(R.id.fab2);
            movableFloatingActionButton.hide();

            movableFloatingActionButton2.setImageResource(R.drawable.imageedit_2_8692992455);

            movableFloatingActionButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String text1;
                    int random=0;
                    Random r = new Random();


                    //random 0-2
                    random = r.nextInt(3);

                    final int random2 =random;

                    Log.d("fmcir_FB2random: ", " "+random);
                    Log.d("fmcir_FB2random2: ", " "+random2);

                    if(random == 0){

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }
                    else if(random == 1){

                        text1 = greeting2;
                        //jeanne2Greeting.start();


                    }
                    else if(random == 2){

                        text1 = greeting3;
                        //okita5Greeting.start();
                    }
                    else {

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }

                    final String sbText1 = text1;


                    //Toast.makeText(getContext(), "Hello master \nhow are you today", Toast.LENGTH_LONG).show();
                    Snackbar sb = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(6000).setAction
                            ("More", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sb2 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                            ("More", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                            ("Close", new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {

                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                            ("Close", new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {

                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                            ("Close", new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {
                                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                            ("Close", new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {
                                                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                                            ("Close", new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {


                                                                                                                                }
                                                                                                                            });
                                                                                                                    //set sb3
                                                                                                                    sb3.setText(suggest4);
                                                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                                                    View view3 = sb3.getView();
                                                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                                                    tv3.setTextColor(0xFF000000);

                                                                                                                    sb3.show();


                                                                                                                }
                                                                                                            });
                                                                                                    //set sb3
                                                                                                    sb3.setText(suggest3);
                                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                                    View view3 = sb3.getView();
                                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                                    tv3.setTextColor(0xFF000000);

                                                                                                    sb3.show();


                                                                                                }
                                                                                            });
                                                                                    //set sb3
                                                                                    sb3.setText(suggest2);
                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                    View view3 = sb3.getView();
                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                    tv3.setTextColor(0xFF000000);

                                                                                    sb3.show();


                                                                                }
                                                                            });
                                                                    //set sb3
                                                                    sb3.setText(suggest1);
                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                    View view3 = sb3.getView();
                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                    tv3.setTextColor(0xFF000000);

                                                                    sb3.show();


                                                                }
                                                            });
                                                    //set sb3
                                                    sb3.setText(sbText3);
                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                    View view3 = sb3.getView();
                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                    tv3.setTextColor(0xFF000000);

                                                    sb3.show();
                                                    if(random2 == 0){

                                                        //jeanne9Suggestion.start();
                                                    }
                                                    else if(random2 == 1){

                                                        //jeanne8Suggestion.start();

                                                    }
                                                    else {
                                                        //jeanne7Suggestion.start();
                                                    }




                                                }
                                            });

                                    //set sb2
                                    sb2.setText(sbText2);
                                    sb2.setActionTextColor(0xFF7EACDC);

                                    View view2 = sb2.getView();
                                    TextView tv2 = (TextView)view2.findViewById(android.support.design.R.id.snackbar_text);
                                    tv2.setBackgroundColor(0xFF83CCEB);
                                    tv2.setTextColor(0xFF000000);

                                    sb2.show();

                                    if(random2 == 0){

                                        //jeanne7Suggestion.start();
                                    }
                                    else if(random2 == 1){

                                        //jeanne9Suggestion.start();

                                    }
                                    else {
                                        //jeanne8Suggestion.start();
                                    }



                                }
                            });

                    //set sb
                    sb.setText(sbText1);

                    sb.setActionTextColor(0xFF7EACDC);

                    View view1 = sb.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFF83CCEB);
                    tv.setTextColor(0xFF000000);


                    sb.show();



                }
            });



            movableFloatingActionButton2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    final Snackbar sbLong = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(4500).setAction
                            ("Talk", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sbLong2 = Snackbar.make(mRoot, "",Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                            ("Talk", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {

                                                    Snackbar sbLong3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(8000).setAction
                                                            ("Talk", new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {

                                                                    Snackbar sbLong4 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                            ("Next", new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {

                                                                                    Snackbar sbLong5 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5500).setAction
                                                                                            ("Send\nmessage", new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {

                                                                                                    Snackbar sbLong6 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                                                                                            ("Next", new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {

                                                                                                                    Snackbar sbLong7 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                                            ("Finn", new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {

                                                                                                                                    //change pic to bride
                                                                                                                                    //end2.start();

                                                                                                                                    //movableFloatingActionButton2.setImageResource(R.drawable.imageedit_2_8692992455);
                                                                                                                                    mainActivity.doSomethingByFragment(1);

                                                                                                                                }
                                                                                                                            });

                                                                                                                    sbLong7.setText("Congratulation!!\nYou are in a relationship with her");
                                                                                                                    sbLong7.setActionTextColor(0xFFff9999);
                                                                                                                    View view1 = sbLong7.getView();

                                                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                                                    tv.setTextColor(0xFFffffff);

                                                                                                                    sbLong7.show();
                                                                                                                    //end1.start();


                                                                                                                }
                                                                                                            });

                                                                                                    sbLong6.setText(bond3);

                                                                                                    sbLong6.setActionTextColor(0xFFff9999);
                                                                                                    View view1 = sbLong6.getView();

                                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                                    tv.setTextColor(0xFFffffff);
                                                                                                    sbLong6.show();

                                                                                                    //jeanne3Bond3.start();


                                                                                                }
                                                                                            });

                                                                                    sbLong5.setText("You: Would you like to be my girlfriend?");

                                                                                    sbLong5.setActionTextColor(0xFFff9999);
                                                                                    View view1 = sbLong5.getView();

                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                    tv.setTextColor(0xFFffffff);

                                                                                    sbLong5.show();



                                                                                }
                                                                            });

                                                                    sbLong4.setText("It seems her in love with you");

                                                                    sbLong4.setActionTextColor(0xFFff9999);
                                                                    View view1 = sbLong4.getView();

                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                    tv.setTextColor(0xFFffffff);

                                                                    sbLong4.show();




                                                                }
                                                            });
                                                    sbLong3.setText(bond2);

                                                    sbLong3.setActionTextColor(0xFFff9999);
                                                    View view1 = sbLong3.getView();

                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                    tv.setBackgroundColor(0xFFff9999);
                                                    tv.setTextColor(0xFFffffff);

                                                    sbLong3.show();
                                                    //okita4Bond2.start();

                                                }
                                            });

                                    sbLong2.setText(bond1);

                                    sbLong2.setActionTextColor(0xFFff9999);
                                    View view1 = sbLong2.getView();

                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                    tv.setBackgroundColor(0xFFff9999);
                                    tv.setTextColor(0xFFffffff);


                                    sbLong2.show();
                                    //okita6Bond1.start();




                                }
                            });

                    sbLong.setText(master);

                    sbLong.setActionTextColor(0xFFff9999);

                    View view1 = sbLong.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFFff9999);
                    tv.setTextColor(0xFFffffff);


                    sbLong.show();
                    //okitaMaster.start();




                    return false;
                }
            });





        }
        else{

            Log.d("bondLv :",""+bondLv);
            final MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton)view.findViewById(R.id.fab);
            final MovableFloatingActionButton movableFloatingActionButton2 = (MovableFloatingActionButton)view.findViewById(R.id.fab2);
            movableFloatingActionButton2.hide();


            movableFloatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String text1;
                    int random=0;
                    Random r = new Random();

                    //random 0-2
                    random = r.nextInt(3);

                    final int random2 =random;

                    Log.d("fmcir_random: ", " "+random);
                    Log.d("fmcir_random2: ", " "+random2);

                    if(random == 0){

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }
                    else if(random == 1){

                        text1 = greeting2;
                        //jeanne2Greeting.start();


                    }
                    else if(random == 2){

                        text1 = greeting3;
                        //okita5Greeting.start();
                    }
                    else {

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }

                    final String sbText1 = text1;


                    //Toast.makeText(getContext(), "Hello master \nhow are you today", Toast.LENGTH_LONG).show();
                    Snackbar sb = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(6000).setAction
                            ("More", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sb2 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                            ("More", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                            ("More", new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {

                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                            ("More", new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {

                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                            ("More", new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {

                                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                            ("More", new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {

                                                                                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                                            ("Close", new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {

                                                                                                                                    //movableFloatingActionButton2.show();
                                                                                                                                    //movableFloatingActionButton.hide();


                                                                                                                                }
                                                                                                                            });
                                                                                                                    //set sb3
                                                                                                                    sb3.setText(suggest6);
                                                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                                                    View view3 = sb3.getView();
                                                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                                                    tv3.setTextColor(0xFF000000);

                                                                                                                    sb3.show();


                                                                                                                }
                                                                                                            });
                                                                                                    //set sb3
                                                                                                    sb3.setText(suggest5);
                                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                                    View view3 = sb3.getView();
                                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                                    tv3.setTextColor(0xFF000000);

                                                                                                    sb3.show();


                                                                                                }
                                                                                            });
                                                                                    //set sb3
                                                                                    sb3.setText(suggest2);
                                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                                    View view3 = sb3.getView();
                                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                                    tv3.setTextColor(0xFF000000);

                                                                                    sb3.show();


                                                                                }
                                                                            });
                                                                    //set sb3
                                                                    sb3.setText(suggest1);
                                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                                    View view3 = sb3.getView();
                                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                                    tv3.setTextColor(0xFF000000);

                                                                    sb3.show();

                                                                    //end1.start();


                                                                }
                                                            });
                                                    //set sb3
                                                    sb3.setText(sbText3);
                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                    View view3 = sb3.getView();
                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                    tv3.setTextColor(0xFF000000);

                                                    sb3.show();


                                                    if(random2 == 0){

                                                        //jeanne9Suggestion.start();
                                                    }
                                                    else {
                                                        //jeanne7Suggestion.start();
                                                    }




                                                }
                                            });

                                    //set sb2
                                    sb2.setText(sbText2);
                                    sb2.setActionTextColor(0xFF7EACDC);

                                    View view2 = sb2.getView();
                                    TextView tv2 = (TextView)view2.findViewById(android.support.design.R.id.snackbar_text);
                                    tv2.setBackgroundColor(0xFF83CCEB);
                                    tv2.setTextColor(0xFF000000);

                                    sb2.show();
                                    if(random2 == 0){

                                        //jeanne7Suggestion.start();
                                    }
                                    else {
                                        //jeanne8Suggestion.start();
                                    }






                                }
                            });

                    //set sb
                    sb.setText(sbText1);

                    sb.setActionTextColor(0xFF7EACDC);

                    View view1 = sb.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFF83CCEB);
                    tv.setTextColor(0xFF000000);


                    sb.show();










                }
            });




            movableFloatingActionButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    Snackbar sbLong = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(4000).setAction
                            ("apologize", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sbLong2 = Snackbar.make(mRoot, "",Snackbar.LENGTH_LONG).setDuration(3500).setAction
                                            ("Close", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {

                                                }
                                            });

                                    sbLong2.setText("Well, please don't long tab and little drag again!");

                                    sbLong2.setActionTextColor(0xFF7EACDC);
                                    View view1 = sbLong2.getView();

                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                    tv.setBackgroundColor(0xFFFF69B4);
                                    tv.setTextColor(0xFF000000);


                                    sbLong2.show();
                                    //jeannealter11Suggestion.start();



                                }
                            });

                    sbLong.setText("She annoyed by you\nyou should apologize.");

                    sbLong.setActionTextColor(0xFF7EACDC);
                    View view1 = sbLong.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFFBCB35D);
                    tv.setTextColor(0xFFC80825);


                    sbLong.show();
                    //jeannealter10Greeting.start();





                    return false;
                }
            });


            //bond up!!!!!

            movableFloatingActionButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String text1;
                    int random=0;
                    Random r = new Random();


                    //random 0-2
                    random = r.nextInt(3);

                    final int random2 =random;

                    Log.d("fmcir_FB2random: ", " "+random);
                    Log.d("fmcir_FB2random2: ", " "+random2);

                    if(random == 0){

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }
                    else if(random == 1){

                        text1 = greeting2;
                        //jeanne2Greeting.start();


                    }
                    else if(random == 2){

                        text1 = greeting3;
                        //okita5Greeting.start();
                    }
                    else {

                        text1 = greeting1;
                        //jeanne1Greeting.start();
                    }

                    final String sbText1 = text1;


                    //Toast.makeText(getContext(), "Hello master \nhow are you today", Toast.LENGTH_LONG).show();
                    Snackbar sb = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(6000).setAction
                            ("More", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sb2 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                            ("More", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                            ("Close", new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    movableFloatingActionButton.hide();

                                                                }
                                                            });
                                                    //set sb3
                                                    sb3.setText(sbText3);
                                                    sb3.setActionTextColor(0xFF7EACDC);

                                                    View view3 = sb3.getView();
                                                    TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                    tv3.setBackgroundColor(0xFF83CCEB);
                                                    tv3.setTextColor(0xFF000000);

                                                    sb3.show();
                                                    if(random2 == 0){

                                                        //jeanne9Suggestion.start();
                                                    }
                                                    else if(random2 == 1){

                                                        //jeanne8Suggestion.start();

                                                    }
                                                    else {
                                                        //jeanne7Suggestion.start();
                                                    }




                                                }
                                            });

                                    //set sb2
                                    sb2.setText(sbText2);
                                    sb2.setActionTextColor(0xFF7EACDC);

                                    View view2 = sb2.getView();
                                    TextView tv2 = (TextView)view2.findViewById(android.support.design.R.id.snackbar_text);
                                    tv2.setBackgroundColor(0xFF83CCEB);
                                    tv2.setTextColor(0xFF000000);

                                    sb2.show();

                                    if(random2 == 0){

                                        //jeanne7Suggestion.start();
                                    }
                                    else if(random2 == 1){

                                        //jeanne9Suggestion.start();

                                    }
                                    else {
                                        //jeanne8Suggestion.start();
                                    }



                                }
                            });

                    //set sb
                    sb.setText(sbText1);

                    sb.setActionTextColor(0xFF7EACDC);

                    View view1 = sb.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFF83CCEB);
                    tv.setTextColor(0xFF000000);


                    sb.show();



                }
            });



            movableFloatingActionButton2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    final Snackbar sbLong = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(4500).setAction
                            ("Talk", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Snackbar sbLong2 = Snackbar.make(mRoot, "",Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                            ("Talk", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {

                                                    Snackbar sbLong3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(8000).setAction
                                                            ("Talk", new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {

                                                                    Snackbar sbLong4 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                            ("Next", new View.OnClickListener() {
                                                                                @Override
                                                                                public void onClick(View v) {

                                                                                    Snackbar sbLong5 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5500).setAction
                                                                                            ("Send\nmessage", new View.OnClickListener() {
                                                                                                @Override
                                                                                                public void onClick(View v) {

                                                                                                    Snackbar sbLong6 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                                                                                            ("Next", new View.OnClickListener() {
                                                                                                                @Override
                                                                                                                public void onClick(View v) {

                                                                                                                    Snackbar sbLong7 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                                            ("Finn", new View.OnClickListener() {
                                                                                                                                @Override
                                                                                                                                public void onClick(View v) {

                                                                                                                                    //change pic to bride
                                                                                                                                    //end2.start();

                                                                                                                                    movableFloatingActionButton2.setImageResource(R.drawable.imageedit_2_8692992455);
                                                                                                                                    mainActivity.doSomethingByFragment(1);

                                                                                                                                }
                                                                                                                            });

                                                                                                                    sbLong7.setText("Congratulation!!\nYou are in a relationship with her");
                                                                                                                    sbLong7.setActionTextColor(0xFFff9999);
                                                                                                                    View view1 = sbLong7.getView();

                                                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                                                    tv.setTextColor(0xFFffffff);

                                                                                                                    sbLong7.show();
                                                                                                                    //end1.start();


                                                                                                                }
                                                                                                            });

                                                                                                    sbLong6.setText(bond3);

                                                                                                    sbLong6.setActionTextColor(0xFFff9999);
                                                                                                    View view1 = sbLong6.getView();

                                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                                    tv.setTextColor(0xFFffffff);
                                                                                                    sbLong6.show();

                                                                                                    //jeanne3Bond3.start();


                                                                                                }
                                                                                            });

                                                                                    sbLong5.setText("You: Would you like to be my girlfriend?");

                                                                                    sbLong5.setActionTextColor(0xFFff9999);
                                                                                    View view1 = sbLong5.getView();

                                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                                    tv.setTextColor(0xFFffffff);

                                                                                    sbLong5.show();



                                                                                }
                                                                            });

                                                                    sbLong4.setText("It seems her in love with you");

                                                                    sbLong4.setActionTextColor(0xFFff9999);
                                                                    View view1 = sbLong4.getView();

                                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                    tv.setBackgroundColor(0xFFff9999);
                                                                    tv.setTextColor(0xFFffffff);

                                                                    sbLong4.show();




                                                                }
                                                            });
                                                    sbLong3.setText(bond2);

                                                    sbLong3.setActionTextColor(0xFFff9999);
                                                    View view1 = sbLong3.getView();

                                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                    tv.setBackgroundColor(0xFFff9999);
                                                    tv.setTextColor(0xFFffffff);

                                                    sbLong3.show();
                                                    //okita4Bond2.start();

                                                }
                                            });

                                    sbLong2.setText(bond1);

                                    sbLong2.setActionTextColor(0xFFff9999);
                                    View view1 = sbLong2.getView();

                                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                    tv.setBackgroundColor(0xFFff9999);
                                    tv.setTextColor(0xFFffffff);


                                    sbLong2.show();
                                    //okita6Bond1.start();




                                }
                            });

                    sbLong.setText(master);

                    sbLong.setActionTextColor(0xFFff9999);

                    View view1 = sbLong.getView();

                    TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                    tv.setBackgroundColor(0xFFff9999);
                    tv.setTextColor(0xFFffffff);


                    sbLong.show();
                    //okitaMaster.start();




                    return false;
                }
            });

        }

/*


        final MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton)view.findViewById(R.id.fab);
        final MovableFloatingActionButton movableFloatingActionButton2 = (MovableFloatingActionButton)view.findViewById(R.id.fab2);
        movableFloatingActionButton2.hide();


        //

        movableFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1;
                int random=0;
                Random r = new Random();

                //random 0-2
                random = r.nextInt(3);

                final int random2 =random;

                Log.d("fmcir_random: ", " "+random);
                Log.d("fmcir_random2: ", " "+random2);

                if(random == 0){

                    text1 = greeting1;
                    jeanne1Greeting.start();
                }
                else if(random == 1){

                    text1 = greeting2;
                    jeanne2Greeting.start();


                }
                else if(random == 2){

                    text1 = greeting3;
                    okita5Greeting.start();
                }
                else {

                    text1 = greeting1;
                    jeanne1Greeting.start();
                }

                final String sbText1 = text1;


                //Toast.makeText(getContext(), "Hello master \nhow are you today", Toast.LENGTH_LONG).show();
                Snackbar sb = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(6000).setAction
                        ("More", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar sb2 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                        ("More", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                        ("Close", new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                movableFloatingActionButton2.show();
                                                                movableFloatingActionButton.hide();
                                                                end1.start();


                                                            }
                                                        });
                                                 //set sb3
                                                sb3.setText(sbText3);
                                                sb3.setActionTextColor(0xFF7EACDC);

                                                View view3 = sb3.getView();
                                                TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                tv3.setBackgroundColor(0xFF83CCEB);
                                                tv3.setTextColor(0xFF000000);

                                                sb3.show();


                                                if(random2 == 0){

                                                    jeanne9Suggestion.start();
                                                }
                                                else {
                                                    jeanne7Suggestion.start();
                                                }




                                            }
                                        });

                                //set sb2
                                sb2.setText(sbText2);
                                sb2.setActionTextColor(0xFF7EACDC);

                                View view2 = sb2.getView();
                                TextView tv2 = (TextView)view2.findViewById(android.support.design.R.id.snackbar_text);
                                tv2.setBackgroundColor(0xFF83CCEB);
                                tv2.setTextColor(0xFF000000);

                                sb2.show();
                                if(random2 == 0){

                                    jeanne7Suggestion.start();
                                }
                                else {
                                    jeanne8Suggestion.start();
                                }






                            }
                        });

                //set sb
                sb.setText(sbText1);

                sb.setActionTextColor(0xFF7EACDC);

                View view1 = sb.getView();

                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                tv.setBackgroundColor(0xFF83CCEB);
                tv.setTextColor(0xFF000000);


                sb.show();










            }
        });




        movableFloatingActionButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                 Snackbar sbLong = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(4000).setAction
                         ("apologize", new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 Snackbar sbLong2 = Snackbar.make(mRoot, "",Snackbar.LENGTH_LONG).setDuration(3500).setAction
                                         ("Close", new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {

                                             }
                                         });

                                 sbLong2.setText("Well, please don't long tab and little drag again!");

                                 sbLong2.setActionTextColor(0xFF7EACDC);
                                 View view1 = sbLong2.getView();

                                 TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                 tv.setBackgroundColor(0xFFFF69B4);
                                 tv.setTextColor(0xFF000000);


                                 sbLong2.show();
                                 jeannealter11Suggestion.start();



                             }
                         });

                 sbLong.setText("She annoyed by you\nyou should apologize.");

                 sbLong.setActionTextColor(0xFF7EACDC);
                 View view1 = sbLong.getView();

                 TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                 tv.setBackgroundColor(0xFFBCB35D);
                 tv.setTextColor(0xFFC80825);


                 sbLong.show();
                 jeannealter10Greeting.start();





                return false;
            }
        });


        //bond up!!!!!

        movableFloatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1;
                int random=0;
                Random r = new Random();


                //random 0-2
                random = r.nextInt(3);

                final int random2 =random;

                Log.d("fmcir_FB2random: ", " "+random);
                Log.d("fmcir_FB2random2: ", " "+random2);

                if(random == 0){

                    text1 = greeting1;
                    jeanne1Greeting.start();
                }
                else if(random == 1){

                    text1 = greeting2;
                    jeanne2Greeting.start();


                }
                else if(random == 2){

                    text1 = greeting3;
                    okita5Greeting.start();
                }
                else {

                    text1 = greeting1;
                    jeanne1Greeting.start();
                }

                final String sbText1 = text1;


                //Toast.makeText(getContext(), "Hello master \nhow are you today", Toast.LENGTH_LONG).show();
                Snackbar sb = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(6000).setAction
                        ("More", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar sb2 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                        ("More", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Snackbar sb3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                        ("Close", new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                movableFloatingActionButton.hide();

                                                            }
                                                        });
                                                //set sb3
                                                sb3.setText(sbText3);
                                                sb3.setActionTextColor(0xFF7EACDC);

                                                View view3 = sb3.getView();
                                                TextView tv3 = (TextView)view3.findViewById(android.support.design.R.id.snackbar_text);
                                                tv3.setBackgroundColor(0xFF83CCEB);
                                                tv3.setTextColor(0xFF000000);

                                                sb3.show();
                                                if(random2 == 0){

                                                    jeanne9Suggestion.start();
                                                }
                                                else if(random2 == 1){

                                                    jeanne8Suggestion.start();

                                                }
                                                else {
                                                    jeanne7Suggestion.start();
                                                }




                                            }
                                        });

                                //set sb2
                                sb2.setText(sbText2);
                                sb2.setActionTextColor(0xFF7EACDC);

                                View view2 = sb2.getView();
                                TextView tv2 = (TextView)view2.findViewById(android.support.design.R.id.snackbar_text);
                                tv2.setBackgroundColor(0xFF83CCEB);
                                tv2.setTextColor(0xFF000000);

                                sb2.show();

                                if(random2 == 0){

                                    jeanne7Suggestion.start();
                                }
                                else if(random2 == 1){

                                    jeanne9Suggestion.start();

                                }
                                else {
                                    jeanne8Suggestion.start();
                                }



                            }
                        });

                //set sb
                sb.setText(sbText1);

                sb.setActionTextColor(0xFF7EACDC);

                View view1 = sb.getView();

                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                tv.setBackgroundColor(0xFF83CCEB);
                tv.setTextColor(0xFF000000);


                sb.show();



            }
        });



        movableFloatingActionButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                final Snackbar sbLong = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(4500).setAction
                        ("Talk", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar sbLong2 = Snackbar.make(mRoot, "",Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                        ("Talk", new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                Snackbar sbLong3 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(8000).setAction
                                                        ("Talk", new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {

                                                                Snackbar sbLong4 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                        ("Next", new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                Snackbar sbLong5 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5500).setAction
                                                                                        ("Send\nmessage", new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {

                                                                                                Snackbar sbLong6 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(10000).setAction
                                                                                                        ("Next", new View.OnClickListener() {
                                                                                                            @Override
                                                                                                            public void onClick(View v) {

                                                                                                                Snackbar sbLong7 = Snackbar.make(mRoot, "", Snackbar.LENGTH_LONG).setDuration(5000).setAction
                                                                                                                        ("Finn", new View.OnClickListener() {
                                                                                                                            @Override
                                                                                                                            public void onClick(View v) {

                                                                                                                                //change pic to bride
                                                                                                                                end2.start();

                                                                                                                                movableFloatingActionButton2.setImageResource(R.drawable.imageedit_2_8692992455);
                                                                                                                                mainActivity.doSomethingByFragment(1);

                                                                                                                            }
                                                                                                                        });

                                                                                                                sbLong7.setText("Congratulation!!\nYou are in a relationship with her");
                                                                                                                sbLong7.setActionTextColor(0xFFff9999);
                                                                                                                View view1 = sbLong7.getView();

                                                                                                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                                tv.setBackgroundColor(0xFFff9999);
                                                                                                                tv.setTextColor(0xFFffffff);

                                                                                                                sbLong7.show();
                                                                                                                end1.start();


                                                                                                            }
                                                                                                        });

                                                                                                sbLong6.setText(bond3);

                                                                                                sbLong6.setActionTextColor(0xFFff9999);
                                                                                                View view1 = sbLong6.getView();

                                                                                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                                tv.setBackgroundColor(0xFFff9999);
                                                                                                tv.setTextColor(0xFFffffff);
                                                                                                sbLong6.show();

                                                                                                jeanne3Bond3.start();


                                                                                            }
                                                                                        });

                                                                                sbLong5.setText("You: Would you like to be my girlfriend?");

                                                                                sbLong5.setActionTextColor(0xFFff9999);
                                                                                View view1 = sbLong5.getView();

                                                                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                                tv.setBackgroundColor(0xFFff9999);
                                                                                tv.setTextColor(0xFFffffff);

                                                                                sbLong5.show();



                                                                            }
                                                                        });

                                                                sbLong4.setText("It seems her in love with you");

                                                                sbLong4.setActionTextColor(0xFFff9999);
                                                                View view1 = sbLong4.getView();

                                                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                                tv.setBackgroundColor(0xFFff9999);
                                                                tv.setTextColor(0xFFffffff);

                                                                sbLong4.show();




                                                            }
                                                        });
                                                sbLong3.setText(bond2);

                                                sbLong3.setActionTextColor(0xFFff9999);
                                                View view1 = sbLong3.getView();

                                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                                tv.setBackgroundColor(0xFFff9999);
                                                tv.setTextColor(0xFFffffff);

                                                sbLong3.show();
                                                okita4Bond2.start();

                                            }
                                        });

                                sbLong2.setText(bond1);

                                sbLong2.setActionTextColor(0xFFff9999);
                                View view1 = sbLong2.getView();

                                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                                tv.setBackgroundColor(0xFFff9999);
                                tv.setTextColor(0xFFffffff);


                                sbLong2.show();
                                okita6Bond1.start();




                            }
                        });

                sbLong.setText(master);

                sbLong.setActionTextColor(0xFFff9999);

                View view1 = sbLong.getView();

                TextView tv = (TextView) view1.findViewById(android.support.design.R.id.snackbar_text);
                tv.setBackgroundColor(0xFFff9999);
                tv.setTextColor(0xFFffffff);


                sbLong.show();
                okitaMaster.start();




                return false;
            }
        });

*/






        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        //define fm here


        Bundle bundle = new Bundle();
        bundle.putStringArrayList("key_courseno", courseno_list);
        bundle.putStringArrayList("key_coursetitle", coursetitle_list);
        bundle.putStringArrayList("key_crelec_list", crelec_list);
        bundle.putStringArrayList("key_crelab_list", crelab_list);
        bundle.putStringArrayList("key_PrerequisiteCode", PrerequisiteCode);
        bundle.putStringArrayList("key_PrerequisiteName", PrerequisiteName);





        //FragmentTransaction ft = getChildFragmentManager().beginTransaction();

        //fmCurrentenroll myfm = new fmCurrentenroll();

        //myfm.setArguments(bundle);

        //ft.replace(R.id.child_fragment_container, myfm).commit();



    }

}
