package com.example.project1;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmHome extends Fragment {

    private Double RegGpax;
    private Double RegMgpax;
    private Double RegGetcredit;
    private String Mis_st_id;
    private String MinimumCredit;

    private ArrayList<String> Enrolled = new ArrayList<String>();
    private ArrayList<String> EnrolledGrade = new ArrayList<String>();
    private ArrayList<String> MajorCode = new ArrayList<String>();
    private ArrayList<String> MajorCredit = new ArrayList<String>();

    //cycle
    private TextView tv;
    private ProgressBar pBar;
    int pStatus = 0;

    //cycle 2
    private TextView tv2;
    private ProgressBar pBar2;
    int pStatus2 = 0;

    //cycle3
    private TextView tv3;
    private ProgressBar pBar3;
    int pStatus3 = 0;







    public fmHome() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fm_home, container, false);

        //return inflater.inflate(R.layout.fragment_fm_home, container, false);

        //get agrument
        if(getArguments() != null){

            Bundle bundle2 = getArguments();


            RegGpax = bundle2.getDouble("key_Gpax");
            //RegMgpax = bundle2.getDouble("key_Mgpax");
            RegGetcredit = bundle2.getDouble("key_Getcredit");
            Mis_st_id = bundle2.getString("key_Mis_st_id");
            MinimumCredit = bundle2.getString("key_MinimumCredit");

            Enrolled = bundle2.getStringArrayList("key_Enrolled");
            MajorCode = bundle2.getStringArrayList("key_MajorCourseCcode");
            MajorCredit = bundle2.getStringArrayList("key_MajorCredit");
            EnrolledGrade = bundle2.getStringArrayList("key_EnrolledGrade");






        }
        else {


            Toast.makeText(getContext(),"Fail to send info",Toast.LENGTH_LONG).show();
        }

        //

        Double gradepoint=0.00;
        Double sumgradepoint=0.00;
        Double credit=0.00;
        Double sumcredit =0.00;



        if(Enrolled != null){





        for(int i=0;i<Enrolled.size();i++){


            for(int j=0;j<MajorCode.size();j++){






            if(Enrolled.get(i).equals(MajorCode.get(j))){

                Log.d("fmhomeM",""+Enrolled.get(i));
                Log.d("fmhomeM2",""+EnrolledGrade.get(i));


                if(EnrolledGrade.get(i) != null){

                    switch (EnrolledGrade.get(i)){



                        case "A " :
                        gradepoint = 4.00;

                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditA",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);






                        break;


                        case "B+" :
                        gradepoint = 3.50;


                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditB+",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);




                        break;



                        case "B " :
                        gradepoint = 3.00;

                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditB",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);


                        break;


                        case "C+" :


                        gradepoint = 2.50;


                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditC+",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);


                        break;

                        case "C " :
                        gradepoint = 2.00;

                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditC",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);



                        break;

                        case "D+" :
                        gradepoint = 1.50;

                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditD+",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);



                        break;

                        case "D " :
                        gradepoint = 1.00;

                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditD",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);


                        break;

                        case "F " :
                        gradepoint = 0.00;


                        credit = Double.valueOf(MajorCredit.get(j));
                        Log.d("fmhomeMcreditF",""+credit);
                        sumcredit = sumcredit + credit;
                        sumgradepoint = sumgradepoint + (gradepoint*credit);


                        break;
                        case "W " :



                        break;

                        case "S " :

                        break;

                        case "U " :


                        break;

                        case "P " :


                        break;

                        case "null":


                        break;


                        default:


                    }

                }


            }




            }

            Log.d("fmhomeMsumgp",""+sumgradepoint);
            Log.d("fmhomeMsumcp",""+sumcredit);
        }

        }

        //summary score
        Log.d("fmhomeMsum",""+sumgradepoint);
        Log.d("fmhomeMsum",""+sumcredit);
        RegMgpax = sumgradepoint/sumcredit;






        //TextView textView10 = (TextView) view.findViewById(R.id.textView10);
        //TextView textView7 = (TextView)view.findViewById(R.id.textView7);
        //TextView textView8 = (TextView)view.findViewById(R.id.textView8);
        //TextView textView9 = (TextView)view.findViewById(R.id.textView9);


        TextView headview = (TextView) view.findViewById(R.id.HeadView);
        headview.setText(" ID : "+Mis_st_id);

        Log.d("fmhome",RegGpax+" "+RegMgpax+" "+RegMgpax+" "+RegGetcredit+" "+Mis_st_id);
        DecimalFormat precision = new DecimalFormat("0.00");
        //การแปลง double เป็น string
        precision.format(RegGpax);
        precision.format(RegMgpax);

        //display status
        TextView textView11 = (TextView) view.findViewById(R.id.textView11);
        TextView textView13 = (TextView) view.findViewById(R.id.textView13);



        //textView10.setText("ID : "+Mis_st_id);
        //textView7.setText("GPAX : "+precision.format(RegGpax));
        //textView8.setText("Major GPAX : "+precision.format(RegMgpax));
        //textView9.setText("Collected credit : "+precision.format(RegGetcredit));

        //precision.format(RegGetcredit);


        //cycle bar1
        tv = view.findViewById(R.id.textView1);
        pBar = view.findViewById(R.id.progressBar1);

        tv.setText(precision.format(RegGpax));
        double temp;
        temp = ((RegGpax*100)/4);
        pStatus = (int) temp;
        pBar.setProgress(pStatus);

        //cycle bar2

        tv2 = view.findViewById(R.id.textView2);
        pBar2 = view.findViewById(R.id.progressBar2);

        tv2.setText(precision.format(RegMgpax));
        double temp2;
        temp2 = ((RegMgpax*100)/4);
        pStatus2 = (int) temp2;
        pBar2.setProgress(pStatus2);

        //cycle bar3

        tv3 = view.findViewById(R.id.textView3);
        pBar3 = view.findViewById(R.id.progressBar3);

        tv3.setText(precision.format(RegGetcredit)+"\n /"+MinimumCredit);
        double temp3;
        temp3 = ((RegGetcredit*100)/143);
        pStatus3 = (int) temp3;
        pBar3.setProgress(pStatus3);



        Double statusGpa = RegGpax;
        Double statusMGpa = RegMgpax;
        if(statusGpa < 1.75){

            textView11.setText("Status : เสี่ยงไทร์ !!! (Danger)\nเกรดคุณน้อยมากๆ เสี่ยงที่จะถูกรีไทร์");
            textView11.setBackgroundColor(Color.RED);

            textView13.setText("Suggestion\n ควรลงตัวฟรีอิสระต่างๆเพื่อเพิ่มเกรดโดยด่วน ไม่เช่นนั้นคุณจะโดนรีไทร์");
        }
        else if(statusGpa >= 1.75 && statusGpa < 2.25 ){
            textView11.setText("Status : คาบเส้น !!! (WARNING)\nเกรดคุณพ้นขีดอันตราย แต่ยังคงน่าเป็นห่วง");
            textView11.setBackgroundColor(0xFFFFA500);

            textView13.setText("Suggestion\n ควรลงตัวฟรีอิสระซักตัวเพื่อเพิ่มเกรดขึ้นมาอีก หลีกเลี่ยงวิชาที่เสี่ยงจะฉุดเกรดลง");
        }
        else if(statusGpa >= 2.25 && statusGpa <= 2.75 ){
            textView11.setText("Status : ควรเพิ่มเกรด !!! (ATTENTION)\nเกรดคุณค่อนข้างน้อย ควรเพิ่มเกรดโดยด่วน");
            textView11.setBackgroundColor(Color.YELLOW);

            textView13.setText("Suggestion\n ควรลงตัวเมเจอร์และเก็บตัว core ต่างๆให้ครบตามเงื่อนไขการจบการศึกษา");
        }

        else if(statusGpa >= 2.75 && statusGpa < 3.25){
            textView11.setText("Status : ปลอดภัย (SAFE)\n เกรดคุณผ่านเกณฑ์มาตรฐาน ขยันอีกนิดเพื่ออนาคต");
            textView11.setBackgroundColor(Color.GREEN);

            textView13.setText("Suggestion\n เกรดคุณอยู่ในระดับเกณฑ์มาตรฐานในการสมัครงานบริษัทต่างๆหรืองานราชการแล้ว\nเพื่อความมั่นใจควรจะเพิ่มเกรดให้สูงอีกนิด และเพิ่มเกรดเมเจอร์เพื่อผ่านข้อกำหนดการจบการศึกษา");
        }
        else if(statusGpa >= 3.25){
            textView11.setText("Status : เกียรตินิยม (Excellence)\nเกรดคุณอยู่ในระดับดีมากๆ ลุ้นเกียรตินิยมได้เลย");
            textView11.setBackgroundColor(Color.BLUE);

            textView13.setText("Suggestion\n เกรดคุณอยู่ในระดับเกณฑ์ยอดเยี่ยมและมีลุ้นเกียรตินิยม\n ควรรักษาระดับการเรียนของคุณไว้ระดับนี้ตลอดและห้ามดรอป W ติด F โดยเด็ดขาด\n(ควรลงทะเบียนตามแผนการศึกาาที่ทางคณะกำหนด)");
        }


        return view;







    }

}
