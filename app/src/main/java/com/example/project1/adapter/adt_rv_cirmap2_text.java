package com.example.project1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cirmap2_text extends RecyclerView.Adapter<adt_rv_cirmap2_text.ViewHolder> {



    List<String> lst4 = new ArrayList<String>();
    List<String> lst5 = new ArrayList<String>();
    List<String> lst6 = new ArrayList<String>();
    List<String> lst4check = new ArrayList<String>();

    List<String> lst5check = new ArrayList<String>();



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_cirmap2, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.tvItems4.setText(lst4.get(i));

        for(int k=0; k<lst5check.size(); k++){
            if(lst4.get(i).equals(lst5check.get(k))){

                viewHolder.tvItems4.setBackgroundColor(0xFFFF0027);
            }
        }

        for(int j=0;j<lst4check.size();j++){
            if(lst4.get(i).equals(lst4check.get(j))){
                Log.d("adt_rv_lstM", lst4.get(i)+" : "+lst4check.get(j));
                viewHolder.tvItems4.setBackgroundColor(0xFFFF9800);
                //viewHolder.tvItems.setBackgroundColor(Color.parseColor())


            }


        }

        //viewHolder.tvItems2.setText(lst2.get(i));
        //viewHolder.tvItems3.setText(lst3.get(i));

        if(i < lst5.size()){
            viewHolder.tvItems5.setText(lst5.get(i));

            for(int k=0; k<lst5check.size(); k++){
                if(lst5.get(i).equals(lst5check.get(k))){

                    viewHolder.tvItems5.setBackgroundColor(0xFFFF0027);
                }
            }

            for(int j=0;j<lst4check.size();j++){

                if(lst5.get(i).equals(lst4check.get(j))){
                    viewHolder.tvItems5.setBackgroundColor(0xFFFF9800);
                }


            }
        }
        if(i < lst6.size()){
            viewHolder.tvItems6.setText(lst6.get(i));

            for(int k=0; k<lst5check.size(); k++){
                if(lst6.get(i).equals(lst5check.get(k))){

                    viewHolder.tvItems6.setBackgroundColor(0xFFFF0027);
                }
            }

            for(int j=0;j<lst4check.size();j++){

                if(lst6.get(i).equals(lst4check.get(j))){
                    viewHolder.tvItems6.setBackgroundColor(0xFFFF9800);
                }


            }
        }

    }

    @Override
    public int getItemCount(){

        return lst4.size();
    }

    public void set_adt_rv_cirmap2_text(List<String> temp4, List<String> temp5, List<String> temp6){
        this.lst4 = temp4;
        this.lst5 = temp5;
        this.lst6 = temp6;
    }
    public void set_collect_course2(List<String> temp_collect_course, List<String> temp2_collect_course){
        this.lst4check = temp_collect_course;
        this.lst5check = temp2_collect_course;

        for(int i=0; i<this.lst4check.size();i++) {
            Log.d("adt_rv_c lst4M", lst4check.get(i));
        }
        for(int i=0; i<this.lst5check.size();i++) {
            Log.d("adt_rv_c lst5M", lst5check.get(i));
        }
    }





    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems4;
        public TextView tvItems5;
        public TextView tvItems6;


        public  ViewHolder(View view){
            super(view);
            tvItems4 = (TextView)view.findViewById(R.id.tvItems4);
            tvItems5 = (TextView)view.findViewById(R.id.tvItems5);
            tvItems6 = (TextView)view.findViewById(R.id.tvItems6);




        }
    }
}
