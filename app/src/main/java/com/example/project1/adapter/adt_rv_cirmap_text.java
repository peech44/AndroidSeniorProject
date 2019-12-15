package com.example.project1.adapter;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cirmap_text extends RecyclerView.Adapter<adt_rv_cirmap_text.ViewHolder> {

    List<String> lst = new ArrayList<String>();
    List<String> lst2 = new ArrayList<String>();
    List<String> lst3 = new ArrayList<String>();
    //size of collect course
    List<String> lst4check = new ArrayList<String>();
    //size of collect course not pass
    List<String> lst5check = new ArrayList<String>();







    //
    public adt_rv_cirmap_text(){
        //lst = new ArrayList<String>();
        //lst2 = new ArrayList<String>();
        //lst3 = new ArrayList<String>();

       /* lst.add("Android");
        lst.add("Apple");
        lst.add("Java");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
*/

        //
        /*lst2.add("Android2");
        lst2.add("Apple2");
        lst2.add("Java2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");*/

       /* lst3.add("Android3");
        lst3.add("Apple3");
        lst3.add("Java3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");*/





    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_cirmap, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }




    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.tvItems.setText(lst.get(i));

        for(int k=0; k<lst5check.size(); k++){
            if(lst.get(i).equals(lst5check.get(k))){
                Log.d("adt_rv_lst", lst.get(i)+" : "+lst5check.get(k));
                viewHolder.tvItems.setBackgroundColor(0xFFFF0027);
            }
        }


        for(int j=0;j<lst4check.size();j++){
            if(lst.get(i).equals(lst4check.get(j))){
                Log.d("adt_rv_lst", lst.get(i)+" : "+lst4check.get(j));
                viewHolder.tvItems.setBackgroundColor(0xFFFF9800);
                //viewHolder.tvItems.setBackgroundColor(Color.parseColor())


            }


        }

        //example to set color bg
        //viewHolder.tvItems.setBackgroundColor(0xFFFF9800);

        /*if(lst2.get(i).equals(lst4check)){
            viewHolder.tvItems.setBackgroundColor(0xFFFF9800);
        }
        if(lst3.get(i).equals(lst4check)){
            viewHolder.tvItems.setBackgroundColor(0xFFFF9800);
        }*/
        if(i < lst2.size()){
            viewHolder.tvItems2.setText(lst2.get(i));

            for(int k=0; k<lst5check.size(); k++){
                if(lst2.get(i).equals(lst5check.get(k))){

                    viewHolder.tvItems2.setBackgroundColor(0xFFFF0027);
                }
            }

            for(int j=0;j<lst4check.size();j++){

                if(lst2.get(i).equals(lst4check.get(j))){
                    viewHolder.tvItems2.setBackgroundColor(0xFFFF9800);
                }


            }

        }
        if(i < lst3.size()){
            viewHolder.tvItems3.setText(lst3.get(i));

            for(int k=0; k<lst5check.size(); k++){
                if(lst3.get(i).equals(lst5check.get(k))){

                    viewHolder.tvItems3.setBackgroundColor(0xFFFF0027);
                }
            }

            for(int j=0;j<lst4check.size();j++){

                if(lst3.get(i).equals(lst4check.get(j))){
                    viewHolder.tvItems3.setBackgroundColor(0xFFFF9800);
                }

            }
        }



    }

    @Override
    public int getItemCount(){

        return lst.size();
    }




    public void set_adt_rv_cirmap_text(List<String> temp, List<String> temp2, List<String> temp3){
        this.lst = temp;
        this.lst2 = temp2;
        this.lst3 = temp3;
    }

    public void set_collect_course(List<String> temp_collect_course, List<String> temp2_collect_course){
        this.lst4check = temp_collect_course;
        this.lst5check = temp2_collect_course;
        for(int i=0; i<this.lst4check.size();i++) {
            Log.d("adt_rv_c lst4", lst4check.get(i));
        }
        for(int i=0; i<this.lst5check.size();i++) {
            Log.d("adt_rv_c lst5", lst5check.get(i));
        }
    }









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
