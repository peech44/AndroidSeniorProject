package com.example.project1.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cirmap1_2_text extends RecyclerView.Adapter<adt_rv_cirmap1_2_text.ViewHolder> {


    //ไว้ test firebase กับ collect course
    //ไม่ได้ใช้แล้ว


    List<String> lst = new ArrayList<String>();
    List<String> lst2 = new ArrayList<String>();
    List<String> lst3 = new ArrayList<String>();
    List<String> result_Ccourse = new ArrayList<String>();




    @Override
    public adt_rv_cirmap1_2_text.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_cirmap1_2, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){


        viewHolder.tvItems.setText(lst.get(i));
        viewHolder.tvItems.setBackgroundColor(0x00FFFFFF);
        if(i < lst2.size()){
            viewHolder.tvItems2.setText(lst2.get(i));
            viewHolder.tvItems2.setBackgroundColor(0x00FFFFFF);
        }

        if(i < lst3.size()){
            viewHolder.tvItems3.setText(lst3.get(i));
            viewHolder.tvItems3.setBackgroundColor(0x00FFFFFF);
        }

       //
        //result_Ccourse = lst;
        //calRedCourse(lst, lst2);
       /* int count;
        if(lst2.size() > lst.size()){
            count = lst2.size();

            Log.d("adt lst2 size", ""+lst2.size());
            Log.d("adt lst size", ""+lst.size());
            for(int j=0;j<lst.size();j++) {
                for (int i2 = 0; i2 < count; i2++) {
                    Log.d("adt lst get j", ""+lst.get(j));
                    Log.d("adt lst2 get i2", ""+lst2.get(i2));
                    if (lst.get(j).equals(lst2.get(i2))) {
                        result_Ccourse.remove(j);

                    } else {

                    }

                }
            }
        }
        else {
            count = lst.size();

            for(int j=0;j<lst2.size();j++) {
                for (int i2 = 0; i2 < count; i2++) {
                    if (lst2.get(j).equals(lst.get(i2))) {

                        result_Ccourse.remove(i2);
                    } else {

                    }

                }
            }
        }*/





    }


    @Override
    public int getItemCount(){

        return lst.size();
    }

    //firebase
    public void set_adt_rv_cirmap1_2_text1(List<String> temp){
        this.lst = temp;


    }
    //collect data
    public void set_adt_rv_cirmap1_2_text2(List<String> temp2){
        this.lst2 = temp2;


    }

   /* public void calRedCourse(){
        result_Ccourse = lst;
        int count;
        if(lst2.size() > lst.size()){
            count = lst2.size();

            for(int j=0;j<lst.size();j++) {
                for (int i = 0; i < count; i++) {
                    if (lst.get(j).equals(lst2.get(i))) {
                        result_Ccourse.remove(j);

                    } else {

                    }

                }
            }
        }
        else {
            count = lst.size();

            for(int j=0;j<lst2.size();j++) {
                for (int i = 0; i < count; i++) {
                    if (lst2.get(j).equals(lst.get(i))) {

                        result_Ccourse.remove(i);
                    } else {

                    }

                }
            }
        }
    }*/




    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;


        public  ViewHolder(View view){
            super(view);
            tvItems = (TextView)view.findViewById(R.id.tvItems);
            tvItems2 = (TextView)view.findViewById(R.id.tvItems2);
            tvItems3 = (TextView)view.findViewById(R.id.tvItems3);


        }
    }

}
