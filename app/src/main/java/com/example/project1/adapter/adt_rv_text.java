package com.example.project1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_text extends RecyclerView.Adapter<adt_rv_text.ViewHolder> {


    List<String> lst;
    List<String> lst2;
    List<String> lst3;
    List<String> lst4;
    public adt_rv_text(){
        lst = new ArrayList<String>();
        lst2 = new ArrayList<String>();
        lst3 = new ArrayList<String>();
        lst4 = new ArrayList<String>();
        lst.add("Android");
        lst.add("Apple");
        lst.add("Java");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");

        //

        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");
        lst.add("Ios");



        //
        lst2.add("Android2");
        lst2.add("Apple2");
        lst2.add("Java2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");
        lst2.add("Ios2");

        lst3.add("Android3");
        lst3.add("Apple3");
        lst3.add("Java3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");
        lst3.add("Ios3");


        lst4.add("Android4");
        lst4.add("Apple4");
        lst4.add("Java4");
        lst4.add("Ios4");
        lst4.add("Ios4");
        lst4.add("Ios4");
        lst4.add("Ios4");
        lst4.add("Ios4");
        lst4.add("Ios4");
        lst4.add("Ios4");


    }





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.tvItems.setText(lst.get(i));
        viewHolder.tvItems2.setText(lst2.get(i));
        viewHolder.tvItems3.setText(lst3.get(i));
        viewHolder.tvItems4.setText(lst4.get(i));
    }

    @Override
    public int getItemCount(){

        return lst.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;
        public TextView tvItems4;

        public  ViewHolder(View view){
            super(view);
            tvItems = (TextView)view.findViewById(R.id.tvItems);
            tvItems2 = (TextView)view.findViewById(R.id.tvItems2);
            tvItems3 = (TextView)view.findViewById(R.id.tvItems3);
            tvItems4 = (TextView)view.findViewById(R.id.tvItems4);

        }
    }
}
