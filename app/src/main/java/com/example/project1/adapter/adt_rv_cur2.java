package com.example.project1.adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cur2 extends RecyclerView.Adapter<adt_rv_cur2.ViewHolder> {

    ArrayList<String> lst1 = new ArrayList<String>();
    ArrayList<String> lst2 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst3 = new ArrayList<String>();
    ArrayList<String> lst4 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst5 = new ArrayList<String>();
    ArrayList<String> lst6 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst7 = new ArrayList<String>();
    ArrayList<String> lst8 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst9 = new ArrayList<String>();
    ArrayList<String> lst10 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst11 = new ArrayList<String>();
    ArrayList<String> lst12 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst13 = new ArrayList<String>();
    ArrayList<String> lst14 = new ArrayList<String>();
    //////////////////////////////////////////////////
    ArrayList<String> lst15 = new ArrayList<String>();
    ArrayList<String> lst16 = new ArrayList<String>();
    //////////////////////////////////////////////////
    //collect year and semester
    ArrayList<String> lstyear = new ArrayList<String>();
    ArrayList<String> lstsemester = new ArrayList<String>();

    /////////////////////////////////////////////////////
    //collect course pass
    ArrayList<String> CollectCourse = new ArrayList<String>();
    ArrayList<String> CollectCourseNotPass = new ArrayList<String>();

    //collect prerequsitenotpass
    ArrayList<String> PreNotPass = new ArrayList<String>();

    ArrayList<String> PrePass = new ArrayList<String>();

    //current
    ArrayList<String> CurrentCourse = new ArrayList<String>();

    //
    //set onclicklistener

    private onItemClickListener mListener;

    public interface onItemClickListener{

        void onItemClick(int position);

        void onText3ColorChange(int position);

        void onText4ColorChange(int position);

        void onText5ColorChange(int position);

        void onText6ColorChange(int position);

        void onText7ColorChange(int position);

        void onText8ColorChange(int position);

        void onText9ColorChange(int position);

        void onText10ColorChange(int position);
    }


    public void setonItemClickListener(onItemClickListener listener){

        mListener = listener;
    }

    //

    @Override
    public adt_rv_cur2.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_cur2, viewGroup, false);

        adt_rv_cur2.ViewHolder viewHolder = new adt_rv_cur2.ViewHolder(v, mListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){




        viewHolder.tvItems.setText(lstyear.get(i));

        viewHolder.tvItems2.setText(lstsemester.get(i));

        if(i == 0){



            Log.d("adtcurlst1.size","lst1size "+lst1.size());

            for(int j=0;j<lst1.size();j++){

                if(j==0){

                    if(lst2.get(j).length() > 30){

                        String title = lst1.get(j)+"\n"+lst2.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems3.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst2.get(j).length() > 30){

                        String title = lst1.get(j)+"\n"+lst2.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst2.get(j).length() > 30){

                        String title = lst1.get(j)+"\n"+lst2.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems5.setText(title);
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst2.get(j).length() > 30){

                        String title = lst1.get(j)+"\n"+lst2.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst2.get(j).length() > 30){

                        String title = lst1.get(j)+"\n"+lst2.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst2.get(j).length() > 30) {

                        String title = lst1.get(j) + "\n" + lst2.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst2.get(j).length() > 30) {

                        String title = lst1.get(j) + "\n" + lst2.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                    }
                    else {
                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst2.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst1.get(j) + "\n" + lst2.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }



                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst1.get(j)+"\n"+lst2.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst1.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst1.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past
                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst1.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst1.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst1.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }


                    }


                }
            }
        }

        else if(i == 1){


            Log.d("adtcuri", "i=1");
            for(int j=0;j<lst3.size();j++){

                if(j==0){

                    if(lst4.get(j).length() > 30){

                        String title = lst3.get(j)+"\n"+lst4.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        //border red
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        //border green
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);


                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        //red
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        //green
                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst4.get(j).length() > 30){

                        String title = lst3.get(j)+"\n"+lst4.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst4.get(j).length() > 30){

                        String title = lst3.get(j)+"\n"+lst4.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst4.get(j).length() > 30){

                        String title = lst3.get(j)+"\n"+lst4.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst4.get(j).length() > 30){

                        String title = lst3.get(j)+"\n"+lst4.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst4.get(j).length() > 30) {

                        String title = lst3.get(j) + "\n" + lst4.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst4.get(j).length() > 30) {

                        String title = lst3.get(j) + "\n" + lst4.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst4.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst3.get(j) + "\n" + lst4.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }



                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst3.get(j)+"\n"+lst4.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst3.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst3.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst3.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst3.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst3.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }

                    }


                }
            }

        }
        else if(i == 2){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst5.size();j++){

                if(j==0){

                    if(lst6.get(j).length() > 30){

                        String title = lst5.get(j)+"\n"+lst6.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst6.get(j).length() > 30){

                        String title = lst5.get(j)+"\n"+lst6.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst6.get(j).length() > 30){

                        String title = lst5.get(j)+"\n"+lst6.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }

                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst6.get(j).length() > 30){

                        String title = lst5.get(j)+"\n"+lst6.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst6.get(j).length() > 30){

                        String title = lst5.get(j)+"\n"+lst6.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst6.get(j).length() > 30) {

                        String title = lst5.get(j) + "\n" + lst6.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst6.get(j).length() > 30) {

                        String title = lst5.get(j) + "\n" + lst6.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst6.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst5.get(j) + "\n" + lst6.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }


                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst5.get(j)+"\n"+lst6.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst5.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst5.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst5.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst5.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst5.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }

                    }


                }
            }

        }
        else if(i == 3){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst7.size();j++){

                if(j==0){

                    if(lst8.get(j).length() > 30){

                        String title = lst7.get(j)+"\n"+lst8.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==1){

                    if(lst8.get(j).length() > 30){

                        String title = lst7.get(j)+"\n"+lst8.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst8.get(j).length() > 30){

                        String title = lst7.get(j)+"\n"+lst8.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst8.get(j).length() > 30){

                        String title = lst7.get(j)+"\n"+lst8.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst8.get(j).length() > 30){

                        String title = lst7.get(j)+"\n"+lst8.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst8.get(j).length() > 30) {

                        String title = lst7.get(j) + "\n" + lst8.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);



                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }

                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst8.get(j).length() > 30) {

                        String title = lst7.get(j) + "\n" + lst8.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst7.get(j)+"\n"+lst8.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst8.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst7.get(j) + "\n" + lst8.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }



                    }
                    else {
                        Log.d("adtcur21", "in < 20");

                        String title = lst7.get(j) + "\n" + lst8.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst7.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst7.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst7.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst7.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst7.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }


                    }


                }
            }

        }
        else if(i == 4){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst9.size();j++){

                if(j==0){

                    if(lst10.get(j).length() > 30){

                        String title = lst9.get(j)+"\n"+lst10.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }


                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst10.get(j).length() > 30){

                        String title = lst9.get(j)+"\n"+lst10.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst10.get(j).length() > 30){

                        String title = lst9.get(j)+"\n"+lst10.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst10.get(j).length() > 30){

                        String title = lst9.get(j)+"\n"+lst10.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst10.get(j).length() > 30){

                        String title = lst9.get(j)+"\n"+lst10.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst10.get(j).length() > 30) {

                        String title = lst9.get(j) + "\n" + lst10.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst10.get(j).length() > 30) {

                        String title = lst9.get(j) + "\n" + lst10.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst10.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst9.get(j) + "\n" + lst10.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }



                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst9.get(j)+"\n"+lst10.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst9.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst9.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst9.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst9.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst9.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }


                    }


                }
            }

        }
        else if(i == 5){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst11.size();j++){

                if(j==0){

                    if(lst12.get(j).length() > 30){

                        String title = lst11.get(j)+"\n"+lst12.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst12.get(j).length() > 30){

                        String title = lst11.get(j)+"\n"+lst12.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst12.get(j).length() > 30){

                        String title = lst11.get(j)+"\n"+lst12.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst12.get(j).length() > 30){

                        String title = lst11.get(j)+"\n"+lst12.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst12.get(j).length() > 30){

                        String title = lst11.get(j)+"\n"+lst12.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst12.get(j).length() > 30) {

                        String title = lst11.get(j) + "\n" + lst12.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst12.get(j).length() > 30) {

                        String title = lst11.get(j) + "\n" + lst12.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst12.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst11.get(j) + "\n" + lst12.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }



                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst11.get(j)+"\n"+lst12.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst11.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst11.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst11.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst11.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst11.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
            }



        }
        else if(i == 6){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst13.size();j++){

                if(j==0){

                    if(lst14.get(j).length() > 30){

                        String title = lst13.get(j)+"\n"+lst14.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst14.get(j).length() > 30){

                        String title = lst13.get(j)+"\n"+lst14.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst14.get(j).length() > 30){

                        String title = lst13.get(j)+"\n"+lst14.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==3){

                    if(lst14.get(j).length() > 30){

                        String title = lst13.get(j)+"\n"+lst14.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst14.get(j).length() > 30){

                        String title = lst13.get(j)+"\n"+lst14.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst14.get(j).length() > 30) {

                        String title = lst13.get(j) + "\n" + lst14.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst14.get(j).length() > 30) {

                        String title = lst13.get(j) + "\n" + lst14.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst14.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst13.get(j) + "\n" + lst14.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }


                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst13.get(j)+"\n"+lst14.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst13.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst13.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst13.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst13.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst13.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
            }



        }
        else if(i == 7){
            Log.d("adtcuri", "i="+i);

            for(int j=0;j<lst15.size();j++){

                if(j==0){

                    if(lst16.get(j).length() > 30){

                        String title = lst15.get(j)+"\n"+lst16.get(j).substring(0,31);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems3.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems3.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems3.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems3.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems3.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems3.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==1){

                    if(lst16.get(j).length() > 30){

                        String title = lst15.get(j)+"\n"+lst16.get(j).substring(0,31);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems4.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems4.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems4.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems4.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems4.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems4.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==2){

                    if(lst16.get(j).length() > 30){

                        String title = lst15.get(j)+"\n"+lst16.get(j).substring(0,31);
                        viewHolder.tvItems5.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems5.setText(title);


                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems5.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems5.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems5.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems5.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems5.setTextColor(0xFF000000);


                            }
                        }

                    }

                }
                else if(j==3){

                    if(lst16.get(j).length() > 30){

                        String title = lst15.get(j)+"\n"+lst16.get(j).substring(0,31);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems6.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems6.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems6.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems6.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems6.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems6.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==4){

                    if(lst16.get(j).length() > 30){

                        String title = lst15.get(j)+"\n"+lst16.get(j).substring(0,31);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems7.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems7.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems7.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems7.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems7.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems7.setTextColor(0xFF000000);


                            }
                        }
                    }

                }
                else if(j==5){

                    if(lst16.get(j).length() > 30) {

                        String title = lst15.get(j) + "\n" + lst16.get(j).substring(0, 31);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems8.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems8.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems8.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems8.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems8.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems8.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
                else if(j==6){

                    if(lst16.get(j).length() > 30) {

                        String title = lst15.get(j) + "\n" + lst16.get(j).substring(0, 31);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }
                    else {
                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems9.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems9.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems9.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems9.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems9.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems9.setTextColor(0xFF000000);


                            }
                        }
                    }



                }
                else if(j==7){
                    Log.d("adtcur2","in");

                    if(lst16.get(j).length() > 30) {
                        Log.d("adtcur21","in > 20");

                        String title = lst15.get(j) + "\n" + lst16.get(j).substring(0, 31);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }
                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }



                    }
                    else {
                        Log.d("adtcur21","in < 20");

                        String title = lst15.get(j)+"\n"+lst16.get(j);
                        viewHolder.tvItems10.setText(title);

                        //check prenotpass
                        for(int k=0; k<PreNotPass.size(); k++){
                            if(lst15.get(j).equals(PreNotPass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_red);
                                viewHolder.tvItems10.setTextColor(0xFFFF0300);

                            }
                        }

                        //end of check prenotpass

                        //check pre past
                        for(int k=0; k<PrePass.size(); k++){
                            if(lst15.get(j).equals(PrePass.get(k))){

                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_bord_green);
                                viewHolder.tvItems10.setTextColor(0xFF9ACD32);

                            }
                        }

                        //end of check pre past

                        //blue
                        for(int k=0; k<CurrentCourse.size(); k++){
                            if(lst15.get(j).equals(CurrentCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_blue);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourseNotPass.size(); k++){
                            if(lst15.get(j).equals(CollectCourseNotPass.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_red);
                                viewHolder.tvItems10.setTextColor(0xFF000000);

                            }
                        }

                        for(int k=0; k<CollectCourse.size(); k++){
                            if(lst15.get(j).equals(CollectCourse.get(k))){

                                //viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                                viewHolder.tvItems10.setBackgroundResource(R.drawable.oval_green);
                                //viewHolder.tvItems10.setTextColor(0xFF44433A);
                                viewHolder.tvItems10.setTextColor(0xFF000000);


                            }
                        }
                    }


                }
            }

        }
        else if(i == 8){
            Log.d("adtcuri", "i="+i);

            //viewHolder.tvItems10.setText(""+i);

        }
        else if(i == 9){
            Log.d("adtcuri", "i="+i);

            //viewHolder.tvItems10.setText(""+i);

        }
        //viewHolder.tvItems.setText(lst1.get(i));
        //viewHolder.tvItems2.setText(lst2.get(i));
        //viewHolder.tvItems3.setText(lst3.get(i));
        //viewHolder.tvItems4.setText(lst4.get(i));
    }

    @Override
    public int getItemCount(){

        //return size of recycle = 8
        //return lst1.size();
        return lstyear.size();
    }


    public  void set_adt_rv_cur_2head(ArrayList<String> temp5, ArrayList<String> temp6){

        this.lstyear = temp5;
        this.lstsemester = temp6;

    }


    public  void set_adt_rv_cur_2y1s1(ArrayList<String> temp5, ArrayList<String> temp6){

        this.lst1 = temp5;
        this.lst2 = temp6;


    }
    public  void set_adt_rv_cur_2y1s2(ArrayList<String> temp5, ArrayList<String> temp6){

        this.lst3 = temp5;
        this.lst4 = temp6;


    }
    public  void set_adt_rv_cur_2y2(ArrayList<String> temp5, ArrayList<String> temp6, ArrayList<String> temp7, ArrayList<String> temp8){

        this.lst5 = temp5;
        this.lst6 = temp6;
        this.lst7 = temp7;
        this.lst8 = temp8;


    }
    public  void set_adt_rv_cur_2y3(ArrayList<String> temp9, ArrayList<String> temp10, ArrayList<String> temp11, ArrayList<String> temp12){

        this.lst9 = temp9;
        this.lst10 = temp10;
        this.lst11 = temp11;
        this.lst12 = temp12;


    }
    public  void set_adt_rv_cur_2y4(ArrayList<String> temp13, ArrayList<String> temp14, ArrayList<String> temp15, ArrayList<String> temp16){

        this.lst13 = temp13;
        this.lst14 = temp14;
        this.lst15 = temp15;
        this.lst16 = temp16;


    }

    public void set_adt_rv_cur_2collect(ArrayList<String> temp17){

        this.CollectCourse = temp17;


    }

    public void set_adt_rv_cur_2collectNotpass(ArrayList<String> temp18){

        this.CollectCourseNotPass = temp18;


    }

    public void set_adt_rv_cur_2preNotPass(ArrayList<String> temp19){

        this.PreNotPass = temp19;
    }

    public void set_adt_rv_cur_2cuurent(ArrayList<String> temp20){

        this.CurrentCourse = temp20;
    }

    public void set_adt_rv_cur_2prePass(ArrayList<String> temp21){

        this.PrePass = temp21;
    }





    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;
        public TextView tvItems4;
        public TextView tvItems5;
        public TextView tvItems6;
        public TextView tvItems7;
        public TextView tvItems8;
        public TextView tvItems9;
        public TextView tvItems10;

        public  ViewHolder(final View view, final onItemClickListener listener){

            super(view);
            tvItems = (TextView)view.findViewById(R.id.textView1);
            tvItems2 = (TextView)view.findViewById(R.id.textView2);
            tvItems3 = (TextView)view.findViewById(R.id.textView3);
            tvItems4 = (TextView)view.findViewById(R.id.textView4);
            tvItems5 = (TextView)view.findViewById(R.id.textView5);
            tvItems6 = (TextView)view.findViewById(R.id.textView6);
            tvItems7 = (TextView)view.findViewById(R.id.textView7);
            tvItems8 = (TextView)view.findViewById(R.id.textView8);
            tvItems9 = (TextView)view.findViewById(R.id.textView9);
            tvItems10 = (TextView)view.findViewById(R.id.textView10);

            tvItems3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText3ColorChange(position);

                        }
                    }
                }
            });

            tvItems4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText4ColorChange(position);

                        }
                    }
                }
            });

            tvItems5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText5ColorChange(position);

                        }
                    }
                }
            });

            tvItems6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText6ColorChange(position);

                        }
                    }
                }
            });

            tvItems7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText7ColorChange(position);

                        }
                    }
                }
            });


            tvItems8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText8ColorChange(position);

                        }
                    }
                }
            });

            tvItems9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText9ColorChange(position);

                        }
                    }
                }
            });


            tvItems10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onText10ColorChange(position);

                        }
                    }
                }
            });






        }
    }
}
