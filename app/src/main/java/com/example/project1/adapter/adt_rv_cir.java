package com.example.project1.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_cir extends RecyclerView.Adapter<adt_rv_cir.ViewHolder> {

    ArrayList<String> lst1 = new ArrayList<String>();
    ArrayList<String> lst2 = new ArrayList<String>();
    ArrayList<String> lst3 = new ArrayList<String>();
    ArrayList<String> lst4 = new ArrayList<String>();

    ArrayList<String> lst5 = new ArrayList<String>();
    ArrayList<String> lst6 = new ArrayList<String>();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_cir, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){

        if((i+1)%2==0){
            viewHolder.cardView1.setCardBackgroundColor(0xFF1bce90);

        }
        else {
            viewHolder.cardView1.setCardBackgroundColor(0xFF76f46f);
        }

        viewHolder.tvItems.setText(lst1.get(i));
        viewHolder.tvItems2.setText(lst2.get(i));
        viewHolder.tvItems3.setText(lst3.get(i));
        viewHolder.tvItems4.setText(lst4.get(i));

        viewHolder.tvItems9.setText(lst5.get(i));
        viewHolder.tvItems10.setText(lst6.get(i));



    }

    @Override
    public int getItemCount(){

        return lst1.size();
    }

    public void set_adt_rv_cir(ArrayList<String> temp, ArrayList<String> temp2, ArrayList<String> temp3, ArrayList<String> temp4){
        this.lst1 = temp;
        this.lst2 = temp2;
        this.lst3 = temp3;
        this.lst4 = temp4;

    }

    public  void set_adt_rv_cir_2(ArrayList<String> temp5, ArrayList<String> temp6){

        this.lst5 = temp5;
        this.lst6 = temp6;



    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;
        public TextView tvItems4;
        public CardView cardView1;

        public TextView tvItems9;
        public TextView tvItems10;



        public  ViewHolder(View view){
            super(view);
            tvItems = (TextView)view.findViewById(R.id.textView1);
            tvItems2 = (TextView)view.findViewById(R.id.textView2);
            tvItems3 = (TextView)view.findViewById(R.id.textView3);
            tvItems4 = (TextView)view.findViewById(R.id.textView4);
            cardView1 = (CardView)view.findViewById(R.id.cardview1);

            tvItems9 = (TextView)view.findViewById(R.id.textView9);
            tvItems10 = (TextView)view.findViewById(R.id.textView10);





        }
    }










}
