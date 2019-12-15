package com.example.project1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.project1.adapter.adt_rv_calculate;
import com.example.project1.adapter.adt_rv_text;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmCalculateGPA extends Fragment {


    public fmCalculateGPA() {
        // Required empty public constructor
    }

    private ArrayList<String> courseno_list = new ArrayList<String>();
    private ArrayList<String> coursetitle_list = new ArrayList<String>();
    private ArrayList<String> crelec_list = new ArrayList<String>();
    private ArrayList<String> crelab_list = new ArrayList<String>();

    private Double RegGpax;
    private Double RegMgpax;
    private Double RegGetcredit;
    private Double Msumgradepoint;
    private Double Msumcredit;

    private Double c_credit;

    private ArrayList<String> MajorCode = new ArrayList<String>();

    //adt get grade,crelec,crelab


    private LinkedList<String> adtselectgrade = new LinkedList<String>();



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


            RegGpax = bundle4.getDouble("key_RegGpax");
            RegMgpax = bundle4.getDouble("key_RegMgpax");
            RegGetcredit = bundle4.getDouble("key_RegGetcredit");
            Msumgradepoint = bundle4.getDouble("key_Msumgradepoint");
            Msumcredit = bundle4.getDouble("key_Msumcredit");

            MajorCode = bundle4.getStringArrayList("key_MajorCode");
            c_credit = bundle4.getDouble("key_c_credit");


        }

        else{
            Log.d("fmcalculate","not getbundle");
        }


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fm_calculate_g, container, false);

        TextView textView2 = (TextView)view.findViewById(R.id.textView2);
        TextView textView4 = (TextView)view.findViewById(R.id.textView4);
        TextView textView6 = (TextView)view.findViewById(R.id.textView6);

        Button button8 = (Button)view.findViewById(R.id.button8);

        final TextView textView8 = (TextView)view.findViewById(R.id.textView8);
        final TextView textView10 = (TextView)view.findViewById(R.id.textView10);
        final TextView textView12 = (TextView)view.findViewById(R.id.textView12);







        RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycler);
        //Not depend on the adapter content.
        rv.setHasFixedSize(true);
        rv.setItemViewCacheSize(10);

        //In fragmetn use get activity , activity use this
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(lm);

        final RecyclerView.Adapter adapter = new adt_rv_calculate();

        ((adt_rv_calculate) adapter).adt_rv_calculate(coursetitle_list,courseno_list,crelec_list,crelab_list);


        rv.setAdapter(adapter);

        //set text
        DecimalFormat precision = new DecimalFormat("0.00");

        textView2.setText(precision.format(RegGpax));
        textView4.setText(precision.format(RegMgpax));
        textView6.setText(precision.format(RegGetcredit));

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DecimalFormat precision = new DecimalFormat("0.00");
                Double gradepoint=0.00;
                Double sumgradepoint=0.00;
                Double credit=0.00;
                Double sumcredit =0.00;

                Double tempGPA=0.00;
                Double tempGetcredit=0.00;
                Double tempsumgradepoint=0.00;
                Double tempsumcredit=0.00;

                Double tempMGPA=0.00;
                Double tempMsumgradepoint=0.00;
                Double tempMsumcredit=0.00;






                adtselectgrade = ((adt_rv_calculate) adapter).getSelectgrade();
                String text2 = Integer.toString(adtselectgrade.size());

                //textView8.setText(text);
                //textView10.setText(text2);

                Log.d("fmCalcu1", "  "+adtselectgrade.size());
                Log.d("fmCalcu1", "  "+adtselectgrade);


                //Major gpa process
                for(int i=0 ;i<courseno_list.size(); i++){


                    for(int j=0;j < MajorCode.size(); j++){

                        Log.d("fmCalcui", "  "+j);
                        Log.d("fmCalcu2", "  "+adtselectgrade.get(i));

                        if(courseno_list.get(i).equals(MajorCode.get(j))){


                            if(adtselectgrade.get(i) != null){


                                switch (adtselectgrade.get(i)){



                                case "A" :
                                    gradepoint = 4.00;

                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);







                                    break;


                                case "B+" :
                                    gradepoint = 3.50;
                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);



                                    break;



                                case "B" :
                                    gradepoint = 3.00;
                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);

                                    break;


                                case "C+" :


                                    gradepoint = 2.50;


                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);

                                    break;

                                case "C" :
                                    gradepoint = 2.00;

                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);

                                    break;

                                case "D+" :
                                    gradepoint = 1.50;

                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);


                                    break;

                                case "D" :
                                    gradepoint = 1.00;

                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);



                                    break;

                                case "F" :
                                    gradepoint = 0.00;


                                    credit = Double.valueOf(crelec_list.get(i)) + Double.valueOf(crelab_list.get(i));
                                    sumcredit = sumcredit + credit;
                                    sumgradepoint = sumgradepoint + (gradepoint*credit);


                                    break;
                                case "W" :




                                    break;

                                case "S" :



                                    break;

                                case "U" :


                                    break;

                                case "P" :


                                    break;

                                case "null":


                                    break;


                                default:

                                }



                            }

                        }

                    }


                }

                //end of for loop



                //calculate gpa and get credit

                Double gradepoint2=0.00;
                Double sumgradepoint2=0.00;
                Double credit2=0.00;
                Double sumcredit2 =0.00;


                for(int j=0 ;j<courseno_list.size(); j++){

                    if(adtselectgrade.get(j) != null){


                        switch (adtselectgrade.get(j)){



                            case "A" :
                                Log.d("fmCalcugpaA", " get in ");
                                gradepoint2 = 4.00;

                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;







                                break;


                            case "B+" :
                                gradepoint2 = 3.50;
                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;


                                break;



                            case "B" :
                                gradepoint2 = 3.00;
                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;

                                break;


                            case "C+" :


                                gradepoint2 = 2.50;


                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;

                                break;

                            case "C" :
                                gradepoint2 = 2.00;

                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;

                                break;

                            case "D+" :
                                gradepoint2 = 1.50;

                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;


                                break;

                            case "D" :
                                gradepoint2 = 1.00;

                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);

                                tempGetcredit = tempGetcredit + credit2;



                                break;

                            case "F" :
                                gradepoint2 = 0.00;


                                credit2 = Double.valueOf(crelec_list.get(j)) + Double.valueOf(crelab_list.get(j));
                                sumcredit2 = sumcredit2 + credit2;
                                sumgradepoint2 = sumgradepoint2 + (gradepoint2*credit2);


                                break;
                            case "W" :




                                break;

                            case "S" :



                                break;

                            case "U" :


                                break;

                            case "P" :


                                break;

                            case "null":


                                break;


                            default:

                        }



                    }



                }


                //make Major gpa
                tempMsumgradepoint = Msumgradepoint + sumgradepoint;
                tempMsumcredit = Msumcredit + sumcredit;
                tempMGPA = tempMsumgradepoint/tempMsumcredit;

                //make get credit
                tempGetcredit = RegGetcredit + tempGetcredit;


                //make gpax here
                //tempGPA =
                tempsumgradepoint = (c_credit*RegGpax) + sumgradepoint2;
                tempsumcredit = c_credit + sumcredit2;
                tempGPA = tempsumgradepoint/tempsumcredit;


                textView8.setText(precision.format(tempGPA));
                textView10.setText(precision.format(tempMGPA));
                textView12.setText(precision.format(tempGetcredit));

            }
        });





        //end of set text




        return view;
    }

    public double calculateGPAX(){

        double gpa = 0.00;




        return gpa;
    }

}
