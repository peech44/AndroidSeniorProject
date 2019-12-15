package com.example.project1.adapterDay;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

public class adt_rv_dayfri extends RecyclerView.Adapter<adt_rv_dayfri.ViewHolder> {


    List<String> lst1 = new ArrayList<String>();
    List<String> lst2 = new ArrayList<String>();
    List<String> lst3 = new ArrayList<String>();
    List<String> lst4 = new ArrayList<String>();

    List<String> lst5 = new ArrayList<String>();
    List<String> lst6 = new ArrayList<String>();


    @Override
    public adt_rv_dayfri.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_dayfri, viewGroup, false);

        adt_rv_dayfri.ViewHolder viewHolder = new adt_rv_dayfri.ViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){

        /*if((i+1)%2==0){
            viewHolder.cardView1.setCardBackgroundColor(0xFF1bce90);

        }
        else {
            viewHolder.cardView1.setCardBackgroundColor(0xFF76f46f);
        }*/

        viewHolder.tvItems.setText(lst1.get(i));
        viewHolder.tvItems2.setText(lst2.get(i));
        viewHolder.tvItems3.setText(lst3.get(i));
        viewHolder.tvItems4.setText(lst4.get(i));
        viewHolder.tvItems37.setText(lst5.get(i));



    }


    @Override
    public int getItemCount(){

        return lst1.size();
    }

    public void set_adt_rv_cir(List<String> temp, List<String> temp2, List<String> temp3, List<String> temp4 , List<String> temp5){
        this.lst1 = temp;
        this.lst2 = temp2;
        this.lst3 = temp3;
        this.lst4 = temp4;
        this.lst5 = temp5;

    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvItems;
        public TextView tvItems2;
        public TextView tvItems3;
        public TextView tvItems4;
        public CardView cardView1;

        public TextView tvItems37;





        public  ViewHolder(View view){
            super(view);
            tvItems = (TextView)view.findViewById(R.id.textView1);
            tvItems2 = (TextView)view.findViewById(R.id.textView2);
            tvItems3 = (TextView)view.findViewById(R.id.textView9);
            tvItems4 = (TextView)view.findViewById(R.id.textView8);
            cardView1 = (CardView)view.findViewById(R.id.cardview1);
            tvItems37 = (TextView)view.findViewById(R.id.textView37);







        }
    }

}
